package Controller07175;

import Entity07175.BukuEntity07175;
import java.util.ArrayList;

public interface BukuControllerInterface07175 {
    void insertBuku07175(String isbn07175, String judul07175, String penerbit07175, String terbit07175, int halaman07175);
    void deleteBuku07175(String isbn07175);
    void updateBuku07175(int pilih07175, String data07175, String isbn07175);
    ArrayList<BukuEntity07175> showAllData07175();
    BukuEntity07175 getData07175(String isbn07175);
}
