/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import Lists.List;

/**
 *
 * @author Student
 */
public class VisitsList implements List<Visit> {
  private Visit visits[];

    public VisitsList() {
        this.visits = new Visit[100];
    }

    @Override
    public boolean add(Visit t) {
        for (int i = 0; i < visits.length; i++){
            if (visits[i] == null){
                visits[i] = t;
                return true;
            }
        }
      return false;
    }

    @Override
    public boolean remove(Visit t) {
        for (int i = 0; i < visits.length; i++){
            if (visits[i] !=null && visits[i].equals(t)){
                for (int x = i; x < visits.length -1; x++){
                    visits[x] = visits[x +1];
                }
                visits[visits.length -1] = null;
                return true;
            }
        }
      return false;
    }

    @Override
    public Visit find(Object id) {
      for (Visit visit : visits) {
          if (visit != null && visit.getVisitor().equals(id)) {
              return visit;
          }
      }
      return null;
    }

    @Override
    public void showAll() {
      for (Visit visit : visits) {
          if (visit != null) {
              System.out.println(visit);
          }
      }
    }
    
    
    
}
