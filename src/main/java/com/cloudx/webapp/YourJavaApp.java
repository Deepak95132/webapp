package com.cloudx.webapp;

public class YourJavaApp {
    public static void main(String[] args) {
        String token = System.getenv("OIDC_TOKEN");
        System.out.println("Token Retrieved in Java App: " + token);

        // Use the token for API calls or other logic
    }
}
