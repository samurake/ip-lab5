import java.util.Vector;

public class Restaurant {

    public Vector<Table> tables;

    public Restaurant() {

        tables = new Vector<>();
    }

    public void makeReservation(int seatsNumber) {
        tables.add(new Table(seatsNumber));
    }

    @Override
    public String toString() {
    StringBuilder returnString = new StringBuilder();

        for (Table table: tables) {
            returnString.append(table);
        }
        return returnString.toString();
    }
}