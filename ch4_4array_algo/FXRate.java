package ch4_4array_algo;

import java.util.Currency;

public class FXRate {
    private String fromCurrency;
    private String toCurrency;
    double rate;
    String rateDate;

    public FXRate(String fromCurrency, String toCurrency, double rate, String rateDate){
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;

        this.rate = rate;
        this.rateDate = rateDate;
    }

}
