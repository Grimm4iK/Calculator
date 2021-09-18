package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            System.out.print("Введите выражение: ");
            String foo = scanner.next();
            System.out.println(engine.eval(foo));
        }catch (Exception e){
            System.out.println("Неверный формат строки!!!");
        }
    }
}
