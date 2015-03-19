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
    
    private String name;
    private ArrayList<PlayerCard> listPlayerCard;
    public static int number =0;
    private int idPlayer;
    
    public Player () {
        listPlayerCard = new ArrayList<>();
        this.idPlayer = number++;
    }
    
    public void deal(int nbCard) {
        for (int i=1; i<nbCard+1; i++) {
            this.listPlayerCard.add(new PlayerCard(i, true));
        }
    }
    
    public String getName() {
        return name;
    }

    public ArrayList<PlayerCard> getListPlayerCard() {
        return listPlayerCard;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
