package week_9_homework;

import java.util.HashMap;
//Create a HashMap object called people that will store String keys and Integer
      //  values: And use for each loop to iterate the value from Map.
public class Program9_HashmapStringInteger {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Ram", 10);
        people.put("Shyam", 20);
        people.put("Shiv", 30);

        people.forEach((key, value)-> {

            System.out.println(key + " " +value);
        });
    }
}
