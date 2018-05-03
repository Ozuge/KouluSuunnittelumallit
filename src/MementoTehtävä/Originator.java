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
public class Originator {
    
    private int number;
    
    public void set(int number){
        this.number = number;
        System.out.println("Asetetaan luku: " + number);
    }
    
    public Memento saveToMemento(){
        System.out.println("Tallennetaan mementoon...");
        return new Memento(this.number);
    }
    
    public void restoreFromMemento(Memento memento){
        this.number = memento.getSavedNumber();
        System.out.println("Luku haun jälkeen: " + number);
    }
    
    
}
