package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Employee> liste = new LinkedList<>();


        liste.add(new Employee(42, "Ahmet", "Ahmetğlu"));
        liste.add(new Employee(42, "Ahmet", "Ahmetğlu"));
        liste.add(new Employee(42, "Ahmet", "Ahmetğlu"));
        liste.add(new Employee(43, "Ali", "Alioğlu"));
        liste.add(new Employee(9, "Cem", "Cemoğlu"));


    }

    public static List<Employee> findDuplicates(List<Employee> employees) {
        List<Employee> yeniListe = new LinkedList<>();
        Set<Integer> seenIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!seenIds.add(employee.getId())) { // Eğer id daha önce eklenmişse
                duplicateIds.add(employee.getId());
            }
        }

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (duplicateIds.contains(employee.getId()) && !yeniListe.contains(employee)) {
                yeniListe.add(employee);
            }
        }

        return yeniListe;
    }


    public static Map<Integer, Employee> findUniques(List<Employee> employees) {
        Map<Integer, Employee> haritam = new HashMap<>();

        for (Employee employee: employees) {
            if (employee == null) {
                continue;
            }
            haritam.put(employee.getId(), employee);
        }

        return haritam;
    }


    public static List<Employee> removeDuplicates(List<Employee> employees) {
        List<Employee> yeniListe = new LinkedList<>(employees);
        Set<Integer> seenIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (!seenIds.add(employee.getId())) { // Eğer id daha önce eklenmişse
                duplicateIds.add(employee.getId());
            }
        }

        for (Employee employee : employees) {

            if (employee == null || duplicateIds.contains(employee.getId())) {
                yeniListe.remove(employee);
            }
        }

        return yeniListe;
    }


}























