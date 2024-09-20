

/*
 * Project Details
 * Charles Fator & Leo Azevedo
 * CS111
 * 09/13/24
 * 
 * Based on data from 2023 and rounded to more standard numbers
 * 
 */

public class Lab4_DACA_Typecasting {
    public static void main(String[] args) {
        // Declaration
        int TotalDACARecipients = 574398;
        int TotalDACAContributions = 2142200675;
        char FirstLetter = 'c';
        char SecondLetter = 'a';

        // Convertion
        double AverageDACAContrib = (double) TotalDACAContributions / TotalDACARecipients;
        int RoundedAverage = (int) AverageDACAContrib;
        double RoundedToHundredth = Math.round(AverageDACAContrib * 100.0) / 100.0;
        String StateWithMostRecipients = ("" + FirstLetter + SecondLetter).toUpperCase();

        // Output
        System.out.println("Average DACA-recipient Tax Contribution: $" + AverageDACAContrib);
        System.out.println("Rounded down to nearest whole dollar: $" + RoundedAverage);
        System.out.println("Rounded to nearest 2 decimal places: $" + RoundedToHundredth);
        System.out.println("State with most DACA recipients: " + StateWithMostRecipients);

    }
}