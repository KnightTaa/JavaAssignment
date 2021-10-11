package q3;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //Create scanner for get inputs
        Scanner sc = new Scanner(System.in);

        //Create variable for input and output
        double a,c;

        //Get fahrenheit value
        System.out.print("Enter Fahrenheit value: ");
        a=sc.nextDouble();

        //Display celsius value
        System.out.print("Celsius temperature is "+celsius(a));
    }
    static double celsius(double f){
        return (f-32)*5/9;
    }
}
