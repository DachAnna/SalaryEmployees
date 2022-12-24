package com.anna.dach;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeesHashSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Антон");
        set.add("Игорь");
        set.add("Петр");
        set.add("Константин");
        set.add("Степан");
        set.add("Олег");

        System.out.println("На сегодняшний день в нашей компании работают" + "\n" + set + "\n" + "Введите имя сотрудника для увольнения:");
        removeEmployees(set);
        restOfEmployees(set);
    }

    public static void removeEmployees(HashSet<String> set) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if (set.contains(str)) {
            set.remove(str);
            System.out.println(str + " уволен...");
        } else {
            System.out.println(str + " в компании не числится");
        }
    }

    public static void restOfEmployees(HashSet<String> set) {
        System.out.println("Остались работать:");
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            for (int j = 1; j <= set.size(); j++) {
                System.out.println(j + ". " + i.next());
            }
    }
}
