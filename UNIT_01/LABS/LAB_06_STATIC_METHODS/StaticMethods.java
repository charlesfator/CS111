// Static Methods Lab 06
// Charles Fator
// 9/26/24

public class StaticMethods {

    // Methods

    public static String answerOne() { // Method header
        // The Method body is this. What is between the two curly braces {}
        // The Method identifier is answerOne    
        String outputString = "I think that the self driving car should prioritize the \nsafety of the passengers of the car. What do humans \ndo when we drive? We save ourselves. I really don't \nthink many people would buy a car that would purposefully \nchoose to harm the passengers of the car.";
        return outputString; // The return type is String

    }

    public static String answerTwo() { // Method header
        // The Method body is this. What is between the two curly braces {} 
        // The Method identifier is answerTwo
        String outputString = "I think that the self driving car needs to make \na decision to choose the path with the least casualties \nwhile not sacrifising the safety of the passenger.";
        return outputString; // The return type is String

    }

    public static String answerThree() { // Method header
        // The Method body is this. What is between the two curly braces {}
        // The Method identifier is answerThree
        String outputString = "I think that society should influence the algorithims. It should'nt \nbe a voluntary survey either. Maybe if part of \nvoting for a presidential candidate involved submiting your choices that \nmight be a way to get less biased results.";
        return outputString; // The return type is String

    }

    // Main method

    public static void main(String[] args) {

        System.out.println("My thoughts on the article are:");
        System.out.println("1. " + answerOne());
        System.out.println("");
        System.out.println("2. " + answerTwo());
        System.out.println("");
        System.out.println("3. " + answerThree());

    }

}
