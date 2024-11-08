/********************************************
*	DEVELOPER:	<name>
*   COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class DACA_ClassObjMain
{
  public static void main(String[] args) 
	{
    
    //TODO PART 3: test your setter/getter here!
    DACArecipient test1 = new DACArecipient();
    DACArecipient test2 = new DACArecipient();
	
	test1.setSurname("Morales");
	test1.setGivenName("Carlos");
	test1.setUscisNumber("21-7-425");
	test1.setCountryOfOrigin("El Salvador");
	test1.setBirthday(2450560);
	test1.setValidFromDate(2460622);
	test1.setExpirationDate(2461352);
	test1.setSex('M');
	
	test2.setAll("Mendez", "Javier", "56-3-445", "Venezuela", 2451564, 3956753, 3956840, 'M');
	
	System.out.println("Person 1");
	System.out.println("-----------------------------");
	System.out.println("Surname: " + test1.getSurname());
	System.out.println("Given Name: " + test1.getGivenName());
	System.out.println("USCIS Number: " + test1.getUscisNumber());
	System.out.println("Country of Origin: " + test1.getCountryOfOrigin());
	System.out.println("Birthday(JDN): " + test1.getBirthday());
	System.out.println("Valid From Date(JDN): " + test1.getValidFromDate());
	System.out.println("Expiration Date(JDN): " + test1.getExpirationDate());
	System.out.println("Sex: " + test1.getSex());
	
	
	System.out.printf("\n");
	
	System.out.println("Person 2");
	System.out.println("-----------------------------");
	System.out.println("Surname: " + test2.getSurname());
	System.out.println("Given Name: " + test2.getGivenName());
	System.out.println("USCIS Number: " + test2.getUscisNumber());
	System.out.println("Country of Origin: " + test2.getCountryOfOrigin());
	System.out.println("Birthday(JDN): " + test2.getBirthday());
	System.out.println("Valid From Date(JDN): " + test2.getValidFromDate());
	System.out.println("Expiration Date(JDN): " + test2.getExpirationDate());
	System.out.println("Sex: " + test2.getSex());
	
	}
}