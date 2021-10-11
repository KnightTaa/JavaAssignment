package q2;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        //Create Scanner for get inputs
        Scanner sc = new Scanner(System.in);

        //Create input and output variables
        int x,y,z,Ans;

        //Get first input
        System.out.print("Enter first integer: ");
        x=sc.nextInt();

        //Get second input
        System.out.print("Enter second integer: ");
        y=sc.nextInt();

        //Get third input
        System.out.print("Enter third integer: ");
        z= sc.nextInt();

        //Calculate product of three integers
        Ans = x * y * z;

        //Output the result
        System.out.print("Product is " +Ans);
    }
}
