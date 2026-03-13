import java.util.Scanner;

public class calculator {
        public static void main(String[] args){
                float a,b,result;
                char operator;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter first number: ");
                a=sc.nextInt();

                System.out.print("Enter the operator:(+,-,*,/,%):");
                operator=sc.next().charAt(0);

                System.out.print("Enter second number: ");
                b=sc.nextInt();



                switch(operator){
                        case '+':
                                result = a + b;
                                break;
                        case '-':
                                result = a - b;
                                break;
                        case '*':
                                result = a * b;
                                break;
                        case '/':
                                result = a / b;
                                break;
                        case '%':
                                result = a % b;
                                break;
                        default:
                                System.out.println("Invalid Operator");
                                return;
                        }
                System.out.println("Result: "+result);
        }
}
