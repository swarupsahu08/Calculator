package conditionals;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("A calculator with different operations such as addition ,Subtraction,Modulo operator and Division");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first Number");
            Double a=sc.nextDouble();
            System.out.println("Enter the second Number");
            Double b=sc.nextDouble();
            System.out.println("Enter the operation you want to perform \n 1.Multiplication \n 2.Addition \n 3.Subtraction \n 4.Division \n 5.Modulo Division");
            int op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("The Product of the two numbers is"+ a*b);
                    break;
                    case 2:
                    System.out.println("The Addition of the two numbers is"+ a+b);
                    break;
                    case 3:
                    System.out.println("The Subtraction of the two numbers is"+ (a-b));
                    break;
                    case 4:
                    System.out.println("The Division of the two numbers is"+ a/b);
                    break;
                    case 5:
                    System.out.println("The Modulo division of the two numbers is"+ a%b);
                    break;
            
                default:
                System.out.println("The calculator needs to be upgraded to perform more complex calculations");
                break;
            }
        }
    }
}
