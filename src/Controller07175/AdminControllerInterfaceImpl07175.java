package Controller07175;

public class AdminControllerInterfaceImpl07175 implements AdminControllerInterface07175{

    @Override
    public boolean login07175(String nama07175, String password07175) {
        return AllObjectModel07175.adminModel07175.Login07175(nama07175, password07175);
    }

    @Override
    public void hapusAnggota07175(int id07175) {
        AllObjectModel07175.anggotaModel07175.remove07175(id07175);
    }

    @Override
    public void resetPassAnggota07175(int id07175) {
        AllObjectModel07175.anggotaModel07175.resetPassword07175(id07175);
    }
    
}
