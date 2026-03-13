import java.util.Scanner;

public class swap {
        public static void main(String[] args){
                int a,b,temp;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter first number: ");
                a=sc.nextInt();

                System.out.print("Enter second number: ");
                b=sc.nextInt();

                temp=a;
                a=b;
                b=temp;

                System.out.println("First Number After Swapping: "+a);
                System.out.println("Second Number After Swapping: "+b);
        }
}
