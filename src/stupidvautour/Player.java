/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stupidvautour;

import java.util.ArrayList;

/**
 *
 * @author Decalog2
 */
public class Player {
    
    String name;
    ArrayList<PlayerCard> listPlayerCard;
    
    public Player (String name) {
        this.name = name;
        listPlayerCard = new ArrayList<>();
    }
    
    public void deal(int nbCard) {
        for (int i=1; i<nbCard+1; i++) {
            
        }
    }
}
