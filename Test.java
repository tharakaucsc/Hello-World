import java.io.*;
public class Test{
    public static void main(String args[]){
		System.out.println("Factorial Calculator");
        int fact = factorial(8);
        System.out.println("8! = "+fact);
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