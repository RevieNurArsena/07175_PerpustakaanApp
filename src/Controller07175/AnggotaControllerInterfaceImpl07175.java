package Controller07175;

import Entity07175.AnggotaEntity07175;
import Controller07175.AllObjectModel07175;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AnggotaControllerInterfaceImpl07175 implements AnggotaControllerInterface07175{

    @Override
    public void insert07175(String nama07175, String password07175, String noTelp, String alamat) {
         AllObjectModel07175.anggotaModel07175.add07175(new AnggotaEntity07175(nama07175, password07175, noTelp, alamat));
    }

    @Override
    public int login07175(String nama07175, String password07175) {
        return AllObjectModel07175.anggotaModel07175.login07175(nama07175, password07175);
    }

    @Override
    public ArrayList<AnggotaEntity07175> showAllData() {
        return AllObjectModel07175.anggotaModel07175.getAll();
    }

    @Override
    public AnggotaEntity07175 getData(int id07175) {
        return AllObjectModel07175.anggotaModel07175.getId07175(id07175);
    }

    @Override
    public void updateData(int pilih07175, String data07175, int id07175) {
        switch(pilih07175){
            case 1:
                AllObjectModel07175.anggotaModel07175.UpdatePassword07175(data07175, id07175);
                break;
            case 2:
                AllObjectModel07175.anggotaModel07175.updateAlamat07175(data07175, id07175);
                break;
            case 3:
                AllObjectModel07175.anggotaModel07175.updateNotelp07175(data07175, id07175);
                break;
        }
    }
    
    public int cari07175(int id07175){
        int i=0, cari07175=-1;
        
        while(i < showAllData().size()){
            if(id07175 == showAllData().get(i).getId07175()){
                cari07175 = i;
            }
            i++;
        }
        return cari07175;
    }
    
    public DefaultTableModel daftarDataAnggota07175(){
        DefaultTableModel dataAnggota07175 = new DefaultTableModel();
        
        Object [] kolom07175 = {"ID", "USERNAME" ,"PASSWORD", "NO TELPON", "ALAMAT"};
        dataAnggota07175.setColumnIdentifiers(kolom07175);
        int size07175 = AllObjectModel07175.anggotaModel07175.getAll().size();
        for(int i=0; i<size07175; i++){
            Object[] data07175 = new Object[5];
            
            data07175[0] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getId07175();
            data07175[1] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getNama07175();
            data07175[2] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getPassword07175();
            data07175[3] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getNoTelp07175();
            data07175[4] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getAlamat07175();
            
            dataAnggota07175.addRow(data07175);
        }
        return dataAnggota07175;
    }
    
    public DefaultTableModel daftarDataAnggota07175(int cek07175){
        int i = cari07175(cek07175);
        DefaultTableModel dataAnggota07175 = new DefaultTableModel();
        
        Object [] kolom07175 = {"ID", "USERNAME" ,"PASSWORD", "NO TELPON", "ALAMAT"};
        dataAnggota07175.setColumnIdentifiers(kolom07175);
        int size07175 = AllObjectModel07175.anggotaModel07175.getAll().size();
        
            Object[] data07175 = new Object[5];
            
            data07175[0] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getId07175();
            data07175[1] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getNama07175();
            data07175[2] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getPassword07175();
            data07175[3] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getNoTelp07175();
            data07175[4] = AllObjectModel07175.anggotaModel07175.getAll().get(i).getAlamat07175();
            
            dataAnggota07175.addRow(data07175);
        
        return dataAnggota07175;
    }
    
}
