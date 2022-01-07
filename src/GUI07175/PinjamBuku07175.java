package GUI07175;

import Controller07175.*;
import Entity07175.AnggotaEntity07175;
import Entity07175.BukuEntity07175;
import static PerpustakaanApp07175.PerpustakaanApp07175.anggotaController07175;
import static PerpustakaanApp07175.PerpustakaanApp07175.bukuController07175;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinjamBuku07175 {
    JFrame logV07175 = new JFrame();
    JLabel judul07175 , label07175, labelpinjam;
    JTextField textpinjam;
    JTable tableview07175;
    JScrollPane scroll;
    JButton backbutton07175, btnback07175, btnpinjam;
    private BukuControllerInterface07175 buku = new BukuControllerInterfaceImpl07175();
    private PeminjamanControllerInterface07175 peminjam = new PeminjamanControllerInterfaceImpl07175();
    
    public PinjamBuku07175(int cek){
        logV07175.setSize(700, 400);
        logV07175.setLayout(null);
        logV07175.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("VIEW DATA PEMINJAMAN");
        judul07175.setBounds(170, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        logV07175.add(judul07175);
        
        label07175 = new JLabel("Daftar buku : ");
        label07175.setBounds(30, 60, 200, 50);
        logV07175.add(label07175);
        
        tableview07175 = new JTable();
        scroll = new JScrollPane(tableview07175);
        scroll.setBounds(30, 100, 630, 100);
        tableview07175.setModel(buku.daftarBuku07175());
        logV07175.add(scroll);
        
        labelpinjam = new JLabel("ISBN Buku : ");
        labelpinjam.setBounds(30, 200, 200, 50);
        logV07175.add(labelpinjam);
        
        textpinjam = new JTextField();
        textpinjam.setBounds(30, 240, 100, 30);
        logV07175.add(textpinjam);
        
        btnpinjam = new JButton("Pinjam");
        btnpinjam.setBounds(150, 240, 100, 30);
        logV07175.add(btnpinjam);
        
        btnback07175 = new JButton("Kembali");
        btnback07175.setBounds(570, 300, 80, 25);
        btnback07175.setBackground(Color.gray);
        btnback07175.setForeground(Color.black);
        logV07175.add(btnback07175); 
        
        logV07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logV07175.setVisible(true);
        logV07175.setLocationRelativeTo(null); 
        
        btnpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cek;
                BukuEntity07175 buku07175 = bukuController07175.getData07175(textpinjam.getText());
        AnggotaEntity07175 anggota07175 = anggotaController07175.getData(index);
                peminjam.insertPeminjaman07175(buku07175, anggota07175);
                JOptionPane.showMessageDialog(null, "Pinjam Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                DaftarRiwayat07175 d = new DaftarRiwayat07175(index);
                logV07175.dispose();
            }
        });
        
        btnback07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAnggota07175 m = new MenuAnggota07175(cek);
                logV07175.dispose();
            }
        });
    }
    public static void main(String[] args) {
        PinjamBuku07175 p = new PinjamBuku07175(1);
    }
}
