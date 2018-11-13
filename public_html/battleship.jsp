<!DOCTYPE html>

<html>
    <head>
        <h1>Battleship</h1>
    </head>

    <body>
        <table>
            <tr>
                <th>Ship Name</th><th>Ship Position</th><th>Current Hits</th><th>Is Sunk?</th>
            </tr>
            <tr>
                <td>${aircraftCarrier.name}</td>
                <td>${aircraftCarrier.shipPosition}</td>
                <td>${aircraftCarrier.currentHits}</td>
                <td>${aircraftCarrier.isSunk}</td> <!-- I am pretty sure this one will not work -->
            </tr>
            <tr>
                <td>${destroyer.name}</td>
                <td>${destroyer.shipPosition}</td>
                <td>${destroyer.currentHits}</td>
                <td>${destroyer.isSunk}</td> <!-- I am pretty sure this one will not work -->
            </tr>
        </table>

    </body>
</html>
