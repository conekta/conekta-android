package io.conekta;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.util.encoders.Base64;

public class EncryptedTypeAdapter  {

    private static final String PUBLIC_KEY_PEM = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjet2Jm4iPJTqDlW64tEG\nI9/dJTJAcn3OQdHrEwNXCz0/Rewqcv/Hm+V0klsUiS9h2W5CLC42q6wGhtl9Buu5\nvefuLVyxc8klEEjrSz/5AgfZ4HvzatbVX0KQhHI1j+caOjatDHM/ih13Rj7HIJFn\nAcutRB9vyFiCVluqRhlB9/64sqGtVmxJAir7WJp4TmpPvSEqeGKQIb80Tq+FYY7f\ntpMxQpsBT8B6y4Kn95ZfDH72H3yJezs/mExVB3M/OCBg+xt/c3dXp65JsbS482c4\nKhkxxHChNn1Y/nZ8kFYzakRGhh0BMqkvkqtAwcQJK1xPx2jRELS1vj7OFfMR+3ms\nSQIDAQAB\n-----END PUBLIC KEY-----";

    private PublicKey loadPublicKey(String publicKeyPem) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] keyBytes = Base64.decode(publicKeyPem.replaceAll("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll("-----END PUBLIC KEY-----", "").replaceAll("\\s+", ""));
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        return KeyFactory.getInstance("RSA").generatePublic(spec);

    }

    public  String encryptValue(String plainText)  {
        try {
            PublicKey publicKey = loadPublicKey(PUBLIC_KEY_PEM);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
            return Base64.toBase64String(encryptedBytes);
        }catch (Exception e){
            return plainText;
        }
    }
}
