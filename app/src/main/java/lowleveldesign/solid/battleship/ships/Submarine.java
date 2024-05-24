package lowleveldesign.solid.battleship.ships;

import lowleveldesign.solid.battleship.MultiplayerMap.GameMap;
import lowleveldesign.solid.battleship.moves.Move;


import java.util.List;

public class Submarine extends Ship {

    public Submarine(ShipType shipType, List<GameMap> coordinates, Move move) {
        super(shipType, coordinates, move);
    }
}
