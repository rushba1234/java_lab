import java.util.Scanner;
public class mat_addition{
        public static void main(String args[]){
        int row,column;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row:");
        row=scan.nextInt();
        System.out.println("Enter column:");
        column=scan.nextInt();

        int arr1[][] = new int [row][column];
        int arr2[][] = new int [row][column];

        int add[][] = new int [row][column];

        System.out.println("Enter Elements of first matrix:");
        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                        arr1[i][j]=scan.nextInt();
                }
        }

        System.out.println("Enter Elements of second matrix:");
        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                        arr2[i][j]=scan.nextInt();
                }
        }

        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                        add[i][j]=arr1[i][j]+arr2[i][j];
                }

           }

        System.out.println("Matrix Addition:");
        for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                        System.out.print(add[i][j] + " ");
                }
                System.out.println();
                }

        }
}
