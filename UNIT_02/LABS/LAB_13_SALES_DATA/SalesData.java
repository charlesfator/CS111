public class SalesData {

    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        double[] salesData = new double[MONTHS_IN_YEAR]; // Array to hold sales data
        double annualTotal = 0;
        double highestSales = 0;
        int highestMonth = 0;

        // Print the header
        UtilityBelt.printCentered(30, "River's End Sales Data");
        System.out.println();

        // Collect sales data for each month
        for (int i = 0; i < MONTHS_IN_YEAR; i++) {
            salesData[i] = UtilityBelt.readDouble("Please enter the data for month " + (i + 1) + ": ", 0, Double.MAX_VALUE);

            // Track highest sales and the corresponding month for Hacker's Challenge
            if (salesData[i] > highestSales) {
                highestSales = salesData[i];
                highestMonth = i + 1; // Store month as 1-indexed
            }

            // Add to the annual total
            annualTotal += salesData[i];
        }

        // Calculate and display quarterly totals
        double q1Total = salesData[0] + salesData[1] + salesData[2];
        double q2Total = salesData[3] + salesData[4] + salesData[5];
        double q3Total = salesData[6] + salesData[7] + salesData[8];
        double q4Total = salesData[9] + salesData[10] + salesData[11];
        System.out.printf("\nThe first quarter total is %.2f\n", q1Total);
        System.out.printf("The second quarter total is %.2f\n", q2Total);
        System.out.printf("The third quarter total is %.2f\n", q3Total);
        System.out.printf("The fourth quarter total is %.2f\n", q4Total);

        // Display the annual total
        System.out.printf("\nThe Annual Sales Total is %.2f\n", annualTotal);

        // Hacker's Challenge: Display the highest volume month
        System.out.printf("\nThe highest sales volume was in month %d with $%.2f\n", highestMonth, highestSales);
    }
}