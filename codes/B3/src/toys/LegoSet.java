package toys;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class LegoSet
        implements Comparable<LegoSet> {
    
    private String number;
    private final String name;
    private final Theme theme;
    private int pieces;

    public LegoSet(String number, String name, Theme theme, int pieces) {
        this.number = number;
        this.name = name;
        this.theme = theme;
        this.pieces = pieces;
    }

    public LegoSet(String number, String name, int pieces) {
        this.number = number;
        this.name = name;
        this.pieces = pieces;
        theme = Theme.CITY;
    }

    public LegoSet(String line) {
        String[] tokens = line.split(";");
        number = tokens[0];
        name = tokens[1];
        theme = Theme.parseTheme(tokens[2]);
        pieces = Integer.parseInt(tokens[3]);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Theme getTheme() {
        return theme;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return number + ";" + name +
                ";" + theme + ";" + pieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LegoSet legoSet = (LegoSet) o;
        return Objects.equals(number, legoSet.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public int compareTo(LegoSet o) {
        if (this.pieces != o.pieces) {
            return Objects.compare(this.pieces, o.pieces,
                    Comparator.reverseOrder());
        }
        if (!Objects.equals(this.name, o.name)) {
            return Objects.compare(this.name, o.name,
                    Comparator.naturalOrder());
        }
        return Objects.compare(this.number, o.number,
                Comparator.naturalOrder());
    }

    public static enum Theme {
        CITY("City"),
        STAR_WARS("Star Wars"),
        HARRY_POTTER("Harry Potter"),
        CREATOR_EXPERT("Creator Expert");

        private final String name;

        Theme(String name) {
            this.name = name;
        }

        public static Theme parseTheme(String name) {
            for (Theme theme : values()) {
                if (Objects.equals(theme.name, name)) {
                    return theme;
                }
            }
            throw new IllegalArgumentException(
                    "The value is invalid for enum Theme"
            );
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class LegoSetComparator
            implements Comparator<LegoSet> {

        @Override
        public int compare(LegoSet o1, LegoSet o2) {
            if (!Objects.equals(o1.name, o2.name)) {
                return Objects.compare(o1.name, o2.name, Comparator.reverseOrder());
            }
            if (o1.pieces != o2.pieces) {
                return Objects.compare(o1.pieces, o2.pieces, Comparator.naturalOrder());
            }
            return Objects.compare(o1.number, o2.number, Comparator.naturalOrder());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.err.println("Two args are required");
            System.exit(0);
        }

        LegoSet[] legoSets = new LegoSet[125];
        int length = 0;
        try (Scanner sc = new Scanner(new File(args[0]))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tokens = line.split(";");
                if (tokens.length == 4) {
                    legoSets[length] = new LegoSet(line);
                } else {
                    legoSets[length] = new LegoSetWithMinifigures(line);
                }
                length++;
            }
        }

        Arrays.sort(legoSets, 0, length);
        for (int i = 0; i < length; i++) {
            System.out.println(legoSets[i]);
        }

        try (PrintWriter pw = new PrintWriter(args[1])) {
            Arrays.sort(legoSets, 0, length,
                    new LegoSetComparator());
            for (int i = 0; i < length; i++) {
                pw.println(legoSets[i]);
            }
        }
    }
}


class LegoSetWithMinifigures  extends LegoSet {

    private final int minifigures;

    public LegoSetWithMinifigures(String line) {
        super(line);
        minifigures = Integer.parseInt( line.split(";")[4]        );
    }

    public int getMinifigures() {
        return minifigures;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + minifigures;
    }
}