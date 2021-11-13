package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> men = new ArrayList<>();
        men.add("Кубат");
        men.add("Мухамммед");
        men.add("Али");
        men.add("Муха");
        men.add("Даниил");

        System.out.println(men);

      /*  System.out.println("Введите имя первой женщины");
        String woman1 = scanner.next();
        System.out.println("Введите имя второй женщины");
        String woman2 = scanner.next();
        System.out.println("Введите имя третей женщины");
        String woman3 = scanner.next();
        System.out.println("Введите имя четвертой женщины");
        String woman4 = scanner.next();
        System.out.println("Введите имя пятой женщины");
        String woman5 = scanner.next();*/

        ArrayList<String> women = new ArrayList<>();
        women.add("Малика");
        women.add("Нурайым");
        women.add("Акмарал");
        women.add("Даткайым");
        women.add("Сайкал");

        Collections.reverse(women);

        men.addAll(women);

        ArrayList<String> people = new ArrayList<>();
        int countMen = 0;
        int countWomen = 0;

        for (int i = 0; i < (men.size()); i++) {
            if ((i % 2) == 0) {
                people.add(men.get(countMen));
                countMen++;

            } else {
                people.add(women.get(countWomen));
                countWomen++;
            }
        }
        System.out.println("Список C " + people);

        people.sort(Comparator.comparing(String::length));
        System.out.println("Отсортированный список " + people);
    }
}
