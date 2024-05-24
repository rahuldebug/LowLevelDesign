package lowleveldesign.solid.battleship.moves;

import lowleveldesign.solid.battleship.ships.Ship;
import lowleveldesign.solid.battleship.MultiplayerMap.GameMap;

public abstract class  Move {
    private final Ship shipType;
    GameMap gameMap;

    protected Move(Ship shipType) {
        this.shipType = shipType;
    }
    abstract void validMove();

}
