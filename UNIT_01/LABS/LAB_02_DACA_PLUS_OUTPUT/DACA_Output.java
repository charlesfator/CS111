// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:1415
// DATE: 09/09/2024

public class DACA_Output
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
        String firstName = "Charles";
        String lastName = "Fator";
        String uscisNum = "123-456-789";
        int category = 123;
        int cardNum = 1231231231;
        String birthOrigin = "USA";
        String terms = "Don't Do Bad Stuff pls :)";
        int dobD = 17;  // Date of Birth Day
        int dobM = 7;  // Date of Birth Month
        int dobY = 2006;  // Date of Birth Year
        char sex = 'M';
        int validD = 14;  // Valid Date Day
        int validM = 9;  // Valid Date Month
        int validY = 2024;  // Valid Date Year
        int expireD = 14; // Expiration Date Day
        int expireM = 9; // Expiration Date Month
        int expireY = 2032; // Expiration Date Year




    
		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         UNITED STATES OF AMERICA                                    ║");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD      ║");
		System.out.println("║                       Surname                                       ║");
		System.out.println("║                       " + lastName + "                                         ║");
		System.out.println("║  .----.    .----.     Given Name                                    ║");
		System.out.println("║ (   ^  \\  /  ^   )    " + firstName + "                                       ║");
		System.out.println("║        |  |           USCIS#         Category   Card#               ║");
		System.out.println("║       _/  \\_          " + uscisNum + "    " + category + "        " + cardNum + "          ║");
		System.out.println("║      (_    _)         Country of Birth                              ║");
		System.out.println("║   ,    `--`    ,      " + birthOrigin + "                                           ║");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions                          ║");
		System.out.println("║    \\          /       " + terms + "                     ║");
		System.out.println("║     '.--..--.'        Date of Birth   Sex                           ║");
		System.out.println("║       `\"\"\"\"\"`         " + dobM + " - " + dobD + " " + dobY + "     " + sex + "                            ║");
		System.out.println("║                       Valid From:     " + validD + "/" + validM + "/" + validY + "                      ║");
		System.out.println("║                       Card Expires:   " + expireD + "/" + expireM + "/" + expireY + "                    ║");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.                 ║");
		System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}