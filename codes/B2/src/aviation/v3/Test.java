package aviation.v3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airport[] airports = new Airport[125];
        int length = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(";");
            airports[length] = tokens.length == 5
                    ? new MegaAirport(line)
                    : new Airport(line);
            length++;
        }
        Arrays.sort(airports, 0, length);
        for (int i = 0; i < length; i++) {
            System.out.println(airports[i]);
        }
        System.out.println();
        Arrays.sort(airports, 0, length,
                new Comparator<Airport>() {
                    @Override
                    public int compare(Airport o1, Airport o2) {
                        if (o1.getTime() != o2.getTime()) {
                            return Objects.compare(o1.getTime(), o2.getTime(), Comparator.reverseOrder());
                        }
                        if (o1.getRunways() != o2.getRunways()) {
                            return Objects.compare(o1.getRunways(), o2.getRunways(), Comparator.reverseOrder());
                        }
                        return Objects.compare(o1.getName(), o2.getName(), Comparator.naturalOrder());
                    }
                });
        for (int i = 0; i < length; i++) {
            System.out.println(airports[i]);
        }
    }
}
