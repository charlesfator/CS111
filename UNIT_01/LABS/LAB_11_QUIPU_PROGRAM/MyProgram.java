public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println("Hello! This program turns any whole number between 0 and 999 into a digital Quipu.");
        boolean running = true;
        while (running == true) {
            int userNumber = UtilityBelt.readInt("Please enter a number between 0 and 999: ", 0, 999);
            int[] result = splitNumber(userNumber);
            System.out.printf("\n");
            System.out.println("Hundreds = " + result[0]);
            System.out.println("Tens = " + result[1]);
            System.out.println("Ones = " + result[2]);
            System.out.printf("\n");
            System.out.println("Your quipu:");
            printQuipi(result[0],result[1],result[2]);  
            char userSelection = UtilityBelt.readChar("Would you like to make another quipu? [Y/N]: ", "YyNn");
            if (userSelection == 'Y' || userSelection == 'y') {
                continue;
            } else {
                System.out.println("Goodbye!");
                running = false;
            }
        }
    }
    public static void printQuipi(int hundreds, int tens, int ones) {
        // Printing beginning of rope
        
        UtilityBelt.printCentered(5, "___");
        UtilityBelt.printCentered(5, "|");
        
        // Each if statement checks if value is greater than zero and prints "*"
        
        if (hundreds > 0) {
            for (int i = 0; i < hundreds; i++) {
                UtilityBelt.printCentered(5, "*");
            }
        } else {
            UtilityBelt.printCentered(5, "");
        }
        
        UtilityBelt.printCentered(5, "|");
        
        if (tens > 0) {
            for (int i = 0; i < tens; i++) {
                UtilityBelt.printCentered(5, "*");
            }
        } else {
            UtilityBelt.printCentered(5, "");
        }
        
        UtilityBelt.printCentered(5, "|");
        
        if (ones > 0) {
            for (int i = 0; i < ones; i++) {
                UtilityBelt.printCentered(5, "*");
            }
        } else {
            UtilityBelt.printCentered(5, "");
        }
        
        // End of rope
        
        UtilityBelt.printCentered(5, "|");
        UtilityBelt.printCentered(5, "\u203E");
    }
    public static int[] splitNumber(int number) {
        int hundreds = number / 100;         // Get hundreds place
        int tens = (number % 100) / 10;      // Get tens place
        int ones = number % 10;              // Get ones place

        return new int[]{hundreds, tens, ones}; // Return the results as an array
    }
}