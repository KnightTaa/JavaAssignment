package q5;

import java.util.Scanner;

public class Grade {

    //Create Average method
    public static double Average(int grades[], int max){
        int sum=0;
        double average = 0.0;

        for(int i=1; i<max;i++){
            sum+=grades[i];
            average=sum/i;
        }
        return average;
    }

    public static void main(String[] args) {
        //Create scanner for get inputs
        Scanner sc = new Scanner(System.in);

        int i, grades[];
        grades=new int[20];

        for(i=0; i<20; i++){
            System.out.println("Enter grade: ");
            grades[i] = sc.nextInt();
            if(grades[i] == -1)
                break;
        }
        System.out.printf("Average is %.2f", Average(grades, i-1));
    }
}
