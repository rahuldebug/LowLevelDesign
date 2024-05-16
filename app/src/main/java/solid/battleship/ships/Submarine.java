package solid.battleship.ships;

import solid.battleship.MultiplayerMap.GameMap;
import solid.battleship.moves.Move;


import java.util.List;

public class Submarine extends Ship {

    public Submarine(ShipType shipType, List<GameMap> coordinates, Move move) {
        super(shipType, coordinates, move);
    }
}
