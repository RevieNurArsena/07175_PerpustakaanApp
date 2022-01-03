package Controller07175;

import Entity07175.AnggotaEntity07175;
import Entity07175.BukuEntity07175;
import Entity07175.PeminjamanEntity07175;
import java.util.ArrayList;

public class PeminjamanControllerInterfaceImpl07175 implements PeminjamanControllerInterface07175{

    @Override
    public void insertPeminjaman07175(BukuEntity07175 buku07175, AnggotaEntity07175 anggota07175) {
        AllObjectModel07175.peminjamaModel07175.add07175(new PeminjamanEntity07175(buku07175, anggota07175));
    }

    @Override
    public void verifPengembalian07175(String idPeminjaman07175) {
        AllObjectModel07175.peminjamaModel07175.verifPengembalian07175(idPeminjaman07175);
    }

    @Override
    public ArrayList<PeminjamanEntity07175> showAllData07175() {
        return AllObjectModel07175.peminjamaModel07175.getAll07175();
    }

    @Override
    public ArrayList<PeminjamanEntity07175> showDataByPeminjam07175(int id07175) {
        return AllObjectModel07175.peminjamaModel07175.getByPeminjam(id07175);
    }
    
}
