package week_9_homework;
//Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//        Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
//        else)

import java.util.HashSet;
import java.util.Set;

public class Program8_HashsetInteger {
    public static void main(String[] args) {

        Set<Integer> list = new HashSet();
        list.add(4);
        list.add(7);
        list.add(8);

        for (Integer intdata : list) {

            if(intdata >=1 && intdata<=10){
                System.out.println(intdata);
            }
        }

    }
}
