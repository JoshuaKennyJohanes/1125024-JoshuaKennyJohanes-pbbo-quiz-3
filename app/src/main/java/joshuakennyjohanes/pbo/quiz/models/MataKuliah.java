package joshuakennyjohanes.pbo.quiz.models;

public class MataKuliah {
    private String kode;
    private String nama;
    private int jumlahSks;

    public Matakuliah(String kode, String nama, int jumlahSks){
        this.kode = kode;
        this.nama = nama;
        this.jumlahSks = jumlahSks;
    }

    public String getKode(){
        return this.kode;
    }

    public String getNama(){
        return this.nama;
    }

    public int jumlahSks(){
        return this.jumlahSks;
    }
    
}
