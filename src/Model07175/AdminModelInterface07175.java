package Model07175;

import Helper07175.DbUtil07175;
import java.sql.Connection;

public interface AdminModelInterface07175 {
    Connection conn07175 = DbUtil07175.getconection07175();
    
    boolean Login07175(String nama07175, String password07175);
}
