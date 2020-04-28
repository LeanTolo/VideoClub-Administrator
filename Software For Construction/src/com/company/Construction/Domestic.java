package com.company.Construction;

public class Domestic extends Construction {

    public int numberOfRooms;

    public Domestic(String address, double mt2, int estimatedTime, double $mt2, int numberOfRooms) {
        super(address, mt2, estimatedTime, $mt2);
        this.numberOfRooms = numberOfRooms;
    }


    @Override
    public String toString() {
        return "\nDomestic: " +
                "\nAddress = " + getAddress()+
                "\nNumber Of Rooms = " + numberOfRooms+
                "\nMt2 = " + getMt2()+
                "\nEstimated Time = " + getEstimatedTime()+
                "\nPrice per Mt2 = $" + get$mt2();
    }
}
