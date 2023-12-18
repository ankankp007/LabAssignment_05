import java.util.Scanner;

public class A5Q3 {
			public static void main(String[] args) {
				Scanner scn = new Scanner(System.in);
			    System.out.println("Enter the first number: ");
	
			    int num1 = scn.nextInt();
			    System.out.println("Enter the second number: ");
			    
			    int num2 = scn.nextInt();
			    
			    System.out.print("Prime numbers between " + num1 + " and " + num2 + " are: ");
			   
			    for (int i = num1; i <= num2; i++) {
			      boolean isPrime = true;
			      if (i <= 1) {
			        isPrime = false;
			      } else {
			          
			        for (int j = 2; j < i; j++) {
			          if (i % j == 0) {
			            isPrime = false;
			            break;
			          }
			        }
			      }
			      if (isPrime) {
			        System.out.print(i + " ");
			      }
			    }
			    System.out.println();
			  }
		

	}

 
