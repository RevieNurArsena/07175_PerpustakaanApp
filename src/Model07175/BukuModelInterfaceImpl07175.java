package Model07175;

import Entity07175.BukuEntity07175;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BukuModelInterfaceImpl07175 implements BukuModelInterface07175{

    @Override
    public void add07175(BukuEntity07175 buku07175) {
        try{
            String sql = "INSERT INTO buku (buku_isbn, buku_judul, buku_penerbit, buku_terbit, buku_halaman) VALUES(?,?,?,?,?)";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, buku07175.getIsbn07175());
            stat07175.setString(2, buku07175.getJudul07175());
            stat07175.setString(3, buku07175.getPenerbit07175());
            stat07175.setInt(4, buku07175.getTerbit07175());
            stat07175.setInt(4, buku07175.getHalaman07175());
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateJudul07175(String isbn07175, String judul07175) {
        try{
            String sql = "UPDATE buku SET buku_judul = ? WHERE buku_isbn = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, judul07175);
            stat07175.setString(2, isbn07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updatePenerbit07175(String isbn07175, String penerbit07175) {
        try{
            String sql = "UPDATE buku SET buku_penerbit = ? WHERE buku_isbn = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, penerbit07175);
            stat07175.setString(2, isbn07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete07175(String isbn07175) {
        try{
            String sql = "UPDATE buku SET buku_ketersediaan = false WHERE buku_isbn = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, isbn07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<BukuEntity07175> getAll07175() {
        ArrayList<BukuEntity07175> arrBuku07175 = new ArrayList<>();
        try{
            String sql = "SELECT * FROM buku WHERE buku_ketersediaan = TRUE";
            Statement stat07175 = conn07175.createStatement();
            ResultSet rs07175 = stat07175.executeQuery(sql);
            while(rs07175.next()){
                BukuEntity07175 buku07175 = new BukuEntity07175();
                buku07175.setIsbn07175(rs07175.getString("buku_isbn"));
                buku07175.setJudul07175(rs07175.getString("buku_judul"));
                buku07175.setPenerbit07175(rs07175.getString("buku_penerbit"));
                buku07175.setTerbit07175(rs07175.getInt("buku_terbit"));
                buku07175.setHalaman07175(rs07175.getInt("buku_halaman"));
                
                arrBuku07175.add(buku07175);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return arrBuku07175;
    }

    @Override
    public BukuEntity07175 getById07175(String isbn07175) {
        BukuEntity07175 buku07175 = null;
        
        try{
            String sql = "SELECT * FROM buku WHERE buku_ketersediaan = TRUE AND buku_isbn = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, isbn07175);
            ResultSet rs07175 = stat07175.executeQuery(sql);
            while(rs07175.next()){
                buku07175 = new BukuEntity07175();
                buku07175.setIsbn07175(rs07175.getString("buku_isbn"));
                buku07175.setJudul07175(rs07175.getString("buku_judul"));
                buku07175.setPenerbit07175(rs07175.getString("buku_penerbit"));
                buku07175.setTerbit07175(rs07175.getInt("buku_terbit"));
                buku07175.setHalaman07175(rs07175.getInt("buku_halaman"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
       return buku07175;
    }
    
}
