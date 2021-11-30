package Entity07175;

import java.util.Date;

public class PeminjamanEntity07175 {
    private BukuEntity07175 buku07175 ;
    private AnggotaEntity07175 anggota07175;
    private String idPeminjaman07175;
    private Date tglPeminjaman07175, tglPengembalian07175;
    private boolean statusPeminjaman07175;
    
    public PeminjamanEntity07175(BukuEntity07175 buku07175, AnggotaEntity07175 anggota07175) {
        this.anggota07175 = anggota07175;
        this.buku07175 = buku07175;
    }
    
    public PeminjamanEntity07175(){
        
    }

    public BukuEntity07175 getBuku07175() {
        return buku07175;
    }

    public void setBuku07175(BukuEntity07175 buku07175) {
        this.buku07175 = buku07175;
    }

    public AnggotaEntity07175 getAnggota07175() {
        return anggota07175;
    }

    public void setAnggota07175(AnggotaEntity07175 anggota07175) {
        this.anggota07175 = anggota07175;
    }

    public String getIdPeminjaman07175() {
        return idPeminjaman07175;
    }

    public void setIdPeminjaman07175(String idPeminjaman07175) {
        this.idPeminjaman07175 = idPeminjaman07175;
    }

    public Date getTglPeminjaman07175() {
        return tglPeminjaman07175;
    }

    public void setTglPeminjaman07175(Date tglPeminjaman07175) {
        this.tglPeminjaman07175 = tglPeminjaman07175;
    }

    public Date getTglPengembalian07175() {
        return tglPengembalian07175;
    }

    public void setTglPengembalian07175(Date tglPengembalian07175) {
        this.tglPengembalian07175 = tglPengembalian07175;
    }

    public boolean isStatusPeminjaman07175() {
        return statusPeminjaman07175;
    }

    public void setStatusPeminjaman07175(boolean statusPeminjaman07175) {
        this.statusPeminjaman07175 = statusPeminjaman07175;
    }
}


