package com.example.observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp1");
        Observer webApp = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setPrice(100.00);
        System.out.println();
        stockMarket.setPrice(105.50);
        System.out.println();

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setPrice(110.00);
    }
}
