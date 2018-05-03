/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoTehtävä;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ottoj_000
 */
public class Caretaker {
    
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento number){
      mementoList.add(number);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
}

