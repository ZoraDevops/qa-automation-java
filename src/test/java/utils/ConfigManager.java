package utils;

public class ConfigManager {
    public static String getBaseUrl(String env) {
        switch (env.toUpperCase()) {
            case "QA":
                return "https://www.google.com?q=qa";
            case "UAT":
                return "https://www.google.com?q=uat";
            case "PROD":
                return "https://www.google.com?q=prod";
            default:
                return "https://www.google.com";
        }
    }
}
