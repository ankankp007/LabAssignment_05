import java.util.Scanner;

public class A5Q1 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);  
				System.out.print("Enter the first number: ");  
				int firstnum = sc.nextInt();  
				System.out.print("Enter the second number: ");  
				int secondnum = sc.nextInt();  
				int sum_firstnum = 0, sum_secondnum = 0;  
				for (int i = 1; i <= firstnum; i++)   
				{  
				if (firstnum % i == 0)    
				sum_firstnum = sum_firstnum+i;  
				}  
				for (int i = 1; i <= secondnum; i++)   
				{  
				if (secondnum % i == 0)  
				sum_secondnum = sum_secondnum+i;  
				}  
				if (sum_firstnum == sum_secondnum)  
				System.out.println("The pair of numbers are amicable.");  
				else  
				System.out.println("The pair of numbers are not amicable.");  
				}  
			  


}
