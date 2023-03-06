package com.testvagrant.mysubsriptions.newspaper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceCalculator {
        public String day;
        private double cost;
    public PriceCalculator(){
    }
       public PriceCalculator(String day,double cost){
           this.day=day;
           this.cost=cost;
       }

    public double getCost() {
        return cost;
    }
    public double getTotalPrice(List<Double> prices){
        double totalPrice=0;
 for(int i=0;i<prices.size();i++)
{
    totalPrice+=prices.get(i);
}
return totalPrice;
    }
}
