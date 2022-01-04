package PerpustakaanApp07175;

import Controller07175.*;
import Entity07175.*;
import java.util.Scanner;

public class PerpustakaanApp07175 {
    public static Scanner input07175 = new Scanner(System.in);
    public static AdminControllerInterface07175 adminController07175 = new AdminControllerInterfaceImpl07175();
    public static AnggotaControllerInterfaceImpl07175 anggotaController07175 = new AnggotaControllerInterfaceImpl07175();
    public static BukuControllerInterface07175 bukuController07175 = new BukuControllerInterfaceImpl07175();
    public static PeminjamanControllerInterface07175 peminjamanController07175 = new PeminjamanControllerInterfaceImpl07175();
    
    public static void main(String[] args) {
//        int pilih07175;
//        do{
//            System.out.println("SELAMAT DATANG");
//            System.out.println("1. REGISTRASI");
//            System.out.println("2. LOGIN");
//            System.out.println("3. KELUAR");
//            
//            System.out.print("Pilihan : ");
//            pilih07175 = input07175.nextInt();
//            
//            switch(pilih07175){
//                case 1:
//                    registrasi07175();
//                    break;
//                case 2:
//                    login07175();
//                    break;
//                case 3:
//                    System.out.println("KELUAR");
//                    break;
//            }
//            
//        }while(pilih07175 < 2);
            menuAwal07175();
    }
    
    public static void menuAwal07175(){
        int pilih07175;
        do{
            System.out.println("SELAMAT DATANG");
            System.out.println("1. REGISTRASI");
            System.out.println("2. LOGIN");
            System.out.println("3. KELUAR");
            
            System.out.print("Pilihan : ");
            pilih07175 = input07175.nextInt();
            
            switch(pilih07175){
                case 1:
                    registrasi07175();
                    break;
                case 2:
                    login07175();
                    break;
                case 3:
                    System.out.println("KELUAR");
                    break;
            }
            
        }while(pilih07175 < 2);
            
    } 
    
    public static void registrasi07175(){
        System.out.print("Nama     : ");
        String nama07175 = input07175.next();
        System.out.print("Password : ");
        String pass07175 = input07175.next();
        System.out.print("No Telp  : ");
        String notelp07175 = input07175.next();
        System.out.print("Alamat   : ");
        String alamat07175 = input07175.next();
        anggotaController07175.insert07175(nama07175, pass07175, notelp07175, alamat07175);
    }
    
    public static void login07175(){
        int pilih07175;
        do{
        System.out.println("LOGIN AS : ");
        System.out.println("1. ADMIN");
        System.out.println("2. ANGGOTA");
        System.out.print("Pilihan : ");
        pilih07175 = input07175.nextInt();
        
        switch(pilih07175){
            case 1:
                loginAdmin07175();
                break;
            case 2:
                loginAnggota07175();
                break;
            default:
                menuAwal07175();
        }
        
        }while(pilih07175 < 2);  
    }
    
    public static void loginAdmin07175(){
        System.out.print("Username : ");
        String username07175 = input07175.next();
        System.out.print("Password : ");
        String pass07175 = input07175.next();
        if(adminController07175.login07175(username07175, pass07175)== true){
            menuAdmin07175();
        }else {
            System.out.println("USERNAME ATAU PASSWORD ANDA SALAH");
        }
    }
    
    public static void loginAnggota07175(){
        System.out.print("Username : ");
        String username07175 = input07175.next();
        System.out.print("Password : ");
        String pass07175 = input07175.next();
        if(anggotaController07175.login07175(username07175, pass07175) != 0){
            int id07175 = anggotaController07175.login07175(username07175, pass07175);
            menuAnggota07175(id07175);
        }else {
            System.out.println("USERNAME ATAU PASSWORD ANDA SALAH");
        }
    }
    
    public static void menuAdmin07175(){
        int pilih07175;
        do{
            System.out.println("MENU ADMIN");
            System.out.println("1. LIHAT DAFTAR ANGGOTA");
            System.out.println("2. HAPUS ANGGOTA");
            System.out.println("3. RESET PASSWORD ANGGOTA");
            System.out.println("4. LIHAT DAFTAR BUKU");
            System.out.println("5. TAMBAH DAFTAR BUKU");
            System.out.println("6. HAPUS DAFTAR BUKU");
            System.out.println("7. UBAH INFORMANSI BUKU");
            System.out.println("8. LIHAT DAFTAR PEMINJAMAN");
            System.out.println("9. VERIFIKASI PENGEMBALIAN");
            System.out.println("10. KELUAR");
            
            System.out.print("Pilihan : ");
            pilih07175 = input07175.nextInt();
            
            switch(pilih07175){
                case 1:
                    daftarAnggota07175();
                    break;
                case 2:
                    hapusAnggota07175();
                    break;
                case 3:
                    resetPasswordAnggota07175();
                    break;
                case 4:
                    daftarBuku07175();
                    break;
                case 5:
                    tambahBuku07175();
                    break;
                case 6:
                    hapusBuku07175();
                    break;
                case 7:
                    ubahBuku07175();
                    break;
                case 8:
                    lihatDaftarPeminjaman07175();
                    break;
                case 9:
                    verifikasiPengembalian07175();
                    break;
                    
            }
        }while(pilih07175 < 10);
    }
    
    public static void daftarAnggota07175(){
        int size07175 = anggotaController07175.showAllData().size();
        System.out.println("DATA DAFTAR ANGGOTA");
        for(int i=0; i<size07175; i++){
            System.out.println((i+1) + ". " + anggotaController07175.showAllData().get(i).getId07175() + " " + anggotaController07175.showAllData().get(i).getPassword07175() + " " + anggotaController07175.showAllData().get(i).getNama07175()+ " " + anggotaController07175.showAllData().get(i).getNoTelp07175() + " " + anggotaController07175.showAllData().get(i).getAlamat07175());
        }
    }
    
    public static void hapusAnggota07175(){
        daftarAnggota07175();
        System.out.print("ID : ");
        int id017175 = input07175.nextInt();
        adminController07175.hapusAnggota07175(id017175);
    }
    
    public static void resetPasswordAnggota07175(){
        daftarAnggota07175();
        System.out.print("ID : ");
        int id017175 = input07175.nextInt();
        adminController07175.resetPassAnggota07175(id017175);
    }
    
    public static void daftarBuku07175(){
        int size07175 = bukuController07175.showAllData07175().size();
        for(int i=0; i<size07175; i++){
            System.out.println((1+i) + ". " + bukuController07175.showAllData07175().get(i).getIsbn07175() + " " + bukuController07175.showAllData07175().get(i).getJudul07175() + " " + bukuController07175.showAllData07175().get(i).getPenerbit07175() + " " + bukuController07175.showAllData07175().get(i).getTerbit07175() + " " + bukuController07175.showAllData07175().get(i).getHalaman07175());
        }
    }
    
    public static void tambahBuku07175(){
        System.out.print("Isbn Buku           : ");
        String isbn07175 = input07175.next();
        isbn07175 += input07175.nextLine();
        System.out.print("Judul Buku          : ");
        String judul07175 = input07175.next();
        judul07175 += input07175.nextLine();
        System.out.print("Penerbit Buku       : ");
        String penerbit07175 = input07175.next();
        penerbit07175 += input07175.nextLine();
        System.out.print("Jumlah Halaman Buku : ");
        int halaman07175 = input07175.nextInt();
        System.out.print("Tahun Terbit Buku   : ");
        int tanggal07175 = input07175.nextInt();
        
        bukuController07175.insertBuku07175(isbn07175, judul07175, penerbit07175, tanggal07175, halaman07175);
    }
    
    public static void hapusBuku07175(){
        daftarBuku07175();
        System.out.print("ID : ");
        String isbn07175 = input07175.next();
        bukuController07175.deleteBuku07175(isbn07175);
    }
    
    public static void ubahBuku07175(){
        int pilih07175;
        
        do{
            System.out.println("1. UBAH JUDUL BUKU");
            System.out.println("2. UBAH PENERBIT BUKU");
            System.out.println("3. KEMBALI KE MENU");
            
            System.out.print("Pilihan : ");
            pilih07175 = input07175.nextInt();
            
            switch(pilih07175){
                case 1 : 
                    daftarBuku07175();
                    System.out.print("Judul Buku : ");
                    String judul07175 = input07175.next();
                    judul07175 += input07175.nextLine();
                    System.out.print("Isbn Buku  : ");
                    String isbn07175 = input07175.next();
                    isbn07175 += input07175.nextLine();
                    
                    bukuController07175.updateBuku07175(1, isbn07175, judul07175);
                    break;
                case 2 :
                    daftarBuku07175();
                    System.out.print("Penerbit Buku : ");
                    String penerbit07175 = input07175.next();
                    penerbit07175 += input07175.nextLine();
                    System.out.print("Isbn Buku     : ");
                    isbn07175 = input07175.next();
                    isbn07175 += input07175.nextLine();
                    
                    bukuController07175.updateBuku07175(2, isbn07175, penerbit07175);
                    break;
            }
        }while(pilih07175 < 3);
    }
    
    public static void lihatDaftarPeminjaman07175(){
        int size07175 = peminjamanController07175.showAllData07175().size();
        for(int i =0; i< size07175; i++){
            String status07175 = !peminjamanController07175.showAllData07175().get(i).isStatusPeminjaman07175() ? "Masih Dipinjam" : "Telah Dikembalikan";
            System.out.println((i+1) + ". " + peminjamanController07175.showAllData07175().get(i).getIdPeminjaman07175() + " " + peminjamanController07175.showAllData07175().get(i).getBuku07175().getIsbn07175() + " " + peminjamanController07175.showAllData07175().get(i).getBuku07175().getJudul07175() + " " + peminjamanController07175.showAllData07175().get(i).getAnggota07175().getNama07175() + " " + peminjamanController07175.showAllData07175().get(i).getTglPeminjaman07175() + " " + peminjamanController07175.showAllData07175().get(i).getTglPengembalian07175() + " " + status07175);
        }
    }
    
    public static void verifikasiPengembalian07175(){
        lihatDaftarPeminjaman07175();
        System.out.print("ID PEMINJAMAN : ");
        String idPeminjaman07175 = input07175.next();
        
        peminjamanController07175.verifPengembalian07175(idPeminjaman07175);
    }
    
    public static void menuAnggota07175(int id07175){
        int pilih07175;
        System.out.println(id07175);
        
        do{
            
            System.out.println("1. LIHAT RIWAYAT PEMINJAMAN");
            System.out.println("2. LAKUKAN PEMINJAMAN");
            System.out.println("3. EDIT DATA DIRI");
            System.out.println("4. KELUAR");
            
            System.out.print("Pilihan : ");
            pilih07175 = input07175.nextInt();
            
            switch(pilih07175){
                case 1:
                    lihatRiwayatPeminjaman07175(id07175);
                    break;
                case 2:
                    pinjamBuku07175(id07175);
                    break;
                case 3:
                    editDataAnggota07175(id07175);
                    break;
                default:
                    login07175();
            }
        }while(pilih07175 != 4);
    }
    
    public static void lihatRiwayatPeminjaman07175(int id07175){
        int size07175 = peminjamanController07175.showDataByPeminjam07175(id07175).size();
        for(int i =0; i< size07175; i++){
            String status07175 = !peminjamanController07175.showDataByPeminjam07175(id07175).get(i).isStatusPeminjaman07175() ? "Masih Dipinjam" : "Telah Dikembalikan";
            System.out.println((i+1) + ". " + peminjamanController07175.showDataByPeminjam07175(id07175).get(i).getIdPeminjaman07175() + " " + " " + peminjamanController07175.showDataByPeminjam07175(id07175).get(i).getBuku07175().getJudul07175() + " " + " " + peminjamanController07175.showDataByPeminjam07175(id07175).get(i).getTglPeminjaman07175() + " " + peminjamanController07175.showDataByPeminjam07175(id07175).get(i).getTglPengembalian07175() + " " + status07175);
    }
}
    
    public static void pinjamBuku07175(int id07175){
        daftarBuku07175();
        System.out.print("ISBN BUKU : ");
        String isbn07175 = input07175.next();
        BukuEntity07175 buku07175 = bukuController07175.getData07175(isbn07175);
        AnggotaEntity07175 anggota07175 = anggotaController07175.getData(id07175);
        peminjamanController07175.insertPeminjaman07175(buku07175, anggota07175);
        
    }
    
    public static void editDataAnggota07175(int id07175){
        int pilih07175;
        do{
        System.out.println("1. UPDATE PASSWORD ANGGOTA");
        System.out.println("2. UPDATE ALAMAT ANGGOTA");
        System.out.println("3. UPDATE NO TELP ANGGOTA");
        System.out.println("4. KELUAR");
        
        System.out.print("Pilihan : ");
        pilih07175 = input07175.nextInt();
        
        switch(pilih07175){
            case 1 :
                dataPenggunaById07175(id07175);
                System.out.print("Password Baru : ");
                String pass07175 = input07175.next();
                
                anggotaController07175.updateData(1, pass07175, id07175);
                break;
            case 2 :
                dataPenggunaById07175(id07175);
                System.out.print("Alamat Baru    : ");
                String alamat07175 = input07175.next();
                
                anggotaController07175.updateData(2, alamat07175, id07175);
                break;
            case 3 :
                dataPenggunaById07175(id07175);
                System.out.print("No Telp Baru    : ");
                String notelp07175 = input07175.next();
                
                anggotaController07175.updateData(3, notelp07175, id07175);
                break;
        }
        }while(pilih07175 < 3);
        
    }
    
    public static void dataPenggunaById07175(int id07175){
         System.out.println(anggotaController07175.getData(id07175).getNama07175() + " " + anggotaController07175.getData(id07175).getPassword07175() + " " + anggotaController07175.getData(id07175).getNoTelp07175() + " " + anggotaController07175.getData(id07175).getAlamat07175());
    }
}
