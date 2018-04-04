/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statetehtävä;

/**
 *
 * @author ottoj_000
 */
public class Charmander implements State {

    @Override
    public void hyökkää(Context context) {
        System.out.println("Charmander sylkee kipinöitä");
        context.setState(this);
    }

    @Override
    public void karju(Context context) {
        System.out.println("Charmander kiljuu");
        context.setState(this);
    }

    @Override
    public void hyppää(Context context) {
        System.out.println("Charmander pomppii");
        context.setState(this);
    }
    
}
