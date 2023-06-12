// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = scan.nextInt();
        
        scan.close();
        
        int sum = 1;
        int prod = 1;
        
        for (int i = 2; i <= num; i++) {
            sum += i;
            prod *= i;
        }
        
        System.out.println(sum);
        System.out.println(prod);

    }
        
}
