package java112.YouSunkMyJavaProject;

public class Ship extends Object {

    private String name;
    private int[] shipPosition;
    private int currentHits;
    private boolean isSunk;

    /**
     *
     * @param name The name of the type of ship
     * @param shipPosition The upper-left location of the ship
     * @param currentHits The number of times the ship has been hit
     */
    public Ship(String name, int[] shipPosition, int currentHits) {

        this.name = name;
        this.shipPosition = shipPosition;
        this.currentHits = currentHits;
        this.isSunk = false; // a brand new ship is never sunk
    }






}
