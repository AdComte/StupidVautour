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
    public boolean visible;
    
    public Card(int number, boolean visible) {
        this.number = number;
        this.visible = visible;
    }
    public Card (int number) {
        this.number = number;
        this.visible = false;
    }
    
    public int getNumber () {
        return this.number;
    }
    public void setNumber (int i) {
        this.number = i;
    }
    public boolean getVisible () {
        return this.visible;
    }
    public void setVisible(boolean V) {
        this.visible = V;
    }

    public  void ToString() {
        if(visible){
        System.out.println("Carte n°"+this.number);}
        else{
            System.out.println("Carte Inconnue");}
    }
}
