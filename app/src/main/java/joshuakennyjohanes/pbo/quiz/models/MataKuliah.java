package joshuakennyjohanes.pbo.quiz.models;

public class MataKuliah {
    private String kode;
    private String nama;
    private int jumlahSks;
    private int semester;

    public MataKuliah(String kode, String nama, int jumlahSks, int semester){
        this.kode = kode;
        this.nama = nama;
        this.jumlahSks = jumlahSks;
        this.semester = semester;
    }

    public String getKode(){
        return this.kode;
    }

    public String getNama(){
        return this.nama;
    }

    public int getJumlahSks(){
        return this.jumlahSks;
    }

    public int getSemester(){
        return this.semester;
    }
    
}
