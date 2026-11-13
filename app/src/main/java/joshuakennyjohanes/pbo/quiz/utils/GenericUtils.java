package joshuakennyjohanes.pbo.quiz.utils;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GenericUtils {
    static Scanner input = new Scanner(System.in);

    public static String readString(){
        return input.nextLine();
    }

    public static int readInt(){
        return input.nextInt();
        
    }

    public static String readLine(){
        return input.nextLine();
    }

    
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

    //method dengan parameter wildcard
    public void setListWildcard(List<?> list){


    }

    //method dengan return type wildcard (sangat tidak disarankan sebuah method mereturn wildcard, karena anti pattern)
    public List<?> returnTypeWildCard(List<?> list){
        return list;
    }

    //method dengan COmparabel

    public static <T extends Comparable<T>> void printListSorted(List<T> unsortedList){
        //tentukan panjang list (tanpa menggunakan collections.sort), pakai bubble sort
        int length = unsortedList.size();

        //copas dulu biar ga berubah
        
        List<T> sortedList = unsortedList;

        for(int i = 0 ; i < length -1; i++){
            for(int j = 0; j < length -1 -i ; j++){
                if(sortedList.get(j).compareTo(sortedList.get(j+1))>0){
                    T temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j+1));
                    sortedList.set(j+1 , temp);
                    
                }

            }   
        }

        //Print dari awal sampai akhir
        for(T item : sortedList){
            System.out.print(item);
        }
    }


    public static<T extends Comparable<T>> void printListSortedUsingCollection(List<T> unsortedList){
        //copas
        List<T> sortedList = unsortedList;
        Collections.sort(sortedList);
        
        for(T item : sortedList){
            System.out.print(item);
        }
    }



}
