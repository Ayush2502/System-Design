package org.example.InterpreterDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String, Integer> map = new HashMap<>();
    public void put(String str, int val){
        map.put(str,val);
    }
    public int get(String value){
        return map.get(value);
    }
}
