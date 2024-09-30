// PARTNER NAME: Charles Fator
// PARTNER NAME: Leonardo Azevedo
// CS111 SECTION #: 1415
// DATE: 09/30/24

public class Lab7ParamPassing
{
    public static int toJDN( int inputYear, int inputMonth, int inputDay)
    {
        int year = inputYear;
        int month = inputMonth;  
        int day = inputDay;
        int a = (14 - month) / 12;
        int m = month + 12 * a -3;
        int y = year + 4800 - a;
        int JDN = day + ((153 * m + 2)/5) + (365 * y) + (y/4) - (y/100) + (y/400) - 32045;
        return JDN;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Her birthday is: " + toJDN(1918, 8, 26) + " in JDN time.");
        System.out.println("My birthday is: " + toJDN(2006, 7, 17) + " in JDN time.");
        System.out.println("The tradgedy occured on: " + toJDN(2001, 9, 11) + " in JDN time.");
    }
}