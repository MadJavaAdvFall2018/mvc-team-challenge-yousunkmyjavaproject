package java112.YouSunkMyJavaProject;

import java.io.*;
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

        Ship aircraftCarrier = new Ship("aircraftCarrier", ["a1", "a2", "a3", "a4", "a5"], 0);
        Ship destroyer = new Ship("destroyer", ["b1", "b2", "b3", "b4"], 0);
        Ship battleship = new Ship("battleship", ["c1", "c2", "c3"], 0);
        Ship cruiser = new Ship("cruiser", ["d1"], 0);
        Ship submarine = new Ship("submarine", ["e1", "e2"], 0);

        ArrayList<String> aircraftCarrierLocation = aircraftCarrier.getLocation();
        ArrayList<String> destroyerLocation = destroyer.getLocation();
        ArrayList<String> battleshipLocation = battleship.getLocation();
        ArrayList<String> cruiserLocation = cruiser.getLocation();
        ArrayList<String> submarineLocation = submarine.getLocation();

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
            submarineLocation.setCurrentHits(1);
        }

        if (aircraftCarrier.isSunk()) {
            window.alert("You sunk My Java Project... and also " + aircraftCarrier.getName());
        }
        if (destroyer.isSunk()) {
            window.alert("You sunk My Java Project... and also " + destroyer.getName());
        }
        if (battleship.isSunk()) {
            window.alert("You sunk My Java Project... and also " + battleship.getName());
        }
        if (cruiser.isSunk()) {
            window.alert("You sunk My Java Project... and also " + cruiser.getName());
        }
        if (submarine.isSunk()) {
            window.alert("You sunk My Java Project... and also " + submarine.getName());
        }
     }
}
