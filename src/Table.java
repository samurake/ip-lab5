public class Table {

    public int seats;

    public boolean reserved;

    public Table(int seats) {
        if (seats > 0) {
            this.seats = seats;
        }
    }

    public void setReserved() {
        reserved = true;
    }

    @Override
    public String toString() {
        return "Table with " + seats + " seats \n";
    }

}