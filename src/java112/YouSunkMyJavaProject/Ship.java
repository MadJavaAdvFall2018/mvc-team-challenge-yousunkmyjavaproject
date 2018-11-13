package java112.YouSunkMyJavaProject;

import java.util.*;


public class Ship extends Object {

    private String name;
    private ArrayList<String> shipPosition;
    private int currentHits;
    private boolean isSunk;

    /**
     *  Creates a new Ship object with the given information
     *
     * @param name The name of the type of ship
     * @param shipPosition The upper-left location of the ship
     * @param currentHits The number of times the ship has been hit
     */
    public Ship(String name, ArrayList<String> shipPosition, int currentHits) {

        this.name = name;
        this.shipPosition = shipPosition;
        this.currentHits = currentHits;
        this.isSunk = false; // a brand new ship is never sunk
    }

    public int getSize() {

        return this.shipPosition.size();

    }

    public String getName() {
        return name;
    }

    public boolean isSunk() {
        if (currentHits >= getSize()) {
            isSunk = true;
        }
        return isSunk;
    }

    public ArrayList<String> getShipPosition() {
        return this.shipPosition;
    }

    public void setCurrentHits(int currentHits) {
        this.currentHits = currentHits;
    }
}
