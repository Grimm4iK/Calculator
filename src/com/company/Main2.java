package com.company;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main2 {
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
