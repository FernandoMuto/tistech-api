/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.tistech.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Fernando Muto
 */
public class GenerateNumberService { 
    
    public int createNumberC(int firstNumber, int secondNumber){
    
        String numberA = Integer.toString(firstNumber);
        String numberB = Integer.toString(secondNumber);
        ArrayList<String> numberC = new ArrayList<>(); 
        
        Iterator<String> iterateNumberA = new ArrayList<>(Arrays.asList(numberA.split(""))).iterator();
        Iterator<String> iterateNumberB = new ArrayList<>(Arrays.asList(numberB.split(""))).iterator();
        
        while(iterateNumberA.hasNext() && iterateNumberB.hasNext()){ 
            numberC.add(iterateNumberA.next());
            numberC.add(iterateNumberB.next());
        }
        
        while(iterateNumberA.hasNext()){ 
            numberC.add(iterateNumberA.next());
        }
        
        while(iterateNumberB.hasNext()){ 
            numberC.add(iterateNumberB.next());
        }
        
        StringBuilder strb = new StringBuilder();
        numberC.forEach((obj) -> {
            strb.append(obj);
        });
        
        int resultNumber = Integer.valueOf(strb.toString()); // casting para facilitar a validação
        
        return resultNumber > 1000000 ? -1 : resultNumber; 
    }
    
}
