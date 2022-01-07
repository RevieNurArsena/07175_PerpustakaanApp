package GUI07175;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuAnggota07175 {
    JFrame log07175 = new JFrame();
    JButton btnview07175, btnhapus07175, btnreset07175, btndaftarbuku07175, btnhapusbuku07175, btneditbuku07175, btndaftarpeminjam07175, verif07175, btntambahbuku07175, logout;    
    public MenuAnggota07175(int cek) {
        
        log07175.setSize(300, 300);
        log07175.setLayout(null);
        log07175.setLocationRelativeTo(null);
        log07175.getContentPane().setBackground(Color.WHITE);

        btnview07175 = new JButton("Lihat Riwayat Peminjaman");
        btnview07175.setBounds(5 , 10 , 275 , 50);
        btnview07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnview07175);

        btnhapus07175 = new JButton("Edit Profile");
        btnhapus07175.setBounds(5, 70 , 275 , 50);
        btnhapus07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnhapus07175);
        
        btnreset07175 = new JButton("Pinjam Buku");
        btnreset07175.setBounds(5, 130 , 275 , 50);
        btnreset07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btnreset07175);
        
        btndaftarbuku07175 = new JButton("Logout");
        btndaftarbuku07175.setBounds(5, 190 , 275 , 50);
        btndaftarbuku07175.setFont(new Font("Arial" , Font.BOLD,17));
        log07175.add(btndaftarbuku07175);
        
        log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        log07175.setVisible(true);
        log07175.setLocationRelativeTo(null);
        
        btnview07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DaftarRiwayat07175 g = new DaftarRiwayat07175(cek);
                log07175.dispose();
            }
        });
        
        btnhapus07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAnggota ea = new EditAnggota(cek);
                log07175.dispose();
            }
        });
        
        btnreset07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PinjamBuku07175 p =new PinjamBuku07175(cek);
                log07175.dispose();
            }
        });
        
        btndaftarbuku07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginAnggota07175 lang = new LoginAnggota07175();
                log07175.dispose();
            }
        });
    }
    
}
