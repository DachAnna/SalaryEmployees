package com.anna.dach;

public class EmployeesEnum {

    public enum Employees {
        Антон,
        Олег,
        Петр
    }

    public static void main(String[] args) {
        System.out.println("Лучшие сотрудники месяца:");
        System.out.println(Employees.Антон + " занимает " + (Employees.Антон.ordinal() + 1) + " место!");
        System.out.println(Employees.Олег + " занимает " + (Employees.Олег.ordinal() + 1) + " место!");
        System.out.println(Employees.Петр + " занимает " + (Employees.Петр.ordinal() + 1) + " место!");
    }
}
