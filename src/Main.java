/**
 * Created by Costan Catalin2 on 20-Mar-17.
 */
public class Main {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.makeReservation(5);
        rest.makeReservation(90);
        rest.makeReservation(1);
        rest.makeReservation(3);
        rest.makeReservation(2);

        System.out.print(rest);
    }
}
