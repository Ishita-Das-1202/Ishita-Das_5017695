package com.example.proxy;

public class ProxyPatternTest {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Images will be loaded from remote server
        image1.display();
        System.out.println("");

        // Images will not be loaded from remote server again
        image1.display();
        System.out.println("");

        image2.display();
        System.out.println("");

        // Images will not be loaded from remote server again
        image2.display();
    }
}
