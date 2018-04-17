/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author ottoj_000
 */
public class MealBuilder {

    public HesburgerMeal prepareMegameal() {
        HesburgerMeal hm = new HesburgerMeal();
        hm.addItem(new Megahampurilainen());
        return hm;
    }
    
    public McDMeal prepareBicMeal() {
        McDMeal mm = new McDMeal();
        mm.addItem(new BicMac());
        return mm;
    }
    
    
    
}
