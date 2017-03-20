// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 3/20/2017 3:06:00 PM
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Table.java


public class Table
{

    public Table(int seats)
    {
        if(seats > 0)
            this.seats = seats;
    }

    public void setReserved()
    {
        reserved = true;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Table with ").append(seats).append(" seats \n").toString();
    }

    public int seats;
    public boolean reserved;
}