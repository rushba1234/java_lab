import java.util.*;

public class StringSorter {

    public static void userDefinedSort(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String str = sc.nextLine();
            stringList.add(str);
        }

        System.out.println("\nMenu:");
        System.out.println("1 -> Built-in Sorting");
        System.out.println("2 -> User-defined Sorting");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(stringList);
                System.out.println("\nSorted using Built-in method:");
                break;

            case 2:
                userDefinedSort(stringList);
                System.out.println("\nSorted using User-defined method:");
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
