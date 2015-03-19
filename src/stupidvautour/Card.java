/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidvautour;

/**
 *
 * @author Vladimir
 */
public class Card {
    public int value;
    public boolean notPlayed;

    
    public Card(int number, boolean notPlayed) {
        this.value = number;
        this.notPlayed = notPlayed;
        
    }
    public Card (int number) {
        this.value = number;
        this.notPlayed = true;
    }
    
    public int getValue () {
        return this.value;
    }

    public boolean getVisible () {
        return this.notPlayed;
    }
    public void setNotPlayed(boolean V) {
        this.notPlayed = V;
    }

    public  void ToString() {
        if(notPlayed){
        System.out.println("Carte n°"+this.value);}
        else{
            System.out.println("Carte Inconnue");}
    }
}
