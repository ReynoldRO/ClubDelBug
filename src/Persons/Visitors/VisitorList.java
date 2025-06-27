/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;

/**
 *
 * @author AsusVivobook
 */
public class VisitorList implements List<Visitor>{
    private Visitor visitorr[];
    private int cant;

    public VisitorList() {
        this.visitorr = new Visitor[100];
        this.cant = 0;
    }

    @Override
    public boolean add(Visitor t) {
        if (cant < visitorr.length) {
            visitorr[cant] = t;
            cant++;
            return true;
        }
        return false; 
    }

    @Override
    public boolean remove(Visitor t) {
        for (int i = 0; i < cant; i++) {
        if (visitorr[i].equals(t)) {    
            for (int j = i; j < cant - 1; j++) {
                visitorr[j] = visitorr[j + 1];  
            }
            visitorr[cant - 1] = null;  
            cant--;                    
            return true;                 
        }
    }
    return false;  

    }

    @Override
public Visitor find(Object id) {
    for (int i = 0; i < cant; i++) {
        if (visitorr[i].getName().equals(id)) {  
            return visitorr[i];
        }
    }
    return null;  
}

@Override
public void showAll() {
    for (int i = 0; i < cant; i++) {
        System.out.println(visitorr[i]);
    } 
}
}
