package com.testvagrant.mysubsriptions.newspaper;

import java.util.List;

public class NewsPaper {
    NewsPaperType NewsPaperType;
    List<Double> prices;

    public NewsPaper(NewsPaperType NewsPaperType, List<Double> prices){
        this.NewsPaperType=NewsPaperType;
        this.prices=prices;
    }

    public NewsPaperType getNewsPaperType() {
        return NewsPaperType;
    }
    public double getNewsPaperWeeklyPrice(){
       return new PriceCalculator().getTotalPrice(this.prices);
    }
}
