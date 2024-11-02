public class UD2_Project {
    public static void main(String[] args) {
        // Mj's Array
        int[] coffeeInventory = {50, 50, 50}; // coffee scoops, sugar pumps, cream pumps
        
        // Charlie's While loop
        boolean running = true;
        while (running == true) {
            // Array with inventory
            System.out.println("Welcome Java Coffee Shop...");
            System.out.println("Here is our menu: ");
            System.out.println("1. Black Coffee");
            System.out.println("2. Latte");
            System.out.println("3. Cappucino");
            System.out.println("4. Please stop soliciting me, I want no coffee");
            
            // User Selection Section
            int userSelection = UtilityBelt.readInt("What type of coffee would you like?: ", 1, 4);
            
            // Conditional Statements
            // Charlie's Conditionals
            if (userSelection == 1) {
              // minus one coffee scoop from inventory
              coffeeInventory[0] = (coffeeInventory[0] - 1);
              System.out.println("Here is your coffee, have a nice day!");
            } else if (userSelection == 2) {
                coffeeInventory[0] = (coffeeInventory[0] - 2);
                coffeeInventory[2] = (coffeeInventory[2] - 2);
              System.out.println("Here is your coffee, have a nice day!");
            // Mj's Conditional
            } else if (userSelection == 3) {
                coffeeInventory[0] = (coffeeInventory[0] - 3);
                coffeeInventory[1] = (coffeeInventory[1] - 4);
                coffeeInventory[2] = (coffeeInventory[2] - 3);
              System.out.println("Here is your coffee, have a nice day!");
            } else {
              System.out.println("See yah later aligator!");
                running = false;
            }
        }
    }  
}