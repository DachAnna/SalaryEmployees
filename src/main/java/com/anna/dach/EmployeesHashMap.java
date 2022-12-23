package com.anna.dach;

import java.util.HashMap;
import java.util.Map;

public class EmployeesHashMap {

    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addEmployees();
        printEmployeesInfo();
    }

    public static void addEmployees() {
        System.out.println("Средняя выработка сотрудника за месяц:");
        grades.put("Олег", 4.3d);
        grades.put("Петр", 4.1d);
        grades.put("Антон", 4.9d);
        grades.put("Иван", 3.7d);
        grades.put("Степан", 3.2d);
    }

    public static void printEmployeesInfo() {
        for (Map.Entry<String, Double> pair : grades.entrySet()) {
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
