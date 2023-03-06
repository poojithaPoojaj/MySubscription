package com.testvagrant.mysubsriptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Enter option to choose \n1.Enter budget to know subscription \n2.Exit");
            int value=input.nextInt();
            if(value==1){
                System.out.println("Enter Budget Value");
                int userBudget=input.nextInt();
                SubscriptionCalculator subscriptionCalculator=new SubscriptionCalculator();
                subscriptionCalculator.getAndPrintCombinations(userBudget);
            }
            else{
                System.out.println("Program Ended");
                System.exit(0);
            }

        }
    }
}
