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
    
    private ArrayList<PlayerCard> listPlayerCardsOnTable;
    private AnimalCard current;
    private ArrayList<AnimalCard> stack;
    private ArrayList<Player> listPlayer;
    private int nbPlayer;
    
    public Table(ArrayList<Player> listPlayer, int nbPlayer){
        this.listPlayerCardsOnTable = new ArrayList<> ();
        this.stack = new ArrayList<> ();
        this.listPlayer = listPlayer;
        
        this.listPlayer = new ArrayList<>();
        for (int i=0; i<nbPlayer; i++) {
            this.listPlayer.add(new Player());
        }
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
    
    public int win_round() //Renvoie le numéro du joueur gagnant ce coup ci
    {
        int max=0, min=0;
        int couleur = -1;
        if(this.current.getAnimal()) { //Si c'est un vautour
            for (PlayerCard p : listPlayerCardsOnTable)
            {
                if (p.value < min) {//On enregistre qui a posé la valeur min
                    min = p.value;
                    couleur = p.couleur;
                }
            }
        } else {    // Sinon si c'est une souris
            for(PlayerCard p : listPlayerCardsOnTable)
            {
                if(p.value > max)//On récupère le max et le joueur auquel il appartient
                {
                    max = p.value;
                    couleur = p.couleur;
                }
            }
        } return couleur;
    }
    
    public void next_round () {
        listPlayerCardsOnTable.clear();//On défosse les cartes des joueurs
        current = stack.get(0);//On tire une carte
        stack.remove(0);       //
    }
}
