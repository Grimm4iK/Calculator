package com.company;

import java.util.Scanner;

public class Calculator2 {
    private  String[] tokens;
    private  int pos;

    public static void main(String[] args) {
try {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Пример ввода: 2 + 2 * 2");
    System.out.println("Введите свое выражение через пробел: ");
    String expr = scanner.nextLine();
    scanner.close();
    Calculator2 calculator = new Calculator2(expr);
    System.out.println(expr + " = " + calculator.calculate());
}catch (Exception e){
    System.out.println("Не верный формат ввода!");
}
    }

    public Calculator2(String expr) {
        this.tokens = expr.split(" ");
        this.pos = 0;
    }

    public double calculate(){
        double first = multiply();

        while (pos < tokens.length) {
            String operator = tokens[pos];
            if (!operator.equals("+") && !operator.equals("-")){
                break;
            }else {
                pos++;
            }

            double second = multiply();
            if (operator.equals("+")){
                first += second;
            }else {
                first -= second;
            }
        }
        return first;
    }

    public double multiply(){
        double first = Double.parseDouble(tokens[pos++]);

        while (pos < tokens.length) {
            String operator = tokens[pos];
            if (!operator.equals("*") && !operator.equals("/")){
                break;
            }else {
                pos++;
            }

            double second = Double.parseDouble(tokens[pos++]);
            if (operator.equals("*")){
                first *= second;
            }else {
                first /= second;
            }
        }
        return first;
    }
}
