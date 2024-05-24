package lowleveldesign.solid.battleship.MultiplayerMap;

import lowleveldesign.solid.battleship.ships.Ship;

import java.util.ArrayList;


public class GameMap {
    private final int l;
    private final int b;
    private final int[][] map;


   ArrayList<Ship> shipList= new ArrayList<>();

    public GameMap(int l, int b) {
        this.l = l;
        this.b = b;
        this.map = new int[l][b];
    }


}
