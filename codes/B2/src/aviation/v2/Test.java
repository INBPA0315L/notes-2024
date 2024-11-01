package aviation.v2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airport[] airports = new Airport[125];
        int length = 0;
        while (sc.hasNextLine()) {
            airports[length] = new Airport(sc.nextLine());
            length++;
        }
        Arrays.sort(airports, 0 ,length);
        for (int i = 0; i < length; i++) {
            System.out.println(airports[i]);
        }
        System.out.println();
        Arrays.sort(airports, 0, length,
                airports[0].new AirportComparator());
        for (int i = 0; i < length; i++) {
            System.out.println(airports[i]);
        }
    }
}
