package joshuakennyjohanes.pbo.quiz.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BelajarPboList<T extends Box<?>>  {
    List<T> listBelajarPbo = new ArrayList<>();

    public BelajarPboList(){
    }

    public void add(T newBox){
        listBelajarPbo.add(newBox);
    }

    public void printList(){
        for(Box<?> item : listBelajarPbo){
            System.out.println(item.getData());
        }
    }


    public void printListSorted(){
        List<T> sortedList = listBelajarPbo;
        Collections.sort(sortedList);

    }
     


    
}
