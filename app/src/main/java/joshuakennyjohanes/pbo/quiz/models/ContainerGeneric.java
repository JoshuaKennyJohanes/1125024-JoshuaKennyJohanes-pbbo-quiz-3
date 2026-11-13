package joshuakennyjohanes.pbo.quiz.models;


import java.util.ArrayList;
import java.util.List;

public class ContainerGeneric<T extends BoxGeneric<T>>{
    List<String> newString = new ArrayList<>();
    List<BoxGeneric<T>> newContainerList = new ArrayList<>();

    public void addBox(BoxGeneric newBox){
        newContainerList.add(newBox);


    }

    public void printContainer(){
        for(BoxGeneric<T> item : newContainerList){
            item.printData();
        }
    }
}
