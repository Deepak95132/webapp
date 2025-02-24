package com.cloudx.webapp;

public class YourJavaApp {
    public static void main(String[] args) {
        String token = System.getenv("OIDC_TOKEN");
        System.out.println("Token Retrieved in Java App: " + token);
        System.out.println("Token length: " + token.length());
System.out.println("Token starts with: " + token.substring(0, token.length()-1));

        // Use the token for API calls or other logic
    }
}
