package com.testvagrant.mysubsriptions.newspaper;

import java.util.List;

public class NewsPaper {
    NewsPaperType name;
    List<Double> prices;

    public NewsPaper(NewsPaperType name, List<Double> prices){
        this.name=name;
        this.prices=prices;
    }

    public NewsPaperType getName() {
        return name;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public double getNewsPaperWeeklyPrice(){
       return new PriceCalculator().getTotalPrice(this.prices);
    }
}
