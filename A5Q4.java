import java.util.Scanner;

public class A5Q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m, n;
        System.out.print( "Enter the value of m: ");
        m = obj.nextInt();
        System.out.print("Enter the value of n: ");
        n = obj.nextInt();

        int factorial = 1;
        if(m != 1) {
            for(int i = 2;i <= m; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + m + " is: " + factorial);
            for(int i = m + 1;i <= n;i++) {
                factorial *= i;
                System.out.println("Factorial of " + i + " is: " + factorial);
            }
        }
        obj.close();
    }
}
