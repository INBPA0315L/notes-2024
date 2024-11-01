package aviation.v3;

public class MegaAirport
        extends Airport {

    private final int terminals;

    public MegaAirport(String line) {
        super(line);
        String[] tokens = line.split(";");
        terminals = Integer.parseInt(tokens[4]);
    }

    public int getTerminals() {
        return terminals;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + terminals;
    }
}
