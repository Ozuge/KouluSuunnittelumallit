/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author ottoj_000
 */

//INVOKER
public class Wallbutton {
    Command command;
    
    public Wallbutton(Command command){
        this.command = command;
    }
    
    public void push(){
        command.execute();
    }
    
}
