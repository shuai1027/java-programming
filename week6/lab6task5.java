package test8;

import java.util.Scanner;

public class lab6task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer (the input ends if it is 0):");
        int data =input.nextInt();
        int sum=0;
        while(data!=0){
            sum+=data;
            System.out.println("Enter an integer (the input ends if it is 0):");
            data=input.nextInt();
        }
        System.out.println("The sum is: "+sum);
    }
}