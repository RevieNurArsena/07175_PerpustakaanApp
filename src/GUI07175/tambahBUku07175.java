package GUI07175;

import Controller07175.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tambahBUku07175 {
    JFrame log07175 = new JFrame();
    JLabel daftar07175, judul07175;
    JTextField textusername07175, textnama07175, textnotelp07175, textalamat07175, texthalaman, textjudul;
    JLabel labelusername07175, labelnama07175, labelpass07175, labelnotelp07175, labelalamat07175, halaman;
    JButton daftarbutton07175, kembali07175, k;
    JPasswordField pass07175;
    private BukuControllerInterface07175 buku = new BukuControllerInterfaceImpl07175();
    public tambahBUku07175(){
            log07175.setSize(320,600);
            log07175.setLayout(null);
            log07175.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("SILAHKAN MASUKAN DATA");
            judul07175.setBounds(55, 50, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 15));
            log07175.add(judul07175);

            labelusername07175 = new JLabel("ISBN : ");
            labelusername07175.setBounds(55, 100, 70, 30);
            log07175.add(labelusername07175);

            textusername07175 = new JTextField();
            textusername07175.setBounds(55, 130, 200, 30);
            log07175.add(textusername07175);
            
            labelpass07175 = new JLabel("Judul : ");
            labelpass07175.setBounds(55, 160, 70, 30);
            log07175.add(labelpass07175);
            
            textjudul = new JTextField();
            textjudul.setBounds(55, 190, 200, 30);
            log07175.add(textjudul);
            
            labelnotelp07175 = new JLabel("Penerbit : ");
            labelnotelp07175.setBounds(55, 220, 130, 30);
            log07175.add(labelnotelp07175);
            
            textnotelp07175 = new JTextField();
            textnotelp07175.setBounds(55, 250, 200, 30);
            log07175.add(textnotelp07175);
            
            labelalamat07175 = new JLabel("Terbit : ");
            labelalamat07175.setBounds(55, 280, 130, 30);
            log07175.add(labelalamat07175);
            
            textalamat07175 = new JTextField();
            textalamat07175.setBounds(55, 310, 200, 30);
            log07175.add(textalamat07175);
            
            halaman = new JLabel("Halaman : ");
            halaman.setBounds(55, 340, 130, 30);
            log07175.add(halaman);
            
            texthalaman = new JTextField();
            texthalaman.setBounds(55, 370, 200, 30);
            log07175.add(texthalaman);
            
            daftarbutton07175 = new JButton("Tambah");
            daftarbutton07175.setBounds(100, 420, 100, 40);
            daftarbutton07175.setBackground(Color.gray);
            daftarbutton07175.setForeground(Color.black);
            log07175.add(daftarbutton07175);
            
            kembali07175 = new JButton("Kembali");
            kembali07175.setBounds(10, 520, 80, 25);
            kembali07175.setBackground(Color.gray);
            kembali07175.setForeground(Color.black);
            log07175.add(kembali07175);
            
            k = new JButton("Kembali");
            k.setBounds(550, 350, 100, 30);
            log07175.add(k);

            log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log07175.setVisible(true);
            log07175.setLocationRelativeTo(null);
            
            daftarbutton07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    buku.insertBuku07175(textusername07175.getText(), textjudul.getText(), textnotelp07175.getText(), Integer.valueOf(textalamat07175.getText()), Integer.valueOf(texthalaman.getText()));
                    JOptionPane.showMessageDialog(null, "Tambah Buku Berhasil", "information", JOptionPane.INFORMATION_MESSAGE);
                    DaftarBuku07175 d = new DaftarBuku07175();
                    log07175.dispose();
                }
            });
            
            kembali07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    MenuAdmin07175 m = new MenuAdmin07175();
                    log07175.dispose();
                }
            });
            
            k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAdmin07175 m = new MenuAdmin07175();
                log07175.dispose();
            }
        });
        }
    
    public static void main(String[] args) {
        tambahBUku07175 t = new tambahBUku07175();
    }
}
