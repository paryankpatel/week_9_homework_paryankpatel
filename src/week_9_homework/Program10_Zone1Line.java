package week_9_homework;
//Write a programme that tells you which line passes through particular stations.
//        Just use Zone 1 stations name.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program10_Zone1Line {

    String[] zone1 = {"Oxford Circus", "Green Park", "Euston Square", "Bond Street"};
    String[] jubilee = new String[]{"Green Park", "Bond Street"};
    String[] metropolitan = new String[]{"Euston Square"};
    String[] central = new String[]{"Oxford Circus", "Bond Street"};

    public static void main(String[] args){
        Program10_Zone1Line obj = new Program10_Zone1Line();
        Boolean found = false;

        for ( String sname: obj.zone1) {
            System.out.println(sname);
        }
        System.out.println();

        Scanner read = new Scanner(System.in);
        System.out.println("Enter London Zone 1 station: ");
        String station = read.nextLine();
        read.close();
        System.out.println(station);

        // Check if station is present in Jubilee
        List<String> nameList = new ArrayList<>(Arrays.asList(obj.jubilee));
        if (nameList.contains(station)){
            System.out.println("Station found on Jubilee Line");
            found = true;
        }

        // Check if station is present in Metropolitan
        nameList = new ArrayList<>(Arrays.asList(obj.metropolitan));
        if (nameList.contains(station)){
            System.out.println("Station found on Metropolitan Line");
            found = true;
        }

        // Check if station is present in Central
        nameList = new ArrayList<>(Arrays.asList(obj.central));
        if (nameList.contains(station)){
            System.out.println("Station found on Central Line");
            found = true;
        }
        if (!found){
            System.out.println("Station not found on any line");
        }

    }
}
