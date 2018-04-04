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
public class Main {
    
    public static void main(String[] args) {
    
    Context context = new Context();
    
    Charmander charmander = new Charmander();
    charmander.hyökkää(context);
    charmander.hyppää(context);
    charmander.karju(context);
    
    System.out.println(context.getState().toString());
    
    Charmeleon charmeleon = new Charmeleon();
    charmeleon.hyökkää(context);
    charmeleon.hyppää(context);
    charmeleon.karju(context);
    
    System.out.println(context.getState().toString());
    
    Charizard charizard = new Charizard();
    charizard.hyökkää(context);
    charizard.hyppää(context);
    charizard.karju(context);
    
    System.out.println(context.getState().toString());
    
   }
}