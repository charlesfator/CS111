/* Group Project One
 * CS111 Fall 2024
 * 
 * Leonardo, MJ, and Charlie
 * 09/23/24
 * 
 * Description:
 * This project creates a ASCII Pokemon card based off of questions
 * that you answer. The project requires String, int, and double
 * variable types and each contributor needs to create 2 methods.
 * 
 */

public class GroupProjectOne {
    // METHODS

    // Leo's methods
    
    public static String formatASCII(String artLine) {
        // In this method you will need to take in a string with that line of ascii art and format it so it prints correctly in the end.
        return artLine;
    }

    public static String characterName(String name, int level) {
        // This method will concatenate the line with name and level which will require a String and int data types.
        String combinedOutput = name + level;
        return combinedOutput;
    }

    // MJ's methods
    
    public static String characterAbilities(String ability, int HP) {
        // This method creates the line with ability and hp number
        String combinedOutput = ability + HP;
        return combinedOutput;
    }

    public static String chanceOfSpecial(double percentage) {
        // The method creates the line with the chance that your special will activate
        String combinedOutput = "" + percentage;
        return combinedOutput;
    }

    // Charlie's methods

    public static String createDescription(String label, String description) {
        // This method creates the description line for the output
        String combinedOutput = label + description;
        return combinedOutput;
    }

    public static String copyRightStatment(String label, int year) {
        // This method creates a copyright statement at the bottom
        String combinedOutput = label + year;
        return combinedOutput;
    }

    public static void main(String[] args) {
        // Assigning methods to variables

        // Leo's ASCII section

        String ASCII01 = formatASCII("");
        String ASCII02 = formatASCII("");
        String ASCII03 = formatASCII("");
        String ASCII04 = formatASCII("");
        String ASCII05 = formatASCII("");
        String ASCII06 = formatASCII("");
        String ASCII07 = formatASCII("");
        String ASCII08 = formatASCII("");
        String ASCII09 = formatASCII("");
        String ASCII10 = formatASCII("");
        String ASCII11 = formatASCII("");
        String ASCII12 = formatASCII("");

        // Leo's name and level section

        String nameAndLevel = characterName("", 0);

        // Mj's variable assignment

        String abilityAndHP = characterAbilities("", 0);
        String specialProb = chanceOfSpecial(0);

        // Charlie's variable assignment

        String description = createDescription("", "");
        String copyright = copyRightStatment("", 2000);

        /* Final formated print statement
         *
         * This needs to not be hardcoded, just a reference.
         * If you mess with the formating just copy and paste so we have this as a reference.
         * 
         */ 

        System.out.printf("╔══════════════════════════════════════╗\n");
        System.out.printf("║                                      ║\n");
        System.out.printf("║   ╔══════════════════════════════╗   ║\n");
        System.out.printf("║   ║          __________       *  ║   ║\n");
        System.out.printf("║   ║   *     //////\\\\\\\\\\\\         ║   ║\n");
        System.out.printf("║   ║        |  ^^^  ^^^  |        ║   ║\n");
        System.out.printf("║   ║        |  ( )  ( )  |        ║   ║\n");
        System.out.printf("║   ║        |     \\/     |   *    ║   ║\n");
        System.out.printf("║   ║     *  |   ______   |        ║   ║\n");
        System.out.printf("║   ║         \\__________/         ║   ║\n");
        System.out.printf("║   ║  *        |      |      *    ║   ║\n");
        System.out.printf("║   ║      _____/      \\_____      ║   ║\n");
        System.out.printf("║   ║     /                  \\     ║   ║\n");
        System.out.printf("║   ╚══════════════════════════════╝   ║\n");
        System.out.printf("║   NAME: John Smith          LV: 69   ║\n");
        System.out.printf("║   ABILITIES: FIRE            HP 70   ║\n");
        System.out.printf("║                                      ║\n");
        System.out.printf("║                                      ║\n");
        System.out.printf("║   DESCRIPTION:                       ║\n");
        System.out.printf("║   A really weird guy from Alb-       ║\n");
        System.out.printf("║   ania. He eats brocolli.            ║\n");
        System.out.printf("║                                      ║\n");
        System.out.printf("╚══════════════════════════════════════╝\n");

    }
}
