
package FacadeTeht;

/**
 *
 * @author ottoj_000
 */
public class CPU {
    
    public void freeze() {
        System.out.println("CPU froze");
    }
    
    public void jump(long position) {
        System.out.println("Jumping to " + position);
    }
    
    public void execute() { 
        System.out.println("Excecuting");
    }
}
