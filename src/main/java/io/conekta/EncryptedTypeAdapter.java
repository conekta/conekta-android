package io.conekta;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import javax.crypto.Cipher;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

public class EncryptedTypeAdapter extends TypeAdapter<String> {

    private static final String PUBLIC_KEY_PEM = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjet2Jm4iPJTqDlW64tEG\nI9/dJTJAcn3OQdHrEwNXCz0/Rewqcv/Hm+V0klsUiS9h2W5CLC42q6wGhtl9Buu5\nvefuLVyxc8klEEjrSz/5AgfZ4HvzatbVX0KQhHI1j+caOjatDHM/ih13Rj7HIJFn\nAcutRB9vyFiCVluqRhlB9/64sqGtVmxJAir7WJp4TmpPvSEqeGKQIb80Tq+FYY7f\ntpMxQpsBT8B6y4Kn95ZfDH72H3yJezs/mExVB3M/OCBg+xt/c3dXp65JsbS482c4\nKhkxxHChNn1Y/nZ8kFYzakRGhh0BMqkvkqtAwcQJK1xPx2jRELS1vj7OFfMR+3ms\nSQIDAQAB\n-----END PUBLIC KEY-----";

    private PublicKey publicKey;

    public EncryptedTypeAdapter() throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        this.publicKey = loadPublicKey(PUBLIC_KEY_PEM);
    }

    @Override
    public void write(JsonWriter out, String value) throws IOException {
        try {
            out.value(encrypt(value, publicKey));
        } catch (Exception e) {
            throw new IOException("Error encrypting value", e);
        }
    }

    @Override
    public String read(JsonReader in) throws IOException {
        return in.nextString();
    }

    public static String encrypt(String plainText, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
        return Base64.toBase64String(encryptedBytes);
    }

    private PublicKey loadPublicKey(String publicKeyPem) throws Exception {
        byte[] keyBytes = Base64.decode(publicKeyPem.replaceAll("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll("-----END PUBLIC KEY-----", "").replaceAll("\\s+", ""));
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        return KeyFactory.getInstance("RSA").generatePublic(spec);
    }
}
