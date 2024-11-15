/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class DACA_Main {
    public static void main(String[] args) {
        DACArecipient person1, person2;
        
        person1 = new DACArecipient();
        person2 = new DACArecipient();
        
        person1.setAll("Walker", "Catherine", "12-3-456", "Scotland", 2456923, 2458401, 2461045, 'F');
        person2.setAll("Walker", "Catherine", "12-3-456", "Scotland", 2456923, 2458401, 2461045, 'X');
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.equals(person2));
        
        System.out.println(person1.printCard());
        
    }
}