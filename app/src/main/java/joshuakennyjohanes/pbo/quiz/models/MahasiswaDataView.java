package joshuakennyjohanes.pbo.quiz.models;


public class MahasiswaDataView extends DataView<Mahasiswa>{
        
    
    




    @Override
    public String getPrimaryKeyValue(Mahasiswa mahasiswa){
        return mahasiswa.getNim();
    }

    protected String[] getFields(){
        String [] fieldsMahasiswa = new String[4];
        fieldsMahasiswa[0] = "NIM";
        fieldsMahasiswa[1] = "Nama";
        fieldsMahasiswa[2] = "Email";
        fieldsMahasiswa[3] = "Umur";

        return fieldsMahasiswa;
    }


    @Override
    protected Mahasiswa convertValueToModels(String[] values){
        Mahasiswa newMahasiswa = new Mahasiswa(values[0],values[1],values[2],Integer.parseInt(values[3]));
        return newMahasiswa;
    }

    protected String[] convertModelToValues(Mahasiswa mahasiswa){
        String[] isibaris = new String[4];
        isibaris[0] = mahasiswa.getNim();
        isibaris[1] = mahasiswa.getNama();
        isibaris[2] = mahasiswa.getEmail();
        isibaris[3] = String.valueOf(mahasiswa.getUmur());
        return isibaris;

    
    }
}
