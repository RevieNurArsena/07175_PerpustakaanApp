package GUI07175;

import Controller07175.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DaftarBuku07175 {
    JFrame logV07175 = new JFrame();
    JLabel judul07175 , label07175;
    JTable tableview07175;
    JScrollPane scroll;
    JButton backbutton07175, btnback07175;
    private BukuControllerInterface07175 buku07175 = new BukuControllerInterfaceImpl07175();
    
    public DaftarBuku07175(){
        logV07175.setSize(700, 630);
        logV07175.setLayout(null);
        logV07175.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("VIEW DATA");
        judul07175.setBounds(270, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        logV07175.add(judul07175);
        
        label07175 = new JLabel("Daftar Buku : ");
        label07175.setBounds(30, 60, 100, 50);
        logV07175.add(label07175);
        
        tableview07175 = new JTable();
        scroll = new JScrollPane(tableview07175);
        scroll.setBounds(30, 100, 620, 400);
        tableview07175.setModel(buku07175.daftarBuku07175());
        logV07175.add(scroll);
        
        btnback07175 = new JButton("Kembali");
        btnback07175.setBounds(570, 550, 80, 25);
        btnback07175.setBackground(Color.gray);
        btnback07175.setForeground(Color.black);
        logV07175.add(btnback07175); 
        
        logV07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logV07175.setVisible(true);
        logV07175.setLocationRelativeTo(null); 
        
        btnback07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAdmin07175 menuAdmin07175 = new MenuAdmin07175();
                logV07175.dispose();
            }
        });
    }
    
}
