package solid.battleship.ships;

import solid.battleship.MultiplayerMap.GameMap;
import solid.battleship.moves.Move;

import java.util.List;

public class Battleship extends Ship {
    public Battleship(ShipType shipType, List<GameMap> coordinates, Move move) {
        super(shipType, coordinates, move);

    }
}
