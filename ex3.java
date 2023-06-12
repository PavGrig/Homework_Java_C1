// Реализовать простой калькулятор (+-/*)

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a first number: ");
        double num1 = scan.nextDouble();
        
        System.out.print("Input a second number: ");
        double num2 = scan.nextDouble();
        
        System.out.print("Input a required operation (+-/*): ");
        char operation = scan.next().charAt(0);
        
        scan.close();
        
        double res = 0;
        
        if (operation == '+'){
            res = num1 + num2;
        }

        if (operation == '-'){
            res = num1 - num2;
        }

        if (operation == '/'){
            res = num1 / num2;
        }

        if (operation == '*'){
            res = num1 * num2;
        }
        
        System.out.println(res);
        
    }
        
}

