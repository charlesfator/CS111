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

    public static String characterName(String name, int level) {
        // This method will concatenate the line with name and level which will require a String and int data types.
        String combinedOutput = "NAME: " + name + "           LV: " + level;
        return combinedOutput;
    }
    
    public static String characterAbilities(String ability, int HP) {
        // This method creates the line with ability and hp number
        String combinedOutput = " Ability: " + ability + "         HP: " + HP;
        return combinedOutput;
    }

    public static String chanceOfSpecial(double percentage) {
        // The method creates the line with the chance that your special will activate
        String combinedOutput = "Special Chance: " + percentage;
        return combinedOutput;
    }
    // MJ's methods
    
    public static String characterWeight(String label, int weight) {
        // The method returns the line with the weight of the character
        String combinedOutput = ""+ label + "   " + weight; 
        return combinedOutput;
    }

    public static String characterHeight(String label, int feet, int inches) {
        // Use String.format(); to add ' and " for feet and inches of the character height
        String combinedOutput = ""+ label +  "   "+ feet +"'"+ inches+"\"";
        return combinedOutput;
    }

    // Charlie's methods

    public static String createDescription(String label, String description) {
        // This method creates the description line for the output
        String combinedOutput = "" + label + "" + description + "";
        return combinedOutput;
    }

    public static String copyRightStatment(String label, int year) {
        // This method creates a copyright statement at the bottom
        String combinedOutput = "" + label + "" + year + "";
        return combinedOutput;
    }

    public static void main(String[] args) {
        // Assigning methods to variables

        // Leo's name and level section

        String nameAndLevel = characterName("Charizard", 76);
        String abilityAndHP = characterAbilities("PK Fire", 150);
        String specialProb = chanceOfSpecial(69.99);

        // Mj's variable assignment

        String weight = characterWeight("WEIGHT", 275);
        String height = characterHeight("HEIGHT", 7, 3);

        // Charlie's variable assignment

        String description = createDescription("DESCRIPTION:", " An Albanian guy       ║         \n║   who eats people.                  ");
        String copyright = copyRightStatment("COPYRIGHT: ", 2024);

        /* Final formated print statement
         *
         * This needs to not be hardcoded, just a reference.
         * If you mess with the formating just copy and paste so we have this as a reference.
         * 
         */ 

        System.out.printf("╔══════════════════════════════════════╗\n");
        System.out.printf("║%38s║\n","");
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
        System.out.printf("║   " + nameAndLevel + "   ║\n");
        System.out.printf("║  " + abilityAndHP + "   ║\n");
        System.out.printf("║   " + specialProb + "              ║\n","");
        System.out.printf("║%38s║\n","");
        System.out.printf("║   " + weight + "                       ║\n"); 
        System.out.printf("║   " + height + "                      ║\n");
        System.out.printf("║%38s║\n","");
        System.out.printf("║   " + description + " ║\n");
        System.out.printf("║%38s║\n","");
        System.out.printf("║   " + copyright + "                    ║\n");
        System.out.printf("║%38s║\n","");
        System.out.printf("╚══════════════════════════════════════╝\n");

    }
}
