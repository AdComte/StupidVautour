/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidvautour;

import java.util.ArrayList;

/**
 *
 * @author Adrien_portable
 */
public class Game {
    
    private int nbPlayer;
    private Table table;
    
    public Game(int nbPlayer) {
        ArrayList<Player>  listPlayer = new ArrayList<>();
        for (int i=0; i<nbPlayer; i++) {
            listPlayer.add(new Player());
        }
        this.table = new Table(listPlayer);
    }
    
}
