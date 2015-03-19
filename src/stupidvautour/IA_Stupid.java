/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidvautour;

import java.util.Random;

/**
 *
 * @author Vladimir
 */
public class IA_Stupid extends IAPlayer {
    
    public IA_Stupid ()
    {
        super();
        super.setName("Stupid");
    }
    public PlayerCard play() {
        Random i = new Random();
        return super.getListPlayerCard().get(i.nextInt(number));
    }
}
