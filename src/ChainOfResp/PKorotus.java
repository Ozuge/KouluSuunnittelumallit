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
abstract class PKorotus {
    
    protected static double POHJA;
    protected PKorotus seuraaja;
    
    public void setSeuraaja(PKorotus seuraaja){
        this.seuraaja = seuraaja;
    }
    
    abstract public void processPyyntö(Pyyntö pyyntö);
    
}
