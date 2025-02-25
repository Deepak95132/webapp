package com.cloudx.webapp;

public class YourJavaApp {
    public static void main(String[] args) {
        String token = System.getenv("OIDC_TOKEN");
        System.out.println("Token Retrieved in Java App: " + token);
        System.out.println("Token length: " + token.length());
        System.out.println("Token starts with: " + token.substring(0, token.length()-1));
        System.out.println("Token starts with: " + token.substring(1020, 1024));
        System.out.println("Token starts with: " + token.substring(1, 1024));
       

       
    }
}
