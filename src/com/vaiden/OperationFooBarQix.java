package com.vaiden;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class OperationFooBar {
    private int firstNum = 1;
    private int end = 100;
    private static Map<Integer, String> strategy = new HashMap<>();{
        strategy.put(3, "Foo");
        strategy.put(5, "Bar");
        strategy.put(7, "Qix");
    }
    OperationFooBar(){
        while(firstNum<=end){
            System.out.println(firstNum +" "+ fooBarQix(firstNum));
            firstNum++;
        }
    }
    private String fooBarQix(int firstNum) {

        String FBQ = "";
        for (Entry<Integer, String> remainder : strategy.entrySet()) {

            if(firstNum % remainder.getKey() == 0){
                FBQ += remainder.getValue();
            }
        }
        if(firstNum > 9){
            FBQ += strategy.containsKey(firstNum / 10)? strategy.get(firstNum / 10) : "";
            firstNum = firstNum % 10;
        }
        FBQ += strategy.containsKey(firstNum)? strategy.get(firstNum) : "";
        return FBQ;
    }
}