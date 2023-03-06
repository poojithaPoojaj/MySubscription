package com.testvagrant.mysubsriptions;

import com.testvagrant.mysubsriptions.newspaper.NewsPaperDetails;
import com.testvagrant.mysubsriptions.newspaper.NewsPaperType;

import java.util.ArrayList;
import java.util.HashMap;

public class SubscriptionCalculator {

    public ArrayList<ArrayList<NewsPaperType>> generateCombinations(ArrayList<NewsPaperType> NewsPaperTypes, ArrayList<Double> prices, int budget) {
        ArrayList<ArrayList<NewsPaperType>> allCombinations=new ArrayList<>();

        for(int i=0;i<prices.size();i++){
            for(int j=i+1;j<prices.size();j++){
                if(prices.get(i)+prices.get(j)<=budget) {
                    ArrayList<NewsPaperType> currentCombinations=new ArrayList<>();
                    currentCombinations.add(NewsPaperTypes.get(i));
                    currentCombinations.add(NewsPaperTypes.get(j));
                    allCombinations.add(currentCombinations);
                }
            }
        }
   return allCombinations;
    }
    public ArrayList<ArrayList<NewsPaperType>> getCombinations(int userBudget){
        HashMap<NewsPaperType,Double> details=new NewsPaperDetails().getDetails();
        ArrayList<NewsPaperType> NewsPaperTypes = new ArrayList<>(details.keySet());
        ArrayList<Double> prices = new ArrayList<>(details.values());
       return generateCombinations(NewsPaperTypes, prices,userBudget);
    }
    public void getAndPrintCombinations(int userBudget){
        ArrayList<ArrayList<NewsPaperType>> combinations=getCombinations(userBudget);
       for(int i=0;i<combinations.size();i++){
           System.out.println("{"+combinations.get(i).get(0)+","+combinations.get(i).get(1)+"}");
       }
    }


}
