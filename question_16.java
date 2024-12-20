import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compute HCF
        int hcf = findHCF(num1, num2);

        // Output the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    // Method to find HCF using the Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//OUTPUT
// Enter the first number: 20
// Enter the second number: 15
// The HCF of 20 and 15 is: 5
