package solid.battleship.moves;

import solid.battleship.MultiplayerMap.GameMap;
import solid.battleship.ships.Ship;

public abstract class  Move {
    private final Ship shipType;
    GameMap gameMap;

    protected Move(Ship shipType) {
        this.shipType = shipType;
    }
    abstract void validMove();

}
