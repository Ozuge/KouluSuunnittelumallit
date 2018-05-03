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
public class FlipDownCmd implements Command{

    private Screen screen;
    
    public FlipDownCmd(Screen screen){
        this.screen = screen;
    }
    
    @Override
    public void execute() {
        screen.screenDown();
    }
    
}
