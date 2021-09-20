package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        while (true) {
            System.out.print("Введите выражение: ");
            String exp = scanner.nextLine();

            if (CheckValidation(exp)) {
                try {
                    System.out.print("Результат: " + engine.eval(exp));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static boolean CheckValidation(String expression) {
        String zeroRegex = "/0";
        String validateRegex = "^-?\\d+\\s*[+-/*]\\s*(\\(-(\\d+|\\d+\\.\\d+)\\)|(\\d+|\\d+\\.\\d+))\\s*([+\\-*/]\\s*(\\(-(\\d+|\\d+\\.\\d+)\\)|(\\d+|\\d+\\.\\d+))+\\s*)*$";
        Pattern pattern = Pattern.compile(zeroRegex);
        Matcher matcher = pattern.matcher(expression);

        if (!Pattern.matches(validateRegex, expression)) {
            System.out.println("Не верный формат, попробуйте еще раз");
            return false;
        } else if (matcher.find()) {
            System.out.println("Попытка делить на 0");
            return false;
        }

        return true;
    }
}
