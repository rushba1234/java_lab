import java.util.Scanner;

public class largest {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter A: ");
                int a=sc.nextInt();

                System.out.print("Enter B: ");
                int b=sc.nextInt();

                System.out.print("Enter C: ");
                int c=sc.nextInt();

                if(a>=b && a>=c){
                        System.out.println("Largest value is:"+a);
                }
                else if(b>= a && b>=c){
                        System.out.println("Largest value is:"+b);
                }
                else{
                        System.out.println("A and B are equal"+c);
                }
        }
}
