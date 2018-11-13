package java112.YouSunkMyJavaProject;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
* Team BattleShip Servlet
*
* @author kpeterson
*/
@WebServlet(
    name = "battleship",
    urlPatterns = { "/battleship" }
)
public class TeamBattleship extends HttpServlet {
    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
     public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userFired = request.getParameter("userShotFired");

        ArrayList<String> aircraftCarrierLocation = new ArrayList<>();
        aircraftCarrierLocation.add("a1");
        aircraftCarrierLocation.add("a2");
        aircraftCarrierLocation.add("a3");
        aircraftCarrierLocation.add("a4");
        aircraftCarrierLocation.add("a5");

        ArrayList<String> destroyerLocation = new ArrayList<>();
        destroyerLocation.add("b1");
        destroyerLocation.add("b2");
        destroyerLocation.add("b3");
        destroyerLocation.add("b4");
        ArrayList<String> battleshipLocation = new ArrayList<>();
        battleshipLocation.add("c1");
        battleshipLocation.add("c2");
        battleshipLocation.add("c3");
        ArrayList<String> cruiserLocation = new ArrayList<>();
        cruiserLocation.add("d1");
        ArrayList<String> submarineLocation = new ArrayList<>();
        submarineLocation.add("e1");
        submarineLocation.add("e2");

        Ship aircraftCarrier = new Ship("aircraftCarrier", aircraftCarrierLocation, 0);
        Ship destroyer = new Ship("destroyer", destroyerLocation, 0);
        Ship battleship = new Ship("battleship", battleshipLocation,  0);
        Ship cruiser = new Ship("cruiser", cruiserLocation, 0);
        Ship submarine = new Ship("submarine", submarineLocation,  0);


        //ArrayList<String> aircraftCarrierLocation = aircraftCarrier.getLocation();
        //ArrayList<String> destroyerLocation = destroyer.getLocation();
        //ArrayList<String> battleshipLocation = battleship.getLocation();
        //ArrayList<String> cruiserLocation = cruiser.getLocation();
        //ArrayList<String> submarineLocation = submarine.getLocation();

        aircraftCarrier.getShipPosition();
        destroyer.getShipPosition();
        battleship.getShipPosition();
        cruiser.getShipPosition();
        submarine.getShipPosition();

        if (aircraftCarrierLocation.contains(userFired)) {
            aircraftCarrier.setCurrentHits(1);
        }
        if (destroyerLocation.contains(userFired)) {
            destroyer.setCurrentHits(1);
        }
        if (battleshipLocation.contains(userFired)) {
            battleship.setCurrentHits(1);
        }
        if (cruiserLocation.contains(userFired)) {
            cruiser.setCurrentHits(1);
        }
        if (submarineLocation.contains(userFired)) {
            submarine.setCurrentHits(1);
        }

        if (aircraftCarrier.isSunk()) {
            System.out.println("You sunk My Java Project... and also " + aircraftCarrier.getName());
        }
        if (destroyer.isSunk()) {
            System.out.println("You sunk My Java Project... and also " + destroyer.getName());
        }
        if (battleship.isSunk()) {
            System.out.println("You sunk My Java Project... and also " + battleship.getName());
        }
        if (cruiser.isSunk()) {
            System.out.println("You sunk My Java Project... and also " + cruiser.getName());
        }
        if (submarine.isSunk()) {
            System.out.println("You sunk My Java Project... and also " + submarine.getName());
        }
     }
}
