// Worked with leo on this assignment

public class DACA_DataManip
{
    public static int ConvertToJDN( int CurrentYear, int CurrentMonth, int CurrentDay)
    {
        int year = CurrentYear;
        int month = CurrentMonth;  
        int day = CurrentDay;
        int a = (14 - month) / 12;
        int m = month + 12 * a -3;
        int y = year + 4800 - a;
        int JDN = day + ((153 * m + 2)/5) + (365 * y) + (y/4) - (y/100) + (y/400) - 32045;
        return JDN;
    }
    public static String PrintToday(int InputYear, int InputMonth, int InputDay)
    {
        int JulianDate = ConvertToJDN(InputYear, InputMonth, InputDay);
        String message = "Julian Day Number for today's date, " + InputMonth + "/" + InputDay + "/" + InputYear + ", is " + JulianDate;
        return message;
    }
    public static String PrintBirthday(int InputYear, int InputMonth, int InputDay)
    {
        int JulianDate = ConvertToJDN(InputYear, InputMonth, InputDay);
        String message = "Julian Day Number for birthday, " + InputMonth + "/" + InputDay + "/" + InputYear + ", is " + JulianDate;
        return message;
    }
    public static void main(String[] args)
    {
        int CurrentYear = 2024;
        int BirthYear = 2006;
        int Today = ConvertToJDN(2024, 9, 11);
        int Birthday = ConvertToJDN(2006, 7, 17);
        int Difference = Today - Birthday;
        System.out.println(PrintToday(2024, 9, 11));
        System.out.println(PrintBirthday(2006, 7, 17));
        System.out.println("The difference in days is " + Difference + ", which makes you approximately " + (CurrentYear - BirthYear) + " years old!");
    }
    
}