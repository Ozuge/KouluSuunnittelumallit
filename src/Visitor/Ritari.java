/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author ottoj_000
 */
public class Ritari implements State{
    
    double massit;
    
    @Override
    public void ilmoittaudu(Context context) {
        System.out.println("Terve kansalainen! Olen kuninkaan ritari ja aatelisen poika.");
        context.setState(this);
    }
    
    @Override
    public void asiakaskysely(Context context){
        System.out.print("Eläköön kuningas! Minulla on nyt ruhtinaalliset " + getMassit() + " kultarahaa!");
    }
    
    @Override
    public void accept(PalkanmaksajaIF palkanmaksaja) {
        palkanmaksaja.visit(this);
    }
    
    public double getMassit(){
        return massit;
    }
    
}
