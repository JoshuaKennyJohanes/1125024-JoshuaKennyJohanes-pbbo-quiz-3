package joshuakennyjohanes.pbo.quiz.models;

public class MatakuliahDataView extends DataView<MataKuliah>{
    @Override
    public String getPrimaryKeyValue(MataKuliah matkul){
        return matkul.getKode();
    }

    protected String[] getFields(){
        String [] fieldsMatkul = new String[4];
        fieldsMatkul[1] = "Nama";
        fieldsMatkul[0] = "Kode";
        fieldsMatkul[2] = "Jumlah Sks";
        fieldsMatkul[3] = "Semester";

        return fieldsMatkul;
    }

    @Override
    protected MataKuliah convertValueToModels(String[] values){
        MataKuliah newMatkul = new MataKuliah(values[0],values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]));
        return newMatkul;
    }
    protected String[] convertModelToValues(MataKuliah mataKuliah){
        String[] isibaris = new String[4];
        isibaris[0] = mataKuliah.getKode();
        isibaris[1] = mataKuliah.getNama();
        isibaris[2] = String.valueOf(mataKuliah.getJumlahSks());
        isibaris[3] = String.valueOf(mataKuliah.getSemester());
        return isibaris;
    }
}
