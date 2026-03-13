import java.util.Scanner;

public class oddeven{
        public static void main(String[] args){
                int n;

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");
                n=sc.nextInt();

                if(n % 2 == 0){
                        System.out.println("Number is Even");
                }
                else{
                        System.out.println("Number is Odd");
                }
        }
}
