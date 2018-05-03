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
public class FlipUpCmd implements Command{

    private Screen screen;
    
    public FlipUpCmd(Screen screen){
        this.screen = screen;
    }
    
    @Override
    public void execute() {
        screen.screenUp();
    }
    
}
