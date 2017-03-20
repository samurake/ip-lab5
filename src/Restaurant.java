/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iplab5;

import java.util.Vector;


public class Restaurant {

    static int counter;

    private final static Restaurant REST = new Restaurant();

    public Vector<Table> tables = new Vector<>();

    private Restaurant() {
    counter = 0;
    }

    static public Restaurant getSingleton() {
        counter++;
        return REST;
    }

    public void makeReservation(int seatsNumber) {
        tables.add(new Table(seatsNumber));
    }

    @Override
    public String toString() {
    StringBuilder returnString = new StringBuilder("Pointers to singleton: " + counter + '\n');

        for (Table table: tables) {
            returnString.append(table);
        }

        return returnString.toString();
    }
}
