import java.util.Scanner;
public class A5Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();
		        
		        int sum1 = 0;
		        for(int i = 1; i <= n; i++) {
		            int sum2 = 0;
		            for(int j = 1; j <= i; j++) {
		                sum2 = sum2 + j;
		            }
		            sum1 = sum1 + sum2;
		        }
		        System.out.println("Sum of the series is: " + sum1);
		    }
		
}
