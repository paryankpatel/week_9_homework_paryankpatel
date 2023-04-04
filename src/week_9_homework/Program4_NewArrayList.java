package week_9_homework;
//Write a Java program to create a new array list, add some colours (string) and
       // printout the collection using for each loop.
import java.util.ArrayList;
import java.util.List;

public class Program4_NewArrayList {
    public static void main(String[] args) {

        List<String> colorlist = new ArrayList();
        colorlist.add("Red");
        colorlist.add("Green");
        colorlist.add("Yellow");
        colorlist.add("Blue");
        colorlist.add("White");
        colorlist.add("Black");

        for (String colorname : colorlist) {
            System.out.println(colorname);
        }
    }

}

