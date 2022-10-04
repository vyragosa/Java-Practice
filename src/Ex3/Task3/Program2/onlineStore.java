package Ex3.Task3.Program2;

import java.util.Scanner;

public class onlineStore {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        int menu = 1;
        while (menu != 0) {
            System.out.println("""
                    Enter 1 to add price
                    Enter 2 to pay with dollars
                    Enter 3 to pay with euros
                    Enter 4 to pay with yuan
                    Enter 5 to pay with rubbles
                    Enter 6 to show default price
                    Enter 0 to exit
                    """);

            menu = scanner.nextInt();
            if (menu == 1) {
                currencyConverter.setValue(scanner.nextDouble());
            } else if (menu == 2) {
                System.out.println("Your price: " + currencyConverter.convertToUSDollar());
            } else if (menu == 3) {
                System.out.println("Your price: " + currencyConverter.convertToEuro());
            } else if (menu == 4) {
                System.out.println("Your price: " + currencyConverter.convertToYuan());
            } else if (menu == 5) {
                System.out.println("Your price: " + currencyConverter.convertToRubble());
            } else if (menu == 6) {
                System.out.println("Your price: " + currencyConverter.getValue());
            }
        }
    }
}
