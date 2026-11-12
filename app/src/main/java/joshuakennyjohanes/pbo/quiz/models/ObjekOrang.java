package joshuakennyjohanes.pbo.quiz.models;

public class ObjekOrang implements Comparable<ObjekOrang> {
    private String nama;
    private int umur;

    public ObjekOrang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public int getUmur(){
        return this.umur;
    }

    @Override
    public int compareTo(ObjekOrang oranglain) {
        return Integer.compare(umur, oranglain.getUmur());
    }

    @Override
    public String toString() {
        return "Nama: " + nama + " Umur: "+ umur;
    }

    

    

    



}
