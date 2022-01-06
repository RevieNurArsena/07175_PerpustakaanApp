package Controller07175;

import Entity07175.AnggotaEntity07175;
import Entity07175.BukuEntity07175;
import Entity07175.PeminjamanEntity07175;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

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
    
    public int cari07175(String id07175){
        int i=0, cari07175=-1;
        
        while(i < showAllData07175().size()){
            if(id07175 == showAllData07175().get(i).getIdPeminjaman07175()){
                cari07175 = i;
            }
            i++;
        }
        return cari07175;
    }
    
    public DefaultTableModel daftarPeminjamById07175(String cek07175){
        int index07175 = cari07175(cek07175);
        DefaultTableModel dataPeminjam07175 = new DefaultTableModel();
        
        Object [] kolom07175 = {"ID", "ISBN", "JUDUL" ,"PEMINJAM", "TGL PINJAM", "TGL KEMBALI", "STATUS"};
        dataPeminjam07175.setColumnIdentifiers(kolom07175);
        int size07175 = showAllData07175().size();
        
        for(int i=0; i<size07175; i++){
            Object[] data07175 = new Object[7];
            data07175[0] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).getIdPeminjaman07175();
            data07175[1] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).getBuku07175().getIsbn07175();
            data07175[2] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).getBuku07175().getJudul07175();
            data07175[3] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).getAnggota07175().getNama07175();
            data07175[4] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).getTglPeminjaman07175();
            data07175[5] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).getTglPengembalian07175();
            data07175[6] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(index07175).isStatusPeminjaman07175();
            dataPeminjam07175.addRow(data07175);
        }
        return dataPeminjam07175;
    }
    
    public DefaultTableModel daftarPeminjam07175(){
        DefaultTableModel dataPeminjam07175 = new DefaultTableModel();
        
        Object [] kolom07175 = {"ID", "ISBN", "JUDUL" ,"PEMINJAM", "TGL PINJAM", "TGL KEMBALI", "STATUS"};
        dataPeminjam07175.setColumnIdentifiers(kolom07175);
        int size07175 = showAllData07175().size();
        
        for(int i=0; i<size07175; i++){
            Object[] data07175 = new Object[7];
            data07175[0] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).getIdPeminjaman07175();
            data07175[1] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).getBuku07175().getIsbn07175();
            data07175[2] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).getBuku07175().getJudul07175();
            data07175[3] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).getAnggota07175().getNama07175();
            data07175[4] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).getTglPeminjaman07175();
            data07175[5] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).getTglPengembalian07175();
            data07175[6] = AllObjectModel07175.peminjamaModel07175.getAll07175().get(i).isStatusPeminjaman07175();
            dataPeminjam07175.addRow(data07175);
        }
        return dataPeminjam07175;
    }
}
