package Controller07175;

import Entity07175.AnggotaEntity07175;
import Entity07175.BukuEntity07175;
import Entity07175.PeminjamanEntity07175;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public interface PeminjamanControllerInterface07175 {
    void insertPeminjaman07175(BukuEntity07175 buku07175, AnggotaEntity07175 anggota07175);
    void verifPengembalian07175(String idPeminjaman07175);
    ArrayList<PeminjamanEntity07175> showAllData07175();
    ArrayList<PeminjamanEntity07175> showDataByPeminjam07175(int id07175);
    public DefaultTableModel daftarPeminjamById07175(int cek07175);
    DefaultTableModel daftarPeminjam07175();
}
