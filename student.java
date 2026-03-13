import java.util.Scanner;

class Student{
        int roll;
        String name;
        int marks;

        void eligible(){
                if (marks>=70){
                        System.out.println(name + " is Eligible");
                }
                else{
                        System.out.println(name + " not Eligible");
                }

        }
}
public class Students{
         public static void main(String args[]){
                 Scanner sc = new Scanner(System.in);

                 Student s1 = new Student();
                 Student s2 = new Student();
                 Student s3 = new Student();

                 System.out.println("Enter Student Roll,Name,Marks:");
                 s1.roll=sc.nextInt();
                 s1.name=sc.next();
                 s1.marks=sc.nextInt();

                 System.out.println("Enter Student Roll,Name,Marks:");
                 s2.roll=sc.nextInt();
                 s2.name=sc.next();
                 s2.marks=sc.nextInt();

                 System.out.println("Enter Student Roll,Name,Marks:");
                 s3.roll=sc.nextInt();
                 s3.name=sc.next();
                 s3.marks=sc.nextInt();

                 s1.eligible();
                 s2.eligible();
                 s3.eligible();
         }
}
