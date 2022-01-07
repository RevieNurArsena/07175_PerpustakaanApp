package GUI07175;

import Controller07175.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HapusBuku07175 {
    JFrame logV07175 = new JFrame();
    JLabel judul07175 , label07175, labelid07175;
    JTable tableview07175;
    JScrollPane scroll;
    JTextField id07175;
    JButton backbutton07175, btnback07175, k;
    private BukuControllerInterface07175 buku07175 = new BukuControllerInterfaceImpl07175();
    
    
    public HapusBuku07175(){
        logV07175.setSize(700, 400);
        logV07175.setLayout(null);
        logV07175.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("HAPUS BUKU");
        judul07175.setBounds(270, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        logV07175.add(judul07175);
        
        label07175 = new JLabel("Daftar Buku : ");
        label07175.setBounds(30, 60, 100, 50);
        logV07175.add(label07175);
        
        tableview07175 = new JTable();
        scroll = new JScrollPane(tableview07175);
        scroll.setBounds(30, 100, 620, 100);
        tableview07175.setModel(buku07175.daftarBuku07175());
        logV07175.add(scroll);
        
        labelid07175 = new JLabel("ID Buku : ");
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
                buku07175.deleteBuku07175(id07175.getText());
                JOptionPane.showMessageDialog(null, "Hapus Buku Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                HapusBuku07175 ha = new HapusBuku07175();
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
        HapusBuku07175 ha = new HapusBuku07175();
    }
}
