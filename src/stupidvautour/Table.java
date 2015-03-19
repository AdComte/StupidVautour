/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidvautour;

import java.util.ArrayList;

/**
 *
 * @author Vladimir
 */
public class Table {
    
    public final static int NB_VULTURE = 5;
    public final static int NB_MOUSE = 10;
    
    private ArrayList<PlayerCard> listPlayerCards;
    private AnimalCard current;
    private ArrayList<AnimalCard> stack;
    private ArrayList<Player> listPlayer;
    
    public Table(ArrayList<Player> listPlayer){
        this.listPlayerCards = new ArrayList<> ();
        this.stack = new ArrayList<> ();
        this.listPlayer = listPlayer;
    }
    
    public void deal(int nbCard) {
        for (int i=1; i<NB_VULTURE+1; i++) {
            this.stack.add(new AnimalCard(i, true));
        }
        for (int i=1; i<NB_MOUSE+1; i++) {
            this.stack.add(new AnimalCard(i, false));
        }
    }
    
    public void melanger() {
        
    }
    
    
    
}
