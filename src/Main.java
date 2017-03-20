/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Witch
 */
public class IPLab5 {

    public static void main(String[] args) {

        Restaurant rest = Restaurant.getSingleton();
        rest.makeReservation(5);
        rest.makeReservation(90);
        rest.makeReservation(1);
        rest.makeReservation(3);
        rest.makeReservation(2);

    System.out.println(rest);

    Restaurant rest1 = Restaurant.getSingleton();
    System.out.println(rest1);
    }
}
