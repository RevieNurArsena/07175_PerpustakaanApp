package Model07175;

import Entity07175.AnggotaEntity07175;
import java.sql.Connection;
import Helper07175.DbUtil07175;
import java.util.ArrayList;

public interface AnggotaModelInterface07175 {
    Connection conn07175 = DbUtil07175.getconection07175();
    
    void add07175(AnggotaEntity07175 anggota07175);
    void remove07175(int id07175);
    int login07175(String nama07175, String password07175);
    ArrayList<AnggotaEntity07175> getAll();
    AnggotaEntity07175 getId07175(int id07175);
    void resetPassword07175(int id07175);
    void updateNotelp07175(String noTelp07175, int id07175);
    void updateAlamat07175(String alamat07175, int id07175);
    void UpdatePassword07175(String password07175, int id07175);
}
