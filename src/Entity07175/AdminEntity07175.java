package Entity07175;

public class AdminEntity07175 extends UserEntity07175{
    private int id07175;

    public AdminEntity07175(int id07175, String nama07175, String password07175) {
        super(nama07175, password07175);
        this.id07175 = id07175;
    }

    public int getId07175() {
        return id07175;
    }

    public void setId07175(int id07175) {
        this.id07175 = id07175;
    }
}

