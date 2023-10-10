
    

import java.util.Scanner;

public class calc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getting numbers form the user
        System.out.println("Enter the 1st number");
        double x = scanner.nextDouble();

        System.out.println("Enter the 2nd number");
        double y = scanner.nextDouble();

        //getting the operation from user
        System.out.println("Choose the operation you want to do (+, - , * , / ):");
        char operator = scanner.next().charAt(0);

        //compute and produce the answer
        double result=0;
        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x /y;
                break;
            default:
               System.out.println("Invalid operator");
        }
        //this presents the answer form the computation done;
        System.out.println("The result is " + result);
    }
}