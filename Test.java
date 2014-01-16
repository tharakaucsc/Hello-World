import java.io.*;
import java.util.Scanner;
public class Test{
    public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("---- Factorial Calculator ----");
		System.out.print("Enter a number to calculate the factorial: ");
		try{
			int number = scan.nextInt();
			int fact = factorial(number);
			System.out.println("Answer "+number + "! = "+fact);
		}catch(Exception e){
			System.out.println("Error : "+e);
			System.out.println("Exit from the program");
		}
			
    }
/***************
* iterative method **
***************/
    static int factorial(int n){
        int result = n;
        for (int i= n-1; i>0;i--){
            result *=i;
        }
        return result;
    }
}