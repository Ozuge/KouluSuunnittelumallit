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
public class Main {
    
    public static void main(String[] args) {
        
        Screen screen = new Screen();
        Command up = new FlipUpCmd(screen);
        Command down = new FlipDownCmd(screen);
        Wallbutton btn1 = new Wallbutton(up);
        Wallbutton btn2 = new Wallbutton(down);
        
        btn1.push();
        btn2.push();
        
    }
    
}
