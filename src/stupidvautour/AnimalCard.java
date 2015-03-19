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
public class AnimalCard extends Card{
    private boolean vulture;
    
    public AnimalCard(int number, boolean vulture){
        super(number);
        this.vulture = vulture;
    }
    
    public boolean getAnimal (){
        return this.vulture;
    }
}
