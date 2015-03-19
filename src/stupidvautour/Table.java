/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidvautour;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public class Table {
    private ArrayList<PlayerCard> Player_cards;
    private AnimalCard Current;
    private ArrayList<AnimalCard> Stack;
    
    public Table(){
        this.Player_cards = new ArrayList<> ();
        this.Stack = new ArrayList<> ();
        Current = Stack.get(0);
    }
}
