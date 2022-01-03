package Model07175;

import Entity07175.BukuEntity07175;
import Helper07175.DbUtil07175;
import java.sql.Connection;
import java.util.ArrayList;

public interface BukuModelInterface07175 {
    Connection conn07175 = DbUtil07175.getconection07175();
    
    void add07175(BukuEntity07175 buku07175);
    void updateJudul07175(String isbn07175, String judul07175);
    void updatePenerbit07175(String isbn07175, String penerbit07175);
    void delete07175(String isbn07175);
    ArrayList<BukuEntity07175> getAll07175();
    BukuEntity07175 getById07175(String isbn07175);
    
}
