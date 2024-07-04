package org.example.AdapterDesignPattern.Adapter;

import org.example.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineForBabiesInKg implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public WeightMachineForBabiesInKg(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public double getweightInKgs() {
        double weightinpounds = weightMachine.getWeightInPound();
        return weightinpounds*(0.45);
    }
}
