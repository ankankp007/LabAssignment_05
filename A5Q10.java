import java.util.Scanner;
public class A5Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();
		        int a = 0, b = 1, c = 1;
		        if(n > 3) {
		            System.out.print(a + " " + b + " " + c + " ");
		            for(int i = 1; i <= n-3; i++) {
		                int d = a + b + c;
		    
		                System.out.print(d + " ");
		    
		                a = b;
		                b = c;
		                c = d;
		            }
		        }
		    }
}
