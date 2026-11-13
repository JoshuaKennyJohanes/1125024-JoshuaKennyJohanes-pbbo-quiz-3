package joshuakennyjohanes.pbo.quiz.view;

import joshuakennyjohanes.pbo.quiz.utils.GenericUtils;


public class Menus {
    
    public static int MainMenu(){
        System.out.println("==== PILIH MENU ====");
        System.out.println("1. Tampilkan Semua Data");
        System.out.println("2. Cari Satu data");
        System.out.println("3. Tambah Data");
        System.out.println("4. Ubah Data");
        System.out.println("5. Delete Data");
        System.out.println("0. Keluar Aplikasi");
        int pilihan = GenericUtils.readInt();
        return pilihan;
    }
    
    public static int MenuUtama(){
        System.out.println("SELAMAT DATANG DI ITHB");
        System.out.println("1.Mahasiswa");
        System.out.println("2. Mata Kuliah");
        System.out.println("3. Ruangan");
        int pilihan = GenericUtils.readInt();
        return pilihan;
        
        
    }

}
