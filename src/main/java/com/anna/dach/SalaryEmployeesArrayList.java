package com.anna.dach;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryEmployeesArrayList {

    public static ArrayList<String> waitingSalaryEmployees = new ArrayList<>();
    public static ArrayList<String> gotSalaryEmployees = new ArrayList<>();

    public static ArrayList<String> initWaitingEmployees() {
        waitingSalaryEmployees.add("Антон");
        waitingSalaryEmployees.add("Петр");
        waitingSalaryEmployees.add("Степан");
        waitingSalaryEmployees.add("Константин");
        return waitingSalaryEmployees;
    }

    public static ArrayList<String> gotSalaryEmployees() {
        gotSalaryEmployees.add("Иван");
        gotSalaryEmployees.add("Олег");
        return gotSalaryEmployees;
    }

    public static void main(String[] args) {
        System.out.println("Зарплату еще не получили: " + initWaitingEmployees());
        System.out.println("Зарплату получили: " + gotSalaryEmployees());
        allGotSalary();
    }

    public static void allGotSalary() {
        while (true) {
            paySalary(inputName());
            System.out.println("Зарплату еще не получили: " + waitingSalaryEmployees);
            System.out.println("Зарплату получили: " + gotSalaryEmployees);
            if (waitingSalaryEmployees.size() == 0) {
                System.out.println("Вся зарплата выдана. Все идут в бар!");
                break;
            }
        }
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя сотрудника, которому выдается зарплата:");
        String name = scanner.nextLine();
        return name;

    }

    public static ArrayList<String> paySalary(String name) {
        if (waitingSalaryEmployees.contains(name) && !gotSalaryEmployees.contains(name)) {
            gotSalaryEmployees.add(name);
            for (String str : waitingSalaryEmployees) {
                if (str != null && str.equals(name)) {
                    waitingSalaryEmployees.remove(str);
                    break;
                }
            }
        } else {
            if (gotSalaryEmployees.contains(name)) {
                System.out.println("Этот сотрудник уже получил свою зарплату!" + "\n");
            } else {
                System.out.println("Такого сотрудника в компании не существует!" + "\n");
            }
        }
        return waitingSalaryEmployees;
    }
}
