/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoTehtävä;

/**
 *
 * @author ottoj_000
 */
public class Memento {
    
    private final int number;

    public Memento(int numberToSave){
        number = numberToSave;
    }

    private int getSavedNumber(){
        return number;
    }
}
