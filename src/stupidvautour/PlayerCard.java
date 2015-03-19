/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stupidvautour;

/**
 *
 * @author Adrien_portable
 */
public class PlayerCard extends Card{
    
    public int couleur;
        
    public PlayerCard(int number, boolean notPlayed, int couleur)
    {
        super(number, notPlayed);
        this.couleur = couleur;
    }
}
