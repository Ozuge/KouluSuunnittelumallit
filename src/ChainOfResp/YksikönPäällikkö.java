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
public class YksikönPäällikkö extends PKorotus{

    protected final double HYVÄKSYTTÄVÄ = POHJA * 1.05;
            
    @Override
    public void processPyyntö(Pyyntö pyyntö) {
        if (pyyntö.getSumma() < HYVÄKSYTTÄVÄ) {
            System.out.println("Yksikön päällikkö hyväksyy " + pyyntö.getSumma() + " euron palkankorotuksen.");
        } else if (seuraaja != null) {
            seuraaja.processPyyntö(pyyntö);
        }
    }
    
}
