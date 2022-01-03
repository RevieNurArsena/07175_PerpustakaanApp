package Model07175;

import Entity07175.AnggotaEntity07175;
import java.sql.*;
import java.util.ArrayList;

public class AnggotaModelInterfaceImpl07175 implements AnggotaModelInterface07175{

    @Override
    public void add07175(AnggotaEntity07175 anggota07175) {
        try{
            String sql = "INSERT INTO anggota(anggota_nama, anggota_password, anggota_notelp, anggota_alamat) VALUES (?,?,?,?)";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, anggota07175.getNama07175());
            stat07175.setString(2, anggota07175.getPassword07175());
            stat07175.setString(3, anggota07175.getNoTelp07175());
            stat07175.setString(4, anggota07175.getAlamat07175());
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void remove07175(int id07175) {
        try{
        String sql = "UPDATE anggota SET anggota_aktif = FALSE WHERE anggota_id = ?";
        PreparedStatement stat07175 = conn07175.prepareStatement(sql);
        stat07175.setInt(1, id07175);
        stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

    @Override
    public int login07175(String nama07175, String password07175) {
        int login = 0;
        try {
            String sql = "SELECT * FROM anggota WHERE anggota_nama = ? AND anggota_password = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, nama07175);
            stat07175.setString(2, password07175);
            ResultSet rs07175 = stat07175.executeQuery();
            if(rs07175.next()){
                login = rs07175.getInt("anggota_id");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return login;
    }

    @Override
    public ArrayList<AnggotaEntity07175> getAll() {
        ArrayList<AnggotaEntity07175> arrAnggota07175 = new ArrayList<>();
        try {
            String sql = "SELECT * FROM anggota WHERE anggota_aktif = TRUE";
            Statement stat07175 = conn07175.createStatement();
            ResultSet rs07175 = stat07175.executeQuery(sql);
            while(rs07175.next()){
                AnggotaEntity07175 anggota07175 = new AnggotaEntity07175(rs07175.getString("anggota_nama"), rs07175.getString("anggota_password"), rs07175.getString("anggota_notelp"), rs07175.getString("anggota_alamat"));
                anggota07175.setId07175(rs07175.getInt("anggota_id"));
                arrAnggota07175.add(anggota07175);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arrAnggota07175;
    }

    @Override
    public AnggotaEntity07175 getId07175(int id07175) {
        AnggotaEntity07175 anggota07175 =  null;
        try {
            String sql = "SELECT * FROM anggota WHERE anggota_aktif = TRUE AND anggota_id = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setInt(1, id07175);
            ResultSet rs07175 = stat07175.executeQuery(sql);
            while(rs07175.next()){
                anggota07175 = new AnggotaEntity07175(rs07175.getString("anggota_nama"), rs07175.getString("anggota_password"), rs07175.getString("anggota_notelp"), rs07175.getString("anggota_alamat"));
                anggota07175.setId07175(rs07175.getInt("anggota_id"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return anggota07175;
    }

    @Override
    public void resetPassword07175(int id07175) {
        try {
            String sql = "UPDATE anggota SET anggota_password = '1234' WHERE anggota_id = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setInt(1, id07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNotelp07175(String noTelp07175, int id07175) {
        try {
            String sql = "UPDATE anggota SET anggota_notelp = ? WHERE anggota_id = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, noTelp07175);
            stat07175.setInt(2, id07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateAlamat07175(String alamat07175, int id07175) {
        try {
            String sql = "UPDATE anggota SET anggota_alamat = ? WHERE anggota_id = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, alamat07175);
            stat07175.setInt(2, id07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void UpdatePassword07175(String password07175, int id07175) {
        try {
            String sql = "UPDATE anggota SET anggota_password = ? WHERE anggota_id = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, password07175);
            stat07175.setInt(2, id07175);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
