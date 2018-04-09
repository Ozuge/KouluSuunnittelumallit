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
public class Lähiesimies extends PKorotus{

    private final double HYVÄKSYTTÄVÄ = POHJA * 1.02;
    
    @Override
    public void processPyyntö(Pyyntö pyyntö) {
        if (pyyntö.getSumma() < HYVÄKSYTTÄVÄ){
            System.out.println("Lähiesimies hyväksyy" + pyyntö.getSumma() + " euron palkankorotuksesi");
        } else if (seuraaja != null) {
            seuraaja.processPyyntö(pyyntö);
        }
    }
    
}
