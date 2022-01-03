package Controller07175;

import Entity07175.AnggotaEntity07175;
import Controller07175.AllObjectModel07175;
import java.util.ArrayList;

public class AnggotaControllerInterfaceImpl07175 implements AnggotaControllerInterface07175{

    @Override
    public void insert07175(String nama07175, String password07175, String noTelp, String alamat) {
         AllObjectModel07175.anggotaModel07175.add07175(new AnggotaEntity07175(nama07175, password07175, noTelp, nama07175));
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
    
}
