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
public class Charmeleon implements State{

    @Override
    public void hyökkää(Context context) {
        System.out.println("Charmeleon syöksee tulta");
        context.setState(this);
    }

    @Override
    public void karju(Context context) {
        System.out.println("Charmeleon huutaa täyttä kurkkua"); 
        context.setState(this);
    }

    @Override
    public void hyppää(Context context) {
        System.out.println("Charmeleon loikkaa");   
        context.setState(this);
    }
    
}
