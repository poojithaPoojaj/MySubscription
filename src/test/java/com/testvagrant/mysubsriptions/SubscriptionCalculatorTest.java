package com.testvagrant.mysubsriptions;

import com.testvagrant.mysubsriptions.newspaper.NewsPaperDetails;
import com.testvagrant.mysubsriptions.newspaper.NewsPaperType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

@Test
public class SubscriptionCalculatorTest {

    @Test
    public void checkAllCombinationsAreGettingByEnteringSampleUserBudget(){
        SubscriptionCalculator subscriptionCalculator=new SubscriptionCalculator();
        int totalCombinations=subscriptionCalculator.getCombinations(40).size();
        Assert.assertEquals(4,totalCombinations);

        int totalCombinations2=subscriptionCalculator.getCombinations(35).size();
        Assert.assertEquals(2,totalCombinations2);
    }

}