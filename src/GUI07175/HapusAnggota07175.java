package GUI07175;

import Controller07175.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class HapusAnggota07175 {
    JFrame logV07175 = new JFrame();
    JLabel judul07175 , label07175, labelid07175;
    JTable tableview07175;
    JScrollPane scroll;
    JTextField id07175;
    JButton backbutton07175, btnback07175, k;
    private AdminControllerInterface07175 admin = new AdminControllerInterfaceImpl07175();
    private AnggotaControllerInterface07175 anggota = new AnggotaControllerInterfaceImpl07175();
    
    public HapusAnggota07175(){
        logV07175.setSize(700, 400);
        logV07175.setLayout(null);
        logV07175.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("HAPUD DATA ANGGOTA");
        judul07175.setBounds(270, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        logV07175.add(judul07175);
        
        label07175 = new JLabel("Daftar Anggota : ");
        label07175.setBounds(30, 60, 100, 50);
        logV07175.add(label07175);
        
        tableview07175 = new JTable();
        scroll = new JScrollPane(tableview07175);
        scroll.setBounds(30, 100, 620, 100);
        tableview07175.setModel(anggota.daftarDataAnggota07175());
        logV07175.add(scroll);
        
        labelid07175 = new JLabel("ID Anggota : ");
        labelid07175.setBounds(30, 200, 100, 50);
        logV07175.add(labelid07175);
        
        id07175 = new JTextField();
        id07175.setBounds(30, 250, 100, 30);
        logV07175.add(id07175);
        
        btnback07175 = new JButton("Hapus");
        btnback07175.setBounds(150, 250, 100, 30);
        logV07175.add(btnback07175);
        
        k = new JButton("Kembali");
        k.setBounds(550, 300, 100, 30);
        logV07175.add(k);
        
        logV07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logV07175.setVisible(true);
        logV07175.setLocationRelativeTo(null); 
        
        btnback07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.hapusAnggota07175(Integer.valueOf(id07175.getText()));
                HapusAnggota07175 ha = new HapusAnggota07175();
                logV07175.dispose();
            }
        });
        
        k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAdmin07175 m = new MenuAdmin07175();
                logV07175.dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        HapusAnggota07175 h = new HapusAnggota07175();
    }
}
