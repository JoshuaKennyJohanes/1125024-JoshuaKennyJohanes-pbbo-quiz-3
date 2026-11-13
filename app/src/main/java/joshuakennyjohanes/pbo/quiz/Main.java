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
        while (status) {/*  */
            int pilihanView = Menus.MenuUtama();
            GenericUtils.readString();
            System.out.println();

            switch (pilihanView) {
                case 1:
                    int pilihanMahasiswa = Menus.MainMenu();
                    switch (pilihanMahasiswa) {
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
                    int pilihanMatakuliah = Menus.MainMenu();
                    switch (pilihanMatakuliah) {
                        case 1:
                            viewMatakuliah.printAll();
                            break;
                        case 2:
                            System.out.println("MASUKAN PK: ");
                            String pk = GenericUtils.readString();
                            viewMatakuliah.printByPk(pk);
                            break;
                        case 3:
                            viewMatakuliah.showInsertForm();
                            break;
                        case 4:
                            viewMatakuliah.showUpdateForm();
                            break;
                        case 5:
                            viewMatakuliah.promptDelete();
                            break;
                        case 0:
                            status = false;
                            break;
                    }
                    break;
                case 3:
                    int pilihanRuangan = Menus.MainMenu();
                    switch (pilihanRuangan) {
                        case 1:
                            viewRuangan.printAll();
                            break;
                        case 2:
                            System.out.println("MASUKAN PK: ");
                            String pk = GenericUtils.readString();
                            viewRuangan.printByPk(pk);
                            break;
                        case 3:
                            viewRuangan.showInsertForm();
                            break;
                        case 4:
                            viewRuangan.showUpdateForm();
                            break;
                        case 5:
                            viewRuangan.promptDelete();
                            break;
                        case 0:
                            status = false;
                            break;
                    }
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }
}
