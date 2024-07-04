package org.example.AdapterDesignPattern;

import org.example.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import org.example.AdapterDesignPattern.Adapter.WeightMachineForBabiesInKg;

public class Client {
    public static void main(String agrs[]){
        WeightMachineForBabiesInKg weightMachineForBabiesInKg = new WeightMachineForBabiesInKg(new WeightMachineForBabies());
        System.out.println(weightMachineForBabiesInKg.getweightInKgs());
    }
}
