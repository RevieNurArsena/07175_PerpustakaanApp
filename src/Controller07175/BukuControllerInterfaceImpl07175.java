package Controller07175;

import Entity07175.BukuEntity07175;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class BukuControllerInterfaceImpl07175 implements BukuControllerInterface07175{

    @Override
    public void insertBuku07175(String isbn07175, String judul07175, String penerbit07175, int terbit07175, int halaman07175) {
        AllObjectModel07175.bukuModel07175.add07175(new BukuEntity07175(isbn07175, judul07175, penerbit07175, terbit07175, halaman07175));
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

    public int cari07175(String id07175){
        int i=0, cari07175=-1;
        
        while(i < showAllData07175().size()){
            if(id07175.equals(showAllData07175().get(i).getIsbn07175())){
                cari07175 = i;
            }
            i++;
        }
        return cari07175;
    }
    
    @Override
    public DefaultTableModel daftarBukuById07175(String cek07175) {
        int index07175 = cari07175(cek07175);
        DefaultTableModel databuku07175 = new DefaultTableModel();
        
        Object [] kolom07175 = {"ISBN", "JUDUL" ,"PENERBIT", "TERBIT", "HALAMAN"};
        databuku07175.setColumnIdentifiers(kolom07175);
        int size07175 = showAllData07175().size();
        
        for(int i=0; i<size07175; i++){
            Object[] data07175 = new Object[5];
            
            data07175[0] = AllObjectModel07175.bukuModel07175.getAll07175().get(index07175).getIsbn07175();
            data07175[1] = AllObjectModel07175.bukuModel07175.getAll07175().get(index07175).getJudul07175();
            data07175[2] = AllObjectModel07175.bukuModel07175.getAll07175().get(index07175).getPenerbit07175();
            data07175[3] = AllObjectModel07175.bukuModel07175.getAll07175().get(index07175).getTerbit07175();
            data07175[4] = AllObjectModel07175.bukuModel07175.getAll07175().get(index07175).getHalaman07175();
            databuku07175.addRow(data07175);
        }
        return databuku07175;
    }

    @Override
    public DefaultTableModel daftarBuku07175() {
        DefaultTableModel databuku07175 = new DefaultTableModel();
        
        Object [] kolom07175 = {"ISBN", "JUDUL" ,"PENERBIT", "TERBIT", "HALAMAN"};
        databuku07175.setColumnIdentifiers(kolom07175);
        int size07175 = showAllData07175().size();
        
        for(int i=0; i<size07175; i++){
            Object[] data07175 = new Object[5];
            
            data07175[0] = AllObjectModel07175.bukuModel07175.getAll07175().get(i).getIsbn07175();
            data07175[1] = AllObjectModel07175.bukuModel07175.getAll07175().get(i).getJudul07175();
            data07175[2] = AllObjectModel07175.bukuModel07175.getAll07175().get(i).getPenerbit07175();
            data07175[3] = AllObjectModel07175.bukuModel07175.getAll07175().get(i).getTerbit07175();
            data07175[4] = AllObjectModel07175.bukuModel07175.getAll07175().get(i).getHalaman07175();
            databuku07175.addRow(data07175);
        }
        return databuku07175;
    }
    
    
    
}
