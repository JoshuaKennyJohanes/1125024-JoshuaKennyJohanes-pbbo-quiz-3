package main.java.joshuakennyjohanes.pbo.quiz.models;

//simpla generic class

public class BoxGeneric<T> {
    private T data;
    public BoxGeneric(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void printData(){
        System.out.println(data);
    }
}
