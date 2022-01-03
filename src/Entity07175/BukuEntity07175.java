package Entity07175;

public class BukuEntity07175 {
    private String isbn07175, judul07175, penerbit07175; 
    private int terbit07175, halaman07175;

    public BukuEntity07175(){
        
    }
    
    public BukuEntity07175(String isbn07175, String judul07175, String penerbit07175, 
        int terbit07175, int halaman07175) {
        this.isbn07175 = isbn07175;
        this.judul07175 = judul07175;
        this.penerbit07175 = penerbit07175;
        this.terbit07175 = terbit07175;
        this.halaman07175 = halaman07175;
    }
    
    public String getIsbn07175() {
        return isbn07175;
    }

    public void setIsbn07175(String isbn07175) {
        this.isbn07175 = isbn07175;
    }

    public String getJudul07175() {
        return judul07175;
    }

    public void setJudul07175(String judul07175) {
        this.judul07175 = judul07175;
    }

    public String getPenerbit07175() {
        return penerbit07175;
    }

    public void setPenerbit07175(String penerbit07175) {
        this.penerbit07175 = penerbit07175;
    }

    public int getTerbit07175() {
        return terbit07175;
    }

    public void setTerbit07175(int terbit07175) {
        this.terbit07175 = terbit07175;
    }

    public int getHalaman07175() {
        return halaman07175;
    }

    public void setHalaman07175(int halaman07175) {
        this.halaman07175 = halaman07175;
    }
}


