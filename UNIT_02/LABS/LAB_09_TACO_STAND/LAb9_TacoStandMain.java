// PARTNER NAME: Charles Fator
// PARTNER NAME: Leonardo Azevedo
// CS111 SECTION #: 1415
// DATE: 10/14/24

public class LAb9_TacoStandMain
{

	/**
	 * ALGORITHM:
	 * - Add total funds to taco stand
	 * - Order supplies
	 * - Print status of stand (when it opens)
	 * - Print welcome message
	 * - Take customer order
	 * - Print status of stand (when its closed)
	 */
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION

		//INPUT + CALCULATION + OUTPUT SECTION
		TacoStand.addTotalFunds(20);
		TacoStand.orderSupplies(15);

		System.out.println("OPENING UP THE STAND...");
		System.out.println( TacoStand.getStatus() +"\n\n");

		LAb9_TacoStandMain.printWelcome();
		System.out.println("\n");
		
		LAb9_TacoStandMain.takeOrder();
		//call takeOrder more times if you'd like! (once everything works once though!)

		System.out.println("--------CART IS CLOSED---------\n\n" + TacoStand.getStatus());
	}

	/**
	 * Outputs welcome message to start program that user sees
	 */
	public static void printWelcome()
	{
		UtilityBelt.printCentered(50, "Welcome to MCC Taco Stand!");
		UtilityBelt.printCentered(50, "┈┈┈┈╭╯╭╯╭╯┈┈┈┈┈");
		UtilityBelt.printCentered(50, "┈┈┈╱▔▔▔▔▔╲▔╲┈┈┈");
		UtilityBelt.printCentered(50, "┈┈╱┈╭╮┈╭╮┈╲╮╲┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈▂▂▂▂▂┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈▏┈╲▂▂▂╱┈▕╮▕┈┈");
		UtilityBelt.printCentered(50, "┈┈╲▂▂▂▂▂▂▂▂╲╱┈┈");
		//ascii art credit:
		//https://mizbizbby.tumblr.com/post/12937794639/happy-taco-ascii-art-for-taco-thursday
	}
	
	/**
	 * Prints menu and prompts user for input for kind of taco and number in order. If tacos are available,
	 * will update total funds and confirm order with user, otherwise error message given
	 */
	public static void takeOrder()
    {
        //DECLARATION + INITIALIZATION SECTION
        int option, numTacosOrdered;
        
        //INPUT SECTION
        TacoStand.printMenu();
        option = UtilityBelt.readInt("Enter choice> ", 1, 4);
        numTacosOrdered = UtilityBelt.readInt("Enter number of tacos you want> ", 1, 50);
        
        //CALCULATION + OUTPUT SECTION
        boolean orderSuccess = TacoStand.updateTotalFunds(option, numTacosOrdered);
        
        if (orderSuccess) {
            LAb9_TacoStandMain.printConfirmation(numTacosOrdered);
        } else {
            System.out.println("Sorry, we don't have enough supplies for your order!");
        }
    }

	/**
	 * Prints confirmation message that varies based on number of tacos in order
	 * 
	 * @param numTacos
	 */
	public static void printConfirmation(int numTacos)
    {
        if (numTacos == 1) {
            System.out.println("Here is your taco, buen provecho!");
        } else if (numTacos > 1 && numTacos <= 5) {
            System.out.println("Here are your tacos, enjoy!");
        } else if (numTacos > 5) {
            System.out.println("That's a lot of tacos! Hope you're hungry!");
        }
        
        for (int i = 0; i < numTacos; i++) {
            System.out.println("🌮");
        }
    }
}