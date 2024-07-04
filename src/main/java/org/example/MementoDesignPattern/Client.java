package org.example.MementoDesignPattern;

public class Client {
    public static  void main(String args[]){
        ConfigurationCaretaker configurationCaretaker = new ConfigurationCaretaker();
        //initial Object state
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5,10);
        //Snapshot or the state we wanted to keep a track of .
        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
        configurationCaretaker.addMemento(snapshot1);

        //changing the state of the object.
        configurationOriginator.setHeight(7);
        configurationOriginator.setWeight(12);
        //Creating the snapshot again
        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
        configurationCaretaker.addMemento(snapshot2);

        ConfigurationMemento memento = configurationCaretaker.Undo();
        System.out.println(memento.toString());
    }
}
