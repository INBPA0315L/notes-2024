package aviation.v2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Airport
        implements Comparable<Airport> {

    private final String name;
    private final City city;
    private int runways;
    private int time;

    public Airport(String name, City city, int runways, int time) {
        this.name = name;
        this.city = city;
        this.runways = runways;
        this.time = time;
    }

    public Airport(String name, City city, int time) {
        this.name = name;
        this.city = city;
        this.time = time;
        runways = 1;
    }

    public Airport(String line) {
        String[] tokens = line.split(";");
        name = tokens[0];
        city = City.parseCity(tokens[1]);
        runways = Integer.parseInt(tokens[2]);
        time = Integer.parseInt(tokens[3]);
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + ";" + city + ";" + runways + ";" + time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name) && city == airport.city;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(city);
        return result;
    }

    @Override
    public int compareTo(Airport o) {
        if (this.runways != o.runways) {
            return Objects.compare(this.runways, o.runways, Comparator.reverseOrder());
        }
        if (this.time != o.time) {
            return Objects.compare(this.time, o.time, Comparator.reverseOrder());
        }
        return Objects.compare(this.name, o.name, Comparator.naturalOrder());
    }

    public static enum City {
        ZURICH("Zurich"),
        LONDON("London"),
        ISTANBUL("Istanbul"),
        BARCELONA("Barcelona");

        private final String name;

        private City(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        public static City parseCity(String name) {
            for (City city : values()) {
                if (Objects.equals(name, city.name)) {
                    return city;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(City.BARCELONA);
        City city = City.valueOf("BARCELONA");
        System.out.println(city);
        System.out.println(
                Arrays.toString(City.values())
        );
    }

    public class AirportComparator
            implements Comparator<Airport> {

        @Override
        public int compare(Airport o1, Airport o2) {
            if (o1.time != o2.time) {
                return Objects.compare(o1.time, o2.time, Comparator.reverseOrder());
            }
            if (o1.runways != o2.runways) {
                return Objects.compare(o1.runways, o2.runways, Comparator.reverseOrder());
            }
            return Objects.compare(o1.name, o2.name, Comparator.naturalOrder());
        }
    }
}

