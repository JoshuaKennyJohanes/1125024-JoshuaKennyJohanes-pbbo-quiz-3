package joshuakennyjohanes.pbo.quiz.view;

import joshuakennyjohanes.pbo.quiz.utils.GenericUtils;


public class Menus {
    
    public static int MainMenu(){
        System.out.println("1. Tampilkan Semua Data");
        System.out.println("2. Cari Satu data");
        System.out.println("3. Tamabah Data");
        System.out.println("4. Ubah Data");
        System.out.println("5. Delete Data");
        int pilihan = GenericUtils.readInt();
        return pilihan;

    }
}
