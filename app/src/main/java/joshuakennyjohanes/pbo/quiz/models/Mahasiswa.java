package joshuakennyjohanes.pbo.quiz.models;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String email;
    private int umur;
    
    public Mahasiswa(String nim, String nama, String email, int umur){
        this.nim = nim;
        this.nama = nama;
        this.email = email;
        this.umur = umur;
    }


    public String getNim(){
        return this.nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getEmail(){
        return this.email;
    }

    public int getUmur(){
        return this.umur;
    }


    public int getTotalFields(){
        return 4;
    }


}
