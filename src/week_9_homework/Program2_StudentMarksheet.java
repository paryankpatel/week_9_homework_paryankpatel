package week_9_homework;
//Rewrite the student mark sheet programme (From java-homework-week3
//
//        programmes) using if else and while loop.

import java.util.Scanner;

public class Program2_StudentMarksheet {
    public static void main(String[] args) {

        //Scanner declaration to get input from console
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the Student: ");
        String name = scan.nextLine();
        System.out.print("Enter the Roll number: ");
        int rollNo = scan.nextInt();
        System.out.print("Enter the marks for Maths subject \t:\t");
        int maths = scan.nextInt();

        //getting input from console for maths ensuring entered value is valid using while loop
        while (!(maths >= 0 && maths <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.print("Enter the marks for Maths subject: ");
            maths = scan.nextInt();
        }
        System.out.print("Enter the marks for Science subject \t:\t");
        int science = scan.nextInt();
        //getting input from console for science ensuring entered value is valid using while loop
        while (!(science >= 0 && science <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.print("Enter the marks for Science subject: ");
            science = scan.nextInt();
        }
        System.out.print("Enter the marks for English subject \t:\t");
        int english = scan.nextInt();
        //getting input from console for english ensuring entered value is valid using while loop
        while (!(english >= 0 && english <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.print("Enter the marks for English subject: ");
            english = scan.nextInt();
        }
        Program2_StudentMarksheet obj = new Program2_StudentMarksheet();
        int total = obj.totalMarks(maths, science, english);
        int percentage = (total * 100) / 300;
        String result = obj.resultTotal(maths, science, english);
        String grade = obj.gradeTotal(percentage, result);
        obj.printMarkSheet(name, rollNo, maths, science, english, total, percentage, result, grade);

        //closing the scanner object
        scan.close();
    }


    //method to calculate result
    public String resultTotal(int m, int s, int e) {
        if (m < 35 || s < 35 || e < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //method to calculate total
    public int totalMarks(int ma, int sc, int en) {
        return (ma + sc + en);
    }


    //method to print grade
    public String gradeTotal(int percent, String x) {
        String grade = null;
        if (percent >= 80) {
            grade = "A+";
        } else if (percent >= 60) {
            grade = "A";
        } else if (percent >= 50) {
            grade = "B";
        } else if (percent >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    //printing the mark sheet
    public void printMarkSheet(String name1, int rno, int maths1, int science1, int english1, int total, int percent, String result, String grade) {
        System.out.println("___________________________________");
        System.out.println("|                                 |");
        System.out.println("| Mark Sheet                      |");
        System.out.println("|_________________________________|");
        System.out.println("|Name     : " + name1 + "                  |");
        System.out.println("|Roll No  : " + rno + "                    |");
        System.out.println("|_________________________________|");
        System.out.println("| Subject :      Marks            |");
        System.out.println("|_________________________________|");
        System.out.println("| Maths   : " + maths1 + "                    |");
        System.out.println("| Science : " + science1 + "                    |");
        System.out.println("| English : " + english1 + "                    |");
        System.out.println("|_________________________________|");
        System.out.println("|Total     : " + total + "                  |");
        System.out.println("|_________________________________|");
        System.out.println("|Percentage     : " + percent + "              |");
        System.out.println("|Result         : " + result + "            |");
        System.out.println("|Grade          : " + grade + "              |");
        System.out.println("|_________________________________|");
    }
}

