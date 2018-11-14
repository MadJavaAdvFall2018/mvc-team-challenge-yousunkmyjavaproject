<!DOCTYPE html>

<html>
    <head>
        <h1>Battleship</h1>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    </head>

    <body>
        <table class="table table-dark table-striped">
            <tr>
                <th>Ship Name</th><th>Ship Position</th><th>Current Hits</th><th>Is Sunk?</th>
            </tr>
            <tr>
                <td>${aircraftCarrier.name}</td>
                <td>${aircraftCarrier.shipPosition}</td>
                <td>${aircraftCarrier.currentHits}</td>
                <td>${aircraftCarrier.isSunk}</td>
            </tr>
            <tr>
                <td>${destroyer.name}</td>
                <td>${destroyer.shipPosition}</td>
                <td>${destroyer.currentHits}</td>
                <td>${destroyer.isSunk}</td>
            </tr>
            <tr>
                <td>${battleship.name}</td>
                <td>${battleship.shipPosition}</td>
                <td>${battleship.currentHits}</td>
                <td>${battleship.isSunk}</td>
            </tr>
            <tr>
                <td>${cruiser.name}</td>
                <td>${cruiser.shipPosition}</td>
                <td>${cruiser.currentHits}</td>
                <td>${cruiser.isSunk}</td>
            </tr>
            <tr>
                <td>${submarine.name}</td>
                <td>${submarine.shipPosition}</td>
                <td>${submarine.currentHits}</td>
                <td>${submarine.isSunk}</td>
            </tr>
        </table>
    </body>
</html>
