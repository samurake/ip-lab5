// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 3/20/2017 3:05:19 PM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Restaurant.java

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Vector;

public class Restaurant
{

    public Restaurant()
    {
        tables = new Vector();
    }

    public void makeReservation(int seatsNumber)
    {
        tables.add(new Table(seatsNumber));
    }

    public String toString()
    {
        StringBuilder returnString = new StringBuilder();
        Table table;
        for(Iterator iterator = tables.iterator(); iterator.hasNext(); returnString.append(table))
            table = (Table)iterator.next();

        return returnString.toString();
    }

    public static void main(String args[])
    {
        Restaurant rest = new Restaurant();
        rest.makeReservation(5);
        rest.makeReservation(90);
        rest.makeReservation(1);
        rest.makeReservation(3);
        rest.makeReservation(2);
        System.out.print(rest);
    }

    public Vector tables;
}