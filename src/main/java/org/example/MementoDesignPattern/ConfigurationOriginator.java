package org.example.MementoDesignPattern;

public class ConfigurationOriginator {
    int height ;
    int weight ;

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

    public ConfigurationOriginator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.weight);
    }
    public void restore(ConfigurationMemento memento){
        this.height = memento.height;
        this.weight = memento.weight;
    }
}
