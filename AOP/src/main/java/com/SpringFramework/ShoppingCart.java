package com.SpringFramework;


import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout() {
        System.out.println("Checkout Method from ShoppingCart Called");
    }
}
