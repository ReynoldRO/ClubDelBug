/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;

/**
 *
 * @author gipsy
 */
public class EmployeeList implements List<Employee>{
    private Employee employees[];
    private int count;

    public EmployeeList() {
        this.employees = new Employee[100];
        this.count = 0;
    }

    @Override
    public boolean add(Employee t) {
       if(t == null || count >= employees.length)
       return false;
       employees[count++] = t;
       return true;
       
    }

    @Override
    public boolean remove(Employee t) {
       if(t ==null)return false;
     for(int i = 0; i < count; i++){
         if (employees[i].equals(t)){
             for (int j = i; j < count -1; j++)
             {
         employees[i] = employees[j + 1];
     }
             employees[--count]=null;
             return true;
    }
     }
return false;
     }
     
    @Override
    public Employee find(Object id) {
       for (int i = 0; i < count; i++){
           if (employees[i] != null && employees[i].getId().equals(id)){
               return employees[i];
               
           }
       }
       return null;
    }

    @Override
    public void showAll() {
   for (int i = 0; i< count; i++){
       if (employees[i] != null){
           System.out.println(employees[i]);
       }
   }
    }
    
    
}
