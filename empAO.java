import java.util.Scanner;
class Employee{
        int eNo;
        String eName;
        double eSalary;

        void read(Scanner sc){
                System.out.println("Enter Employee Number:");
                eNo=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Employee Name:");
                eName=sc.nextLine();
                System.out.println("Enter Employee Salary:");
                eSalary=sc.nextDouble();
        }
        void display(){
                System.out.println("Employee Number:"+eNo);
                System.out.println("Employee Name:"+eName);
                System.out.println("Employee Salary:"+eSalary);
        }
}
public class EmpAO{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the number of Employees:");
                int n = sc.nextInt();

                Employee emp[] = new Employee[n];

                for(int i=0;i<n;i++){
                        System.out.println("\nEnter the details of Employee:");
                        emp[i] = new Employee();
                        emp[i].read(sc);
                }
                System.out.println("\nEnter Employee Number to search:");
                int search = sc.nextInt();

                boolean found = false;

                for(int i=0;i<n;i++){
                        if(emp[i].eNo==search){
                                System.out.println("\nEmployee Found");
                                emp[i].display();
                                found = true;
                                break;
                        }
                }
                if(!found){
                        System.out.println("Employee Not Found");
                }
        }
}
