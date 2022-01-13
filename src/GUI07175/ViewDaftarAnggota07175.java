package GUI07175;

import Controller07175.AnggotaControllerInterface07175;
import Controller07175.AnggotaControllerInterfaceImpl07175;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewDaftarAnggota07175 {
    JFrame logV07175 = new JFrame();
    JLabel judul07175 , label07175;
    JTable tableview07175;
    JScrollPane scroll;
    JButton backbutton07175, btnback07175;
    private AnggotaControllerInterface07175 anggota = new AnggotaControllerInterfaceImpl07175();
    
    public ViewDaftarAnggota07175(){
        logV07175.setSize(700, 630);
        logV07175.setLayout(null);
        logV07175.getContentPane().setBackground(Color.WHITE);
        
        judul07175 = new JLabel("VIEW DATA");
        judul07175.setBounds(270, 10, 600, 50);
        judul07175.setFont(new Font("Arial", Font.BOLD, 30));
        logV07175.add(judul07175);
        
        label07175 = new JLabel("Daftar Anggota : ");
        label07175.setBounds(30, 60, 100, 50);
        logV07175.add(label07175);
        
        tableview07175 = new JTable();
        scroll = new JScrollPane(tableview07175);
        scroll.setBounds(30, 100, 620, 400);
        tableview07175.setModel(anggota.daftarDataAnggota07175());
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
    
    public static void main(String[] args) {
        ViewDaftarAnggota07175 v = new ViewDaftarAnggota07175();
    }
}
