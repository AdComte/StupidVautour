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
    public int number;
    public boolean notPlayed;
    
    public Card(int number, boolean notPlayed) {
        this.number = number;
        this.notPlayed = notPlayed;
    }
    public Card (int number) {
        this.number = number;
        this.notPlayed = false;
    }
    
    public int getNumber () {
        return this.number;
    }
    public void setNumber (int i) {
        this.number = i;
    }
    public boolean getVisible () {
        return this.notPlayed;
    }
    public void setNotPlayed(boolean V) {
        this.notPlayed = V;
    }

    public  void ToString() {
        if(notPlayed){
        System.out.println("Carte n°"+this.number);}
        else{
            System.out.println("Carte Inconnue");}
    }
}
