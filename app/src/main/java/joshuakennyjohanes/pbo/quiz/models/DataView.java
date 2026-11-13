
package joshuakennyjohanes.pbo.quiz.models;

import java.util.ArrayList;
import java.util.List;



public abstract  class DataView<T> {
    private List<T> records  = new ArrayList<>();


    public void printAll(){
        System.out.println("LIST RECORDS");

        //cetak header
        String [] headers = records.getFields();


        for(T item : records){
            
        }
    }


    public void printByPk(String primaryKey){

    }

    public void showInsertForm(){

    }

    public void showUpdateForm(){

    }

    public void promptDelete(){

    }

    protected abstract String getPrimaryKeyValue(T data);



    //ngasi nama kolom
    protected abstract String[] getFields();

    protected abstract T converValueToModels(String[] values);
    
    //ngasi isinya si baris
    protected abstract String[] convertModelToValues(T data);

}
