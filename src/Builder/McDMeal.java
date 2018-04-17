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
public class McDMeal {

    float cost = 0.0f;
    
    StringBuilder items = new StringBuilder(100);
    
    public void addItem(Item item) {
        items.append("Tuote: ");
        items.append(item.name());
        items.append("Pakattu: ");
        items.append(item.packing().pack());
        items.append("Hinta: ");
        items.append(item.price());
        
        cost += item.price();
    }
    
    public float getCost(){
        return cost;
    }
    
    public String showStuff() {
        return items.toString();
    }
    
    
}
