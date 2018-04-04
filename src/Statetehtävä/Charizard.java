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
public class Charizard implements State {

    @Override
    public void hyökkää(Context context) {
        System.out.println("Charizard päästää tulimyrskyn valloilleen");
        context.setState(this);
    }

    @Override
    public void karju(Context context) {
        System.out.println("Charizard karjuu niin että tanner tärisee");
        context.setState(this);
    }

    @Override
    public void hyppää(Context context) {
        System.out.println("Charizard hyppää lentoon");
        context.setState(this);
    }
    
}
