package Model07175;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminModelInterfaceImpl07175 implements AdminModelInterface07175{

    @Override
    public boolean Login07175(String nama07175, String password07175) {
        boolean login07175 = false;
        try{
            String sql = "SELECT * FROM admin WHERE admin_nama = ? AND admin_password = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, nama07175);
            stat07175.setString(2, password07175);
            ResultSet rs07175 = stat07175.executeQuery();
            if(rs07175.next()){
                login07175 = true;
            }
        }catch(SQLException e){
           e.printStackTrace();
        }
        
        return login07175;
    }
    
}
