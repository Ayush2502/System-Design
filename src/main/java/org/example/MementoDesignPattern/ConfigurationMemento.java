package org.example.MementoDesignPattern;

public class ConfigurationMemento {
    int height ;
    int weight ;

    public ConfigurationMemento(int height , int weight){
        this.height=height;
        this.weight=weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ConfigurationMemento{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
