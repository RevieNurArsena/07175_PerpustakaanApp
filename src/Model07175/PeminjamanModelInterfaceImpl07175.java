package Model07175;

import Entity07175.AnggotaEntity07175;
import Entity07175.BukuEntity07175;
import Entity07175.PeminjamanEntity07175;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class PeminjamanModelInterfaceImpl07175 implements PeminjamanModelInterface07175{
    
    private String generateIdPeminjaman(){
        String newId07175 = null;
        String data07175;
        try{
        String sql = "SELECT peminjam_id FROM peminjaman ORDER BY peminjam_id DESC LIMIT 1";
            Statement stat07175 = conn07175.createStatement();
            ResultSet rs07175 = stat07175.executeQuery(sql);
            if(rs07175.next()){
                data07175 = rs07175.getString("peminjam_id");
            }else {
                data07175 = "PJM000";
            }
            
            int angka = Integer.parseInt(data07175.substring(3));
            angka++;
            newId07175 = "PJM" + String.format("%03d", angka);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return newId07175;
    }

    @Override
    public void add07175(PeminjamanEntity07175 peminjaman07175) {
        try {
            String sql = "INSERT INTO peminjaman(peminjam_id, buku_isbn, anggota_id, peminjaman_tgl, status) VALUES(?,?,?,?,?)";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, generateIdPeminjaman());
            stat07175.setString(2, peminjaman07175.getBuku07175().getIsbn07175());
            stat07175.setInt(3, peminjaman07175.getAnggota07175().getId07175());
            stat07175.setDate(4, Date.valueOf(LocalDate.now()));
            stat07175.setBoolean(5, false);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void verifPengembalian07175(String idPeminjaman07175) {
        try {
            String sql = "UPDATE peminjaman SET status = TRUE WHERE peminjam_id = ?";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setString(1, idPeminjaman07175);
            stat07175.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<PeminjamanEntity07175> getAll07175() {
        ArrayList<PeminjamanEntity07175> arrPeminjaman07175 = new ArrayList<>();
        
        try {
            String sql = "SElECT p.*, b.buku_judul, a.anggota_nama, a.anggota_password FROM peminjaman p JOIN anggota a ON p.anggota_id = a.anggota_id JOIN buku b ON p.buku_isbn = b.buku_isbn ORDER BY peminjam_id";
            Statement stat07175 = conn07175.createStatement();
            ResultSet rs07175 = stat07175.executeQuery(sql);
            while(rs07175.next()){
                PeminjamanEntity07175 peminjaman07175 = new PeminjamanEntity07175();
                BukuEntity07175 buku07175 = new BukuEntity07175();
                peminjaman07175.setIdPeminjaman07175(rs07175.getString("peminjam_id"));
                buku07175.setIsbn07175(rs07175.getString("buku_isbn"));
                buku07175.setJudul07175(rs07175.getString("buku_judul"));
                peminjaman07175.setBuku07175(buku07175);
                AnggotaEntity07175 anggota07175 = new AnggotaEntity07175(rs07175.getString("anggota_nama"), rs07175.getString("anggota_password"));
                
                peminjaman07175.setAnggota07175(anggota07175);
                peminjaman07175.setTglPeminjaman07175(rs07175.getDate("peminjaman_tgl"));
                peminjaman07175.setTglPengembalian07175(rs07175.getDate("pengembalian_tgl"));
                peminjaman07175.setStatusPeminjaman07175(rs07175.getBoolean("status"));
                arrPeminjaman07175.add(peminjaman07175);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arrPeminjaman07175;
    }

    @Override
    public ArrayList<PeminjamanEntity07175> getByPeminjam(int id07175) {
        ArrayList<PeminjamanEntity07175> arrPeminjaman07175 = new ArrayList<>();
        try {
            String sql = "SELECT p.*, b.buku_judul FROM peminjaman p JOIN buku b ON p.buku_isbn = b.buku_isbn WHERE anggota_id = ? ORDER BY peminjaman_tgl";
            PreparedStatement stat07175 = conn07175.prepareStatement(sql);
            stat07175.setInt(1, id07175);
            ResultSet rs07175 = stat07175.executeQuery();
            while(rs07175.next()){
                PeminjamanEntity07175 peminjaman07175 = new PeminjamanEntity07175();
                BukuEntity07175 buku07175 = new BukuEntity07175();
                peminjaman07175.setIdPeminjaman07175(rs07175.getString("peminjam_id"));
                buku07175.setIsbn07175(rs07175.getString("buku_isbn"));
                buku07175.setJudul07175(rs07175.getString("buku_judul"));
                peminjaman07175.setBuku07175(buku07175);
                //AnggotaEntity07175 anggota07175 = new AnggotaEntity07175(rs07175.getString("anggota_nama"), rs07175.getString("anggota_password"));
                
                //peminjaman07175.setAnggota07175(anggota07175);
                peminjaman07175.setTglPeminjaman07175(rs07175.getDate("peminjaman_tgl"));
                peminjaman07175.setTglPengembalian07175(rs07175.getDate("pengembalian_tgl"));
                peminjaman07175.setStatusPeminjaman07175(rs07175.getBoolean("status"));
                arrPeminjaman07175.add(peminjaman07175);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return arrPeminjaman07175;
    }
    
}
