// Imports

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        ShippingLabel newLabel = new ShippingLabel();
        while (running == true) {
            System.out.println("Which action would you like to run?");
            System.out.println("Create new label (c), view label (v), exit (x)");
            String userChoice = scanner.nextLine();
            
            userChoice = userChoice.toLowerCase();
            if (userChoice.equals("c")) {

                double shippingCost;

                System.out.println("What is the name of your recipient?");
                String name = scanner.nextLine();
                System.out.println("What is the street adress of your recipient?");
                String adress = scanner.nextLine();
                System.out.println("What is the city of your recipient?");
                String city = scanner.nextLine();
                System.out.println("What is the state of your recipient?");
                String state = scanner.nextLine();
                System.out.println("What is the postal code of your recipient?");
                int postalCode = scanner.nextInt();
                System.out.println("What is the weight of the package?");
                double packageWeight = scanner.nextDouble();

                if (packageWeight <= 5.00) {
                    shippingCost = 3.00;
                } else if (packageWeight <= 10.00) {
                    shippingCost = 5.00;
                } else {
                    shippingCost = 15.00;
                }

                
                newLabel.setName(name);
                newLabel.setAdress(adress);
                newLabel.setCity(city);
                newLabel.setState(state);
                newLabel.setPostalCode(postalCode);
                newLabel.setPackageWeight(packageWeight);
                newLabel.setShippingCost(shippingCost);

                System.out.println("Your label has been created.");

            } else if (userChoice.equals("v")) {
                newLabel.printLabel();
            } else if (userChoice.equals("x")) {
                scanner.close();
                running = false;
            } else {
                System.out.println("Not a valid choice, please choose again.");
            }


        }
    }

}