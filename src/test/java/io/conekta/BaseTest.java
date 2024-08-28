package io.conekta;

public class BaseTest {
    private static final String defaultBasePath = "http://localhost:3000";
    public static String getBasePath(){
        String basePath = System.getenv("BASE_PATH");
        if (basePath == null || basePath.isEmpty()) {
            return defaultBasePath;
        }
        return basePath;
    }
}