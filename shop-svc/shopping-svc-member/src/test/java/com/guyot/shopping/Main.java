package com.guyot.shop;

import java.security.Provider;
import java.security.Security;

public class Main {
    public static void main(String[] args) {
        Provider[] providers = Security.getProviders();
        for (Provider provider : providers) {
            System.out.println(provider.toString());
        }
    }
}
