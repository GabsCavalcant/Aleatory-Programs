package services;

import java.util.ArrayList;
import java.util.List;
 //Basicamente em vez de eu criar outra classe basta apenas instanciar a classse
 //Em <> Tipo generico, onde recebe qq tipo de valur seja int, string, etc!
 
public class PrintService<T> {



    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T fisrt() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }

}
