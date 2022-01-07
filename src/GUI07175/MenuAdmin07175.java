package GUI07175;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuAdmin07175 {
    JFrame log07175 = new JFrame();
    JButton btnview07175, btnhapus07175, btnreset07175, btndaftarbuku07175, btnhapusbuku07175, btneditbuku07175, btndaftarpeminjam07175, verif07175, btntambahbuku07175, logout;
    int index;
    
    public MenuAdmin07175() {
        
        log07175.setSize(300, 680);
        log07175.setLayout(null);
        log07175.setLocationRelativeTo(null);
        log07175.getContentPane().setBackground(Color.WHITE);

        btnview07175 = new JButton("Lihat Daftar Anggota");
        btnview07175.setBounds(5 , 10 , 275 , 50);
        btnview07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnview07175);

        btnhapus07175 = new JButton("Hapus Anggota");
        btnhapus07175.setBounds(5, 70 , 275 , 50);
        btnhapus07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnhapus07175);
        
        btnreset07175 = new JButton("Reset Password Anggota");
        btnreset07175.setBounds(5, 130 , 275 , 50);
        btnreset07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnreset07175);
        
        btndaftarbuku07175 = new JButton("Lihat Daftar Buku");
        btndaftarbuku07175.setBounds(5, 190 , 275 , 50);
        btndaftarbuku07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btndaftarbuku07175);
        
        btntambahbuku07175 = new JButton("Tambah Daftar Buku");
        btntambahbuku07175.setBounds(5, 250 , 275 , 50);
        btntambahbuku07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btntambahbuku07175);
        
        btnhapusbuku07175 = new JButton("Hapus Daftar Buku");
        btnhapusbuku07175.setBounds(5, 310 , 275 , 50);
        btnhapusbuku07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnhapusbuku07175);
        
        btneditbuku07175 = new JButton("Ubah Informasi Buku");
        btneditbuku07175.setBounds(5, 370 , 275 , 50);
        btneditbuku07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btneditbuku07175);
        
        btndaftarpeminjam07175 = new JButton("Lihat Daftar Peminjam");
        btndaftarpeminjam07175.setBounds(5, 430 , 275 , 50);
        btndaftarpeminjam07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btndaftarpeminjam07175);
        
        verif07175 = new JButton("Verifikasi Pengembalian");
        verif07175.setBounds(5, 490 , 275 , 50);
        verif07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(verif07175);
        
        logout = new JButton("Logout");
        logout.setBounds(5, 550 , 275 , 50);
        logout.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(logout);
        
        log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log07175.setVisible(true);
        log07175.setLocationRelativeTo(null);
        
        btnview07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewDaftarAnggota07175 v = new ViewDaftarAnggota07175();
                log07175.dispose();
            }
        });
        
        btnhapus07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HapusAnggota07175 h = new HapusAnggota07175();
                log07175.dispose();
            }
        });
        
        btnreset07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetPassword07175 r = new resetPassword07175();
                log07175.dispose();
            }
        });
        
        btndaftarbuku07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DaftarBuku07175 b = new DaftarBuku07175();
                log07175.dispose();
            }
        });
        
        btntambahbuku07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahBUku07175 b = new tambahBUku07175();
                log07175.dispose();
            }
        });
        
        btnhapusbuku07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HapusBuku07175 h = new HapusBuku07175();
                log07175.dispose();
            }
        });
        
        btneditbuku07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editBuku07175 ed = new editBuku07175();
                log07175.dispose();
            }
        });
        
        btndaftarpeminjam07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DaftarPeminjam07175 p = new DaftarPeminjam07175();
                log07175.dispose();
            }
        });
        
        verif07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VerifikasiPengemblian07175 v = new VerifikasiPengemblian07175();
                log07175.dispose();
            }
        });
        
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginAdmin07175 loginAdmin = new loginAdmin07175();
                log07175.dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        MenuAdmin07175 m = new MenuAdmin07175();
    }
}
