package com.testvagrant.mysubsriptions.newspaper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class NewsPaperDetails {
        HashMap<NewsPaperType,Double> newspaperDetails=new LinkedHashMap<>();
        public NewsPaperDetails(){
            this.setDetailsForTOI();
            this.setDetailsForHindu();
            this.setDetailsForET();
            this.setDetailsForBM();
            this.setDetailsForHT();
        }
        public HashMap<NewsPaperType,Double> getDetails(){
            return this.newspaperDetails;
        }
        public void setDetailsForHindu(){
            List<Double> prices=new ArrayList<>();

            prices.add(new PriceCalculator("Monday",2.5).getCost());
            prices.add(new PriceCalculator("Tuesday",2.5).getCost());
            prices.add(new PriceCalculator("Wednesday",2.5).getCost());
            prices.add(new PriceCalculator("Thursday",2.5).getCost());
            prices.add(new PriceCalculator("Friday",2.5).getCost());
            prices.add(new PriceCalculator("Saturday",4).getCost());
            prices.add(new PriceCalculator("Sunday",4).getCost());

            NewsPaper newspaper=new NewsPaper(NewsPaperType.HINDU,prices);
            newspaperDetails.put(newspaper.getNewsPaperType(),newspaper.getNewsPaperWeeklyPrice());
        }
        public void setDetailsForTOI() {
            List<Double> prices = new ArrayList<>();

            prices.add(new PriceCalculator("Monday", 3).getCost());
            prices.add(new PriceCalculator("Tuesday", 3).getCost());
            prices.add(new PriceCalculator("Wednesday", 3).getCost());
            prices.add(new PriceCalculator("Thursday", 3).getCost());
            prices.add(new PriceCalculator("Friday", 3).getCost());
            prices.add(new PriceCalculator("Saturday", 5).getCost());
            prices.add(new PriceCalculator("Sunday", 6).getCost());

            NewsPaper newspaper = new NewsPaper(NewsPaperType.TOI, prices);
            newspaperDetails.put(newspaper.getNewsPaperType(),newspaper.getNewsPaperWeeklyPrice());
        }
        public void setDetailsForET(){
            List<Double> prices = new ArrayList<>();

            prices.add(new PriceCalculator("Monday", 4).getCost());
            prices.add(new PriceCalculator("Tuesday", 4).getCost());
            prices.add(new PriceCalculator("Wednesday", 4).getCost());
            prices.add(new PriceCalculator("Thursday", 4).getCost());
            prices.add(new PriceCalculator("Friday", 4).getCost());
            prices.add(new PriceCalculator("Saturday", 4).getCost());
            prices.add(new PriceCalculator("Sunday", 10).getCost());

            NewsPaper newspaper = new NewsPaper(NewsPaperType.ET, prices);
            newspaperDetails.put(newspaper.getNewsPaperType(),newspaper.getNewsPaperWeeklyPrice());

        }
        public void setDetailsForBM(){
            List<Double> prices = new ArrayList<>();

            prices.add(new PriceCalculator("Monday", 1.5).getCost());
            prices.add(new PriceCalculator("Tuesday", 1.5).getCost());
            prices.add(new PriceCalculator("Wednesday", 1.5).getCost());
            prices.add(new PriceCalculator("Thursday", 1.5).getCost());
            prices.add(new PriceCalculator("Friday", 1.5).getCost());
            prices.add(new PriceCalculator("Saturday", 1.5).getCost());
            prices.add(new PriceCalculator("Sunday", 1.5).getCost());

            NewsPaper newspaper = new NewsPaper(NewsPaperType.BM, prices);
            newspaperDetails.put(newspaper.getNewsPaperType(),newspaper.getNewsPaperWeeklyPrice());

        }
        public void setDetailsForHT(){
            List<Double> prices = new ArrayList<>();

            prices.add(new PriceCalculator("Monday", 2).getCost());
            prices.add(new PriceCalculator("Tuesday", 2).getCost());
            prices.add(new PriceCalculator("Wednesday", 2).getCost());
            prices.add(new PriceCalculator("Thursday", 2).getCost());
            prices.add(new PriceCalculator("Friday", 2).getCost());
            prices.add(new PriceCalculator("Saturday", 4).getCost());
            prices.add(new PriceCalculator("Sunday", 4).getCost());

            NewsPaper newspaper = new NewsPaper(NewsPaperType.HT, prices);
            newspaperDetails.put(newspaper.getNewsPaperType(),newspaper.getNewsPaperWeeklyPrice());

        }
    }


