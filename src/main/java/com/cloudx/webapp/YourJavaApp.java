package com.cloudx.webapp;

public class YourJavaApp {
    public static void main(String[] args) {
        String token = System.getenv("OIDC_TOKEN");
        System.out.println("Token Retrieved in Java App: " + token);
        System.out.println("Token length: " + token.length());
System.out.println("Token starts with: " + token.substring(0, token.length()-1));
        System.out.println("Token starts with: " + token.substring(token.length()-5, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length()-5, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length()-5, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length()-4, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length()-3, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length()-2, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length()-1, token.length()));
        System.out.println("Token starts with: " + token.substring(token.length(), token.length()-2));
        System.out.println("Token starts with: " + token.substring(token.length(), token.length()-3));

        // Use the token for API calls or other logic
    }
}
