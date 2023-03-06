package com.testvagrant.mysubsriptions.newspaper;


import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperTest {

    @Test
    public void checkDetailsAreStoringCorrectly() {
        List<Double> prices = new ArrayList<>();

        prices.add(new PriceCalculator("Monday", 1).getCost());
        prices.add(new PriceCalculator("Tuesday", 2).getCost());
        prices.add(new PriceCalculator("Wednesday", 3).getCost());
        prices.add(new PriceCalculator("Thursday", 4).getCost());
        prices.add(new PriceCalculator("Friday", 5).getCost());
        prices.add(new PriceCalculator("Saturday", 6).getCost());
        prices.add(new PriceCalculator("Sunday", 7).getCost());

        NewsPaper newspaper = new NewsPaper(NewsPaperType.BM, prices);

        Assert.assertEquals(NewsPaperType.BM, newspaper.getName());

        List<Double> pricesList = newspaper.getPrices();
        Assert.assertEquals(7, pricesList.size());
        Assert.assertEquals(Double.valueOf(1), pricesList.get(0));
        Assert.assertEquals(Double.valueOf(2), pricesList.get(1));
        Assert.assertEquals(Double.valueOf(3), pricesList.get(2));
        Assert.assertEquals(Double.valueOf(4), pricesList.get(3));
        Assert.assertEquals(Double.valueOf(5), pricesList.get(4));
        Assert.assertEquals(Double.valueOf(6), pricesList.get(5));
        Assert.assertEquals(Double.valueOf(7), pricesList.get(6));
    }
}