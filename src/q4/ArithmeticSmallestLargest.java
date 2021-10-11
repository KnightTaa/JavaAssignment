package q4;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {

        //Create scanner to get input
        Scanner sc = new Scanner(System.in);

        //Create a variable for input and output
        int num1,num2,num3,sum,product,average,smallest,largest;

        //Get input for num1, num2, num3
        System.out.print("Enter first integer: ");
        num1=sc.nextInt();
        System.out.print("Enter second integer: ");
        num2=sc.nextInt();
        System.out.print("Enter third integer: ");
        num3=sc.nextInt();

        //Doing the calculation
        sum=num1+num2+num3;
        product=num1*num2*num3;
        average = sum/3;

        //Assume smallest and largest numbers
        //I assume num1 is the largest and smallest number

        smallest = num1;
        largest = num1;

        //Search Real smallest and largest values using if operation
        if (num2 > largest)
            largest=num2;
        if (num3 > largest)
            largest=num3;
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;

        //Print the final outputs

        System.out.println("Sum is "+sum);
        System.out.println("Product is "+product);
        System.out.println("Average is "+average);
        System.out.println("Smallest number is "+smallest);
        System.out.println("Largest number is "+largest);

    }
}
