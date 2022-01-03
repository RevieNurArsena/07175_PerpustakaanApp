package Model07175;

import Entity07175.PeminjamanEntity07175;
import Helper07175.DbUtil07175;
import java.sql.Connection;
import java.util.ArrayList;

public interface PeminjamanModelInterface07175 {
    Connection conn07175 = DbUtil07175.getconection07175();
    
    void add07175(PeminjamanEntity07175 peminjaman07175);
    void verifPengembalian07175(String idPeminjaman07175);
    ArrayList<PeminjamanEntity07175> getAll07175();
    ArrayList<PeminjamanEntity07175> getByPeminjam(int id07175);
}
