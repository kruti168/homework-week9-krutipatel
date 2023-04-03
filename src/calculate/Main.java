package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {


        //Object create
        Calculator calculator = new Calculator();

        char choice = 'y';
        while (choice == 'y' || choice == 'Y') { //while loop

            //Scanner object create
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first Number");

            int fNumber = scanner.nextInt();
            System.out.println("Enter second Number");
            int sNumber = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,/ ,*");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(fNumber,sNumber,symbol);
            System.out.println("Would you like to do more calculation please enter 'y' or 'N'");

            choice = scanner.next().charAt(0);
         //   scanner.close();

        }
    }
}