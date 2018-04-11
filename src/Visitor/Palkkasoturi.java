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
public class Palkkasoturi implements State{
    
    double massit;
    
    @Override
    public void ilmoittaudu(Context context) {
        System.out.println("Grr... Olen palkkasoturi merten takaa.");
        context.setState(this);
    }
    
    @Override
    public void asiakaskysely(Context context){
        System.out.print("Vihdoin pääsen tavernaan kuluttamaan " + getMassit() + " kultarahan arvoista omaisuuttani...");
    }
    
    @Override
    public void accept(PalkanmaksajaIF palkanmaksaja) {
        palkanmaksaja.visit(this);
    }
    
    public double getMassit(){
        return massit;
    }

}
