package com.company;

import java.util.Scanner;

//Считает выражение из двух чисел
public class TestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение(пример 2*2): ");
        String st = scanner.next();
        int result;
        try {
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == '+') {
                    result = Integer.parseInt(st.substring(0, i)) + Integer.parseInt(st.substring(i + 1));
                    System.out.print(result);
                } else if (st.charAt(i) == '-') {
                    result = Integer.parseInt(st.substring(0, i)) - Integer.parseInt(st.substring(i + 1));
                    System.out.print(result);
                } else if (st.charAt(i) == '*') {
                    result = Integer.parseInt(st.substring(0, i)) * Integer.parseInt(st.substring(i + 1));
                    System.out.print(result);
                } else if (st.charAt(i) == '/') {
                    result = Integer.parseInt(st.substring(0, i)) / Integer.parseInt(st.substring(i + 1));
                    System.out.print(result);
                }
            }
        } catch (Exception e) {
            System.out.println("Не верный формат строки !!!");
        }
    }
}
