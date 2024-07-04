package org.example.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {
    List<ConfigurationMemento> list = new ArrayList<>();
    public void addMemento(ConfigurationMemento memento){
        list.add(memento);
    }
    public ConfigurationMemento Undo(){
        ConfigurationMemento memento = null;
        if(!list.isEmpty()) {
            memento = list.get(list.size() - 1);
            list.remove(memento);
            return memento;
        }
        return memento;
    }


}
