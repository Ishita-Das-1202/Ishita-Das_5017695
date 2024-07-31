package com.forecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods is 0, return the present value
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case: calculate the future value for the next period
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast();

        double presentValue = 1000.0;  // Initial value
        double growthRate = 0.05;      // 5% growth rate
        int periods = 10;              // Number of periods

        double futureValue = forecast.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: " + futureValue);
    }
}
