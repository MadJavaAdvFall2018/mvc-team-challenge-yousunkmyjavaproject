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
        Ship destroyer = new Ship("destoryer", ["b1", "b2", "b3", "b4"], 0);
        Ship battleship = new Ship("battleship", ["c1", "c2", "c3"], 0);
        Ship cruiser = new Ship("crusier", ["d1"], 0);
        Ship submarine = new Ship("submarine", ["e1", "e2"], 0);

        aircraftCarrier.getLocation();
        destoryer.getLocation();
        battleship.getLocation();
        cruiser.getLocation();
        submarine.getLocation();

     }
}
