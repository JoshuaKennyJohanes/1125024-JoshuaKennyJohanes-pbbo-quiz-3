package joshuakennyjohanes.pbo.quiz;

import joshuakennyjohanes.pbo.quiz.models.MahasiswaDataView;
import joshuakennyjohanes.pbo.quiz.models.MatakuliahDataView;
import joshuakennyjohanes.pbo.quiz.models.RuanganDataView;
import joshuakennyjohanes.pbo.quiz.utils.GenericUtils;
import joshuakennyjohanes.pbo.quiz.view.Menus;

public class Main {

    public static void main(String[] args) {
        MahasiswaDataView viewMahasiswa = new MahasiswaDataView();
        RuanganDataView viewRuangan = new RuanganDataView();
        MatakuliahDataView viewMatakuliah = new MatakuliahDataView();

        boolean status = true;
        while (status) {
            int pilihanView = Menus.MenuUtama();
            GenericUtils.readLine();
            System.out.println();

            switch (pilihanView) {
                case 1:
                    int pilihan = Menus.MainMenu();
                    switch (pilihan) {
                        case 1:
                            viewMahasiswa.printAll();
                            break;
                        case 2:
                            System.out.println("MASUKAN PK: ");
                            String pk = GenericUtils.readString();
                            viewMahasiswa.printByPk(pk);
                            break;
                        case 3:
                            viewMahasiswa.showInsertForm();
                            break;
                        case 4:
                            viewMahasiswa.showUpdateForm();
                            break;
                        case 5:
                            viewMahasiswa.promptDelete();
                            break;
                        case 0:
                            status = false;
                            break;

                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    throw new AssertionError();
            }

            

        }

    }
}
