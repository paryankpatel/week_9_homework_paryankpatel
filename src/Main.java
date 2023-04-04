import calculate.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= scn.nextInt();
        System.out.println("Enter the second number");

        int b= scn.nextInt();
        System.out.println("Please enter one of symbol +,-,*,/ :");
        char ch= scn.next().charAt(0);
        System.out.println("Would you like to do more calculation please enter 'Y' or 'N' :");
        char ans= scn.next().charAt(0);

        switch(ch){
            case '+':
                obj.addition(a,b);
                break;
            case '-':
                obj.subtraction(a,b);
                break;
            case '*':
                obj.multiplication(a,b);
                break;
            case '/':
                obj.division(a,b);
            default:{
                System.out.println("Invalid symbol");
            }
            switch(ans){
                case 'N':
                    break;

            }
        }



    }

}
