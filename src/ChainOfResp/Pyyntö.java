/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResp;

/**
 *
 * @author ottoj_000
 */
public class Pyyntö {
    private double summa;
    
    public Pyyntö(double summa){
        this.summa = summa;
    }
    
    public double getSumma(){
        return summa;
    }
    public void setSumma(double sum){
        summa = sum;
    }
    
    
}
