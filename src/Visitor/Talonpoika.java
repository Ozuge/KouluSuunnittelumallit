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
public class Talonpoika implements State{
    
    double massit;

    @Override
    public void ilmoittaudu(Context context) {
        System.out.println("H-h-hei olen t-talonpoika...");
        context.setState(this);
    }
    
    @Override
    public void asiakaskysely(Context context){
        System.out.print("O-olen kiitollinen herrojen armosta... minulla on nyt " + getMassit() + " kultarahaa...");
    }
    
    @Override
    public void accept(PalkanmaksajaIF palkanmaksaja) {
       palkanmaksaja.visit(this);
    }
    
    public double getMassit(){
        return massit;
    }
    
}
