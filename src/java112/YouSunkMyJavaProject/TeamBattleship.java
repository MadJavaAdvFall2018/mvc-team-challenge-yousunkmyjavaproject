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
     *@param  request the HttpServletRequest object
     *@param  response the HttpServletResponse object
     *@exception  ServletException if there is a Servlet failure
     *@exception  IOException if there is an IO failure
     */
    private int aircraftHits = 0;
    private int destroyerHits = 0;
    private int battleshipHits = 0;
    private int cruiserHits = 0;
    private int submarineHits = 0;

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

        Ship aircraftCarrier = new Ship("Aircraft Carrier", aircraftCarrierLocation, 0, false);
        Ship destroyer = new Ship("Destroyer", destroyerLocation, 0, false);
        Ship battleship = new Ship("Battleship", battleshipLocation, 0, false);
        Ship cruiser = new Ship("Cruiser", cruiserLocation, 0, false);
        Ship submarine = new Ship("Submarine", submarineLocation,  0, false);

        if (aircraftCarrierLocation.contains(userFired)) {
            aircraftHits++;
            aircraftCarrier.setCurrentHits(aircraftHits);
            request.setAttribute("aircraftCarrier", aircraftCarrier);
        } else {
            aircraftCarrier.setCurrentHits(aircraftHits);
            request.setAttribute("aircraftCarrier", aircraftCarrier);
        }

        if (destroyerLocation.contains(userFired)) {
            destroyerHits++;
            destroyer.setCurrentHits(destroyerHits);
            request.setAttribute("destroyer", destroyer);
        } else {
            destroyer.setCurrentHits(destroyerHits);
            request.setAttribute("destroyer", destroyer);
        }

         if (battleshipLocation.contains(userFired)) {
             battleshipHits++;
             battleship.setCurrentHits(battleshipHits);
             request.setAttribute("battleship", battleship);
         } else {
             battleship.setCurrentHits(battleshipHits);
             request.setAttribute("battleship", battleship);
         }

         if (cruiserLocation.contains(userFired)) {
             cruiserHits++;
             cruiser.setCurrentHits(cruiserHits);
             request.setAttribute("cruiser", cruiser);
         } else {
             cruiser.setCurrentHits(cruiserHits);
             request.setAttribute("cruiser", cruiser);
         }

         if (submarineLocation.contains(userFired)) {
             submarineHits++;
             submarine.setCurrentHits(submarineHits);
             request.setAttribute("submarine", submarine);
         } else {
             submarine.setCurrentHits(submarineHits);
             request.setAttribute("submarine", submarine);
         }

         String url = "/battleship.jsp";
         RequestDispatcher dispatcher
                 = getServletContext().getRequestDispatcher(url);
         dispatcher.forward(request, response);
     }
}
