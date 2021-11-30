package Entity07175;

public class AnggotaEntity07175 extends UserEntity07175{
    private String noTelp07175, alamat07175;
    private int id07175;

    public AnggotaEntity07175(String nama07175, String password07175, 
            String noTelp07175, String alamat07175, int id07175) {
        super(nama07175, password07175);
        this.noTelp07175 = noTelp07175;
        this.alamat07175 = alamat07175;
        this.id07175 = id07175;
    }
    
    public void AnggotaEntity07175(String nama07175, String password07175){
        
    }
    
    public String getNoTelp07175() {
        return noTelp07175;
    }

    public void setNoTelp07175(String noTelp07175) {
        this.noTelp07175 = noTelp07175;
    }

    public String getAlamat07175() {
        return alamat07175;
    }

    public void setAlamat07175(String alamat07175) {
        this.alamat07175 = alamat07175;
    }

    public int getId07175() {
        return id07175;
    }

    public void setId07175(int id07175) {
        this.id07175 = id07175;
    }
}


