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
public class BuilderMain {
    
     public static void main(String[] args) {
         
         MealBuilder mb = new MealBuilder();
         
         HesburgerMeal hesemätöt = mb.prepareMegameal();
         System.out.println("Hesemätöt: ");
         hesemätöt.showItems();
         System.out.println("Hinta: " + hesemätöt.getCost() + "\n");
         
         McDMeal mäkkimätöt = mb.prepareBicMeal();
         System.out.println("Mäkkimätöt: ");
         mäkkimätöt.showStuff();
         System.out.println("Hinta: " + mäkkimätöt.getCost() + "\n");
         
     }
    
}
