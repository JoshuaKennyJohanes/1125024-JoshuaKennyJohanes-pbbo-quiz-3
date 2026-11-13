package joshuakennyjohanes.pbo.quiz.models;

public class RuanganDataView extends DataView<Ruangan>{
    @Override
    public String getPrimaryKeyValue(Ruangan ruangan){
        return ruangan.getId();
    }

    @Override 
    protected String[] getFields(){
        String [] fieldsRuangan = new String[4];
        fieldsRuangan[1] = "ID";
        fieldsRuangan[0] = "Nama";
        fieldsRuangan[2] = "Lokasi Lantai";
        fieldsRuangan[3] = "Kapasitas";

        return fieldsRuangan;
    }

    @Override
    protected Ruangan convertValueToModels(String[] values){
        Ruangan newRuangan = new Ruangan(values[0],values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]));
        return newRuangan;
    }
    protected String[] convertModelToValues(Ruangan ruangan){
        String[] isibaris = new String[4];
        isibaris[0] = ruangan.getId();
        isibaris[1] = ruangan.getNama();
        isibaris[2] = String.valueOf(ruangan.getLokasiLantai());
        isibaris[3] = String.valueOf(ruangan.getKapasitas());
        return isibaris;
    }
}
