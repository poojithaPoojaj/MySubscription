package com.testvagrant.mysubsriptions.newspaper;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class NewsPaperDetailsTest {

    @Test
    public void checkAllNewsPaperDetailsAreStoring(){
        NewsPaperDetails newsPaperDetails=new NewsPaperDetails();
       int sizeOfAllNewspapers= newsPaperDetails.getDetails().size();
        Assert.assertEquals(5,sizeOfAllNewspapers);
    }

    @Test
    public void checkTotalPricesDetailsAreCorrect(){
        NewsPaperDetails newsPaperDetails=new NewsPaperDetails();
        HashMap<NewsPaperType,Double> details=newsPaperDetails.getDetails();
        Assert.assertEquals(10.5,details.get(NewsPaperType.BM));
        Assert.assertEquals(20.5,details.get(NewsPaperType.HINDU));
        Assert.assertEquals(26.0,details.get(NewsPaperType.TOI));
        Assert.assertEquals(34.0,details.get(NewsPaperType.ET));
        Assert.assertEquals(18.0,details.get(NewsPaperType.HT));
    }

}