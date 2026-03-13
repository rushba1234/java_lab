import java.util.Scanner;
public class matrix{
        public static void main(String args[]){
        int row,column;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row:");
        row=scan.nextInt();
        System.out.println("Enter column:");
        column=scan.nextInt();

        int arr[][] = new int [row][column];

        System.out.println("Enter Elements:");
        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                        arr[i][j]=scan.nextInt();
                }
        }
        System.out.println("The entered matrix:");
        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                        System.out.print(arr[i][j] + " ");
                }
                System.out.println();

                }

        }
}
