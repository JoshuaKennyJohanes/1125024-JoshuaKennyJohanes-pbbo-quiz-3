
package joshuakennyjohanes.pbo.quiz.models;

import java.util.ArrayList;
import java.util.List;

import joshuakennyjohanes.pbo.quiz.utils.GenericUtils;



public abstract  class DataView<T> {
    private List<T> records  = new ArrayList<>();


    public void printAll(){
        System.out.println("LIST RECORDS");
        //cetak header
        String [] headers = getFields();
        for(int i  = 0 ; i < headers.length ; i++){
            System.out.print(headers[i]+"   ");
        }

        System.out.println();
        //cetak isinya
        for(T item : records){
            String[] isiRecords  = convertModelToValues(item);
            for(int i = 0 ; i < isiRecords.length ; i++){
                System.out.print(isiRecords[i]+" ");

            }
            System.out.println();
        }
    }


    public void printByPk(String primaryKey){
        //print baris berdasarkana primaryKey
        for(T item : records){
            if(getPrimaryKeyValue(item).equals(primaryKey)){
                String [] foundRecords = convertModelToValues(item);
                for(int i = 0 ; i < foundRecords.length ; i++){
                    System.out.print(foundRecords[i]+"  ");
                }
            }
        }

    }

    public void showInsertForm(){
        System.out.println("INPUT DATA BARU");
        String[] getFields = getFields();
        

        String[] values = new String[getFields().length];
        for(int i = 0 ; i < getFields.length ; i++){
            System.out.println(getFields[i]+": ");
            GenericUtils.readLine();
            values[i] = GenericUtils.readString();
            
        }
        //tambah record baru
        records.add(convertValueToModels(values));

    }

    public void showUpdateForm(){   
        System.out.println("UPDATE LIST DATA");
        System.out.println("MASUKAN PK DATA: ");
        String pk = GenericUtils.readString();
        T foundRecords;

        for(int i = 0 ; i < records.size() ; i++){
            if(pk.equals(getPrimaryKeyValue(records.get(i)))){
                foundRecords = records.get(i);
                String[] oldRecords = convertModelToValues(foundRecords);
                String[] newRecords = new String[oldRecords.length];
                for(int j  = 0 ; j < oldRecords.length ; j++){
                        System.out.print(oldRecords[j]+" Jadi--: ");
                        newRecords[j] = GenericUtils.readString();
                        System.out.println();
                }
                T updatedRecords = convertValueToModels(newRecords);
                records.set(i, updatedRecords);
            }

            }
        }

        

    public void promptDelete(){
        System.out.println("DELETE LIST DATA");
        String pk = GenericUtils.readString();
        T foundRecords;
        for(int i = 0 ; i < records.size() ; i++){
            if(pk.equals(getPrimaryKeyValue(records.get(i)))){
                records.remove(i);
                System.out.println("DELETE BERHASIL");
            }
            }
        }

    protected abstract String getPrimaryKeyValue(T data);



    //ngasi nama kolom
    protected abstract String[] getFields();

    protected abstract T convertValueToModels(String[] values);
    
    //ngasi isinya si baris
    protected abstract String[] convertModelToValues(T data);

}

