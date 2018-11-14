package java112.YouSunkMyJavaProject;

import java.util.*;


public class Ship extends Object {

    private String name;
    private ArrayList<String> shipPosition;
    private int currentHits;
    private boolean isSunk;
    private int totalHits;

    /**
    *  Creates a new Ship object with the given information
    *
    * @param name The name of the type of ship
    * @param shipPosition The upper-left location of the ship
    * @param currentHits The number of times the ship has been hit
    */
    public Ship(String name, ArrayList<String> shipPosition, int currentHits, boolean isSunk) {
        this.name = name;
        this.shipPosition = shipPosition;
        this.currentHits = currentHits;
        this.isSunk = isSunk;
    }

    public int getSize() {
        return this.shipPosition.size();

    }

    public String getName() {
        return name;
    }

    public int getCurrentHits() {
        return totalHits;
    }

    public boolean getIsSunk() {
        if (totalHits >= this.shipPosition.size()) {
            isSunk = true;
        }
        return isSunk;
    }

    public ArrayList<String> getShipPosition() {
        return this.shipPosition;
    }

    public void setCurrentHits(int currentHits) {
        totalHits = this.currentHits + currentHits;
    }
}
