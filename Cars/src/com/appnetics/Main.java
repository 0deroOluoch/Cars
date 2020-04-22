package com.appnetics;

public class Main {

    public static void main(String[] args) {
        //taking the car names from command line and storing it in array of string
        String car[]={args[0],args[2],args[4]};


        //taking selling price from command line and storing it in array of double
        double price[]={Double.valueOf(args[1]),Double.valueOf(args[3]),Double.valueOf(args[5])};
        double profit[]=new double[3];
        double fiSell[]=new double[3];
        int i;

        //for calculating the profit
        for(i=0;i<3;i++)
            {
             profit[i]=(70.30/100)*price[i];
            }

        //for calculating the final selling price

        for(i=0;i<3;i++)
            {
                fiSell[i]= price[i] + profit[i];
            }

        //displaying the information make changes according to you for displaying

        for(i=0;i<3;i++)
            {   int j=i+1;
                System.out.println("\n\n*********************************************************************************************");
                System.out.println("Details of "+ j+" :");
                System.out.println("\n Car Name: "+ car[i]+"\n Selling Price: "+price[i]+"\n Profit: "+profit[i]+"\n Final Selling Price: "+fiSell[i]);
            }
    }
}
