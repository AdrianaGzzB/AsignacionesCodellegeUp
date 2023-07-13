//en el README.md deje mis comentarios: Adriana Gonzalez Barcenas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);
        while (true) {
            System.out.println("Calculator");
            System.out.println("""
                    1.Add
                    2.Subtraction
                    3.Multiply
                    4.Division
                    5.Exit
                    """);
            System.out.println("Select an operation: ");
            var operation = Integer.parseInt(digits.nextLine());
            if (operation >= 1 && operation <=4){
                System.out.print("Number one: ");
                var numberone = Integer.parseInt(digits.nextLine());
                System.out.print("Number two: ");
                var numbertwo = Integer.parseInt(digits.nextLine());
                int result;
                switch (operation){
                    case 1 ->{
                        result = numberone + numbertwo;
                        System.out.println("Add: " + result);
                    }
                    case 2 ->{
                        result = numberone - numbertwo;
                        System.out.println("Subtraction: " + result);
                    }
                    case 3 ->{
                        result = numberone * numbertwo;
                        System.out.println("Multiply: " + result);
                    }
                    case 4 ->{
                        result = numberone / numbertwo;
                        System.out.println("Division: " + result);
                    }
                    default -> System.out.println("Error" + operation);
                }
            } else if (operation == 5) {
                System.out.println("Good bye");
                break;
            }else {
                System.out.println("Please select a correct operation" + operation);
            }
        }
        System.out.println();
    }
}