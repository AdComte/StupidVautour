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
    
    public Table(ArrayList<Player> listPlayer){
        this.listPlayerCardsOnTable = new ArrayList<> ();
        this.stack = new ArrayList<> ();
        this.listPlayer = listPlayer;

    }
    public ArrayList<Player> getPlayerlist (){
        return listPlayer;
    }
    public void play() {
        for (Player p : listPlayer) {
            p.play();
        }
    }
    
    //Retourne le numéro du joueur au plus haut score
    public int getPlayerHighestScore () {
        int max = 0, winner=-1;
        for (Player p : listPlayer)
        {
            if (p.getScore() > max)
            {
                max = p.getScore();
                winner = p.getCouleur();
            }
        } return winner;
    }
    public void deal(int nbCard) {
        for (int i=1; i<NB_VULTURE+1; i++) {
            this.stack.add(new AnimalCard(i, true));
        }
        for (int i=1; i<NB_MOUSE+1; i++) {
            this.stack.add(new AnimalCard(i, false));
        }
    }
    
    public void melangerAnimalCard() {
        
    }
    
    //TODO : cas d'égalité
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
    
    // Passe au tour suivant
    // On défausse les cartes des joueurs sur le tapis
    // On retourne une nouvelle carte
    public void next_round () {
        listPlayerCardsOnTable.clear();
        current = stack.get(0);
        stack.remove(0);
    }
}
