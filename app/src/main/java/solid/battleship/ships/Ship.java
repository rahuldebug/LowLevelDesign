package solid.battleship.ships;

import solid.battleship.MultiplayerMap.GameMap;
import solid.battleship.moves.Move;

import java.util.List;

public abstract class Ship {
    ShipType shipType;

    public Ship(ShipType shipType, List<GameMap> coordinates, Move move) {
        this.shipType = shipType;
        this.coordinates = coordinates;
        this.move = move;
    }

    List<GameMap> coordinates;

    Move move;

}
