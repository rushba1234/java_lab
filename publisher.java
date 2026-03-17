mport java.util.Scanner;

class Publisher {
    String pname;
    void getPublisher(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        pname = sc.nextLine();
    }
}

class Book extends Publisher {
    String title, author;
    void getBook(Scanner sc) {
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }
}

class Literature extends Book {
    void display() {
        System.out.println("\nCategory: Literature");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + pname);
    }
}

class Fiction extends Book {
    void display() {
        System.out.println("\nCategory: Fiction");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + pname);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Literature l = new Literature();
        Fiction f = new Fiction();

        System.out.println("Enter details for Literature Book:");
        l.getPublisher(sc);
        l.getBook(sc);
        l.display();

        System.out.println("\nEnter details for Fiction Book:");
        f.getPublisher(sc);
        f.getBook(sc);
        f.display();
    }
}
~                                                       
