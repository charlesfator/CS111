/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class MainProgram 
{
    public static void main(String[] args) 
    {
        
        DACArecipient test = new DACArecipient();
        
        System.out.println("Test: " + test);
        
        DACArecipient test2 = new DACArecipient("Fator", "Charlie", "123-456-789", "United States", 2415021, 2415021, 2415021, 'M');
        System.out.println("Test#2: " + test2);
        
    }
}