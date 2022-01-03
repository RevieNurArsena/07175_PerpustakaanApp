package Controller07175;

import Entity07175.BukuEntity07175;
import java.util.ArrayList;

public class BukuControllerInterfaceImpl07175 implements BukuControllerInterface07175{

    @Override
    public void insertBuku07175(String isbn07175, String judul07175, String penerbit07175, String terbit07175, int halaman07175) {
        AllObjectModel07175.bukuModel07175.add07175(new BukuEntity07175(isbn07175, judul07175, penerbit07175, halaman07175, halaman07175));
    }

    @Override
    public void deleteBuku07175(String isbn07175) {
        AllObjectModel07175.bukuModel07175.delete07175(isbn07175);
    }

    @Override
    public void updateBuku07175(int pilih07175, String data07175, String isbn07175) {
        switch(pilih07175){
            case 1:
               AllObjectModel07175.bukuModel07175.updateJudul07175(data07175, isbn07175);
               break;
            case 2:
                AllObjectModel07175.bukuModel07175.updatePenerbit07175(data07175, isbn07175);
                break;
        }
    }

    @Override
    public ArrayList<BukuEntity07175> showAllData07175() {
        return AllObjectModel07175.bukuModel07175.getAll07175();
    }

    @Override
    public BukuEntity07175 getData07175(String isbn07175) {
        return AllObjectModel07175.bukuModel07175.getById07175(isbn07175);
    }
    
}
