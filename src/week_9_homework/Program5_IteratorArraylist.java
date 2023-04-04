package week_9_homework;
//Write a Java program to iterate through all elements in an array list using
       // Iterater.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program5_IteratorArraylist {
    public static void main(String[] args) {

        List<String> testJira = new ArrayList();
        testJira.add("Paryank");
        testJira.add("Nirmal");
        testJira.add("Sandip");
        testJira.add("Maitri");
        testJira.add("Arusa");
        testJira.add("Rashmita");
        testJira.add("Shreya");
        testJira.add("Nikunja");

        Iterator i = testJira.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
