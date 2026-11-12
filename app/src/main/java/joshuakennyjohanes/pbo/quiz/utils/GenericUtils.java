package joshuakennyjohanes.pbo.quiz.utils;


import java.util.List;

public class GenericUtils {
    
    //method dengan parameter generic (Paremeternya bebas masuk apa saja), cocok kalau ada struktur data
    public <T> void printListGeneric(List<T> list){
        for(T item : list){
            System.out.println(item);
        }
    }

    //method dengan return type generic?
    public <T extends Integer> T getListGeneric(List<T> list){
        T fetchedData;
        fetchedData = list.getFirst();
        return fetchedData;
    }



}
