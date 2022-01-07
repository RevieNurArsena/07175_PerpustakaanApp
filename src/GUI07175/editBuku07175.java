package GUI07175;

import Controller07175.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class editBuku07175 {
    JFrame logV07175 = new JFrame();
    JLabel judul07175 , label07175, labelid07175, labeljudul, labelpenerbit;
    JTable tableview07175;
    JScrollPane scroll;
    JTextField id07175, textjudul, textpenerbit;
    JButton backbutton07175, btnback07175, btnupjudul, btnuppenerbit, k;
    int i = 1, j = 2;
    private BukuControllerInterface07175 buku07175 = new BukuControllerInterfaceImpl07175();
    
    
    public editBuku07175(){
        logV07175.setSize(700, 480);
        logV07175.setLayout(null);
        logV07175.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("EDIT BUKU");
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
        
        labelid07175 = new JLabel("ISBN Buku : ");
        labelid07175.setBounds(30, 200, 100, 50);
        logV07175.add(labelid07175);
        
        id07175 = new JTextField();
        id07175.setBounds(30, 250, 100, 30);
        logV07175.add(id07175);
        
        labeljudul = new JLabel("Judul Buku : ");
        labeljudul.setBounds(30, 270, 100, 50);
        logV07175.add(labeljudul);
        
        textjudul = new JTextField();
        textjudul.setBounds(30, 310, 150, 30);
        logV07175.add(textjudul);
        
        labelpenerbit = new JLabel("Penerbit Buku : ");
        labelpenerbit.setBounds(30, 325, 150, 50);
        logV07175.add(labelpenerbit);
        
        textpenerbit = new JTextField();
        textpenerbit.setBounds(30, 360, 150, 30);
        logV07175.add(textpenerbit);
        
        btnback07175 = new JButton("Edit Judul");
        btnback07175.setBounds(200, 310, 100, 30);
        logV07175.add(btnback07175);
        
        btnuppenerbit = new JButton("Edit Penerbit");
        btnuppenerbit.setBounds(200, 360, 150, 30);
        logV07175.add(btnuppenerbit);
        
        k = new JButton("Kembali");
        k.setBounds(550, 350, 100, 30);
        logV07175.add(k);
        
        logV07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logV07175.setVisible(true);
        logV07175.setLocationRelativeTo(null); 
        
        btnback07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buku07175.updateBuku07175(i, id07175.getText(),textjudul.getText());
                JOptionPane.showMessageDialog(null, "Edit Judul Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                editBuku07175 ed = new editBuku07175();
                logV07175.dispose();
            }
        });
        
        btnuppenerbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buku07175.updateBuku07175(j,id07175.getText(),textpenerbit.getText());
            JOptionPane.showMessageDialog(null, "Edit Penerbit Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                editBuku07175 ed = new editBuku07175();
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
        editBuku07175 e = new editBuku07175();
    }
}
