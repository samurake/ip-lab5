/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iplab5;

/**
 *
 * @author Witch
 */
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
