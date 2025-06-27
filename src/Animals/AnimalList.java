/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Lists.List;

/**
 *
 * @author USER
 */
public class AnimalList implements List<Animal>{
  private Animal animals[];
private int size;
    public AnimalList() {
        this.animals = new Animal [100];
        this.size =0;
    }

    @Override
    public boolean add(Animal t) {
       if (size >= animals.length || t == null) return false;

        if (find(t.getId()) != null) return false;

        animals[size++] = t;
        return true;
    }

    @Override
    public boolean remove(Animal t) {
        if (t == null) return false;

        for (int i = 0; i < size; i++) {
            if (animals[i].getId().equals(t.getId())) {
          
                for (int j = i; j < size - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[--size] = null;
                return true;
            }
        }
        return false; 
    }

    @Override
    public Animal find(Object id) {
         if (id == null) return null;

        for (int i = 0; i < size; i++) {
            if (animals[i].getId().equals(id.toString())) {
                return animals[i];
            }
        }
        return null;
    }

    @Override
    public void showAll() {
       for (int i = 0; i < size; i++) {
            System.out.println(animals[i]);
        }  
    }

  
}
