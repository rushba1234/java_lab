import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {

        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex result1 = c1.add(c2);

        System.out.println("Without User Input:");
        result1.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWith User Input:");

        System.out.print("Enter real part of first number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second number: ");
        double i2 = sc.nextDouble();

        Complex c3 = new Complex(r1, i1);
        Complex c4 = new Complex(r2, i2);
        Complex result2 = c3.add(c4);

        System.out.print("Result: ");
        result2.display();
    }
}
