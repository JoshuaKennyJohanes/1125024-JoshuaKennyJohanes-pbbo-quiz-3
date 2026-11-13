package joshuakennyjohanes.pbo.quiz.models;

public class Ruangan {
    private String id;
    private String nama;
    private int lokasiLantai;
    private int kapasitas;

    public Ruangan(String id, String nama, int lokasiLantai, int kapasitas){
        this.id = id;
        this.nama =nama;
        this.lokasiLantai = lokasiLantai;
        this.kapasitas = kapasitas;
    }


    public String getId(){
        return this.id;
    }

    
    public String getNama(){
        return this.nama;
    }


    public int getLokasiLantai(){
        return this.lokasiLantai;
    }

    public int getKapasitas(){
        return this.kapasitas;
    }
    
}
