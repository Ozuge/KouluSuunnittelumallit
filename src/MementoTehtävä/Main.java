/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoTehtävä;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ottoj_000
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
 
        Originator arvuuttaja = new Originator();
        arvuuttaja.set(1);
        arvuuttaja.set(2);
        savedStates.add(arvuuttaja.saveToMemento());
        arvuuttaja.set(3);
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(arvuuttaja.saveToMemento());
        arvuuttaja.set(4);
 
        arvuuttaja.restoreFromMemento(savedStates.get(1)); 
        
        
    }
    
}
