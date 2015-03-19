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
    public final static int NB_CARDS = 15;
    private int nbPlayer;
    private Table table;
    
    public Game(int nbPlayer) {
        ArrayList<Player>  listPlayer = new ArrayList<>();
        for (int i=0; i<nbPlayer-1; i++) {
            listPlayer.add(new IAPlayer()) ;
        }
        listPlayer.add(new Human()) ;
        this.table = new Table(listPlayer);
    }
    
    public void GameLoop () {
        int turn=NB_CARDS;
        while(turn>0)
        {
            table.play();
        }
    }
    
}
