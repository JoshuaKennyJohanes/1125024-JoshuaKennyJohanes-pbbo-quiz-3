package joshuakennyjohanes.pbo.quiz.models;

import java.util.ArrayList;
import java.util.List;

public class BelajarPboList<T extends Box<T>> {
    List<T> listBelajarPbo = new ArrayList<>();

    public BelajarPboList(T newBox){
    }

    public void add(T newBox){
        listBelajarPbo.add(newBox);
    }

    public void printList(){
        for(T item : listBelajarPbo){
            System.out.println(item.getData());
        }
    }

    public <J extends Comparable<J>> void printListSorted(){
        // Collections.sort(listBelajarPbo);
    } 


    
}
