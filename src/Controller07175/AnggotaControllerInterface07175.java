package Controller07175;

import Entity07175.AnggotaEntity07175;
import java.util.ArrayList;

public interface AnggotaControllerInterface07175 {
    void insert07175(String nama07175, String password07175, String noTelp, String alamat);
    int login07175(String nama07175, String password07175);
    ArrayList<AnggotaEntity07175> showAllData();
    AnggotaEntity07175 getData(int id07175);
    void updateData(int pilih07175, String data07175, int id07175);
}
