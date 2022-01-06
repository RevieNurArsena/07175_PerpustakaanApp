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

public class DaftarAnggota07175 {
    JFrame log07175 = new JFrame();
    JLabel daftar07175, judul07175;
    JTextField textusername07175, textnama07175, textnotelp07175, textalamat07175;
    JLabel labelusername07175, labelnama07175, labelpass07175, labelnotelp07175, labelalamat07175;
    JButton daftarbutton07175, kembali07175;
    JPasswordField pass07175;
    
    public DaftarAnggota07175(){
            log07175.setSize(320,480);
            log07175.setLayout(null);
            log07175.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("SILAHKAN MASUKAN DATA");
            judul07175.setBounds(55, 50, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 15));
            log07175.add(judul07175);

            labelusername07175 = new JLabel("Username : ");
            labelusername07175.setBounds(55, 100, 70, 30);
            log07175.add(labelusername07175);

            textusername07175 = new JTextField();
            textusername07175.setBounds(55, 130, 200, 30);
            log07175.add(textusername07175);
            
            labelpass07175 = new JLabel("Password : ");
            labelpass07175.setBounds(55, 160, 70, 30);
            log07175.add(labelpass07175);
            
            pass07175 = new JPasswordField();
            pass07175.setBounds(55, 190, 200, 30);
            log07175.add(pass07175);
            
            labelnotelp07175 = new JLabel("No Telepon : ");
            labelnotelp07175.setBounds(55, 220, 130, 30);
            log07175.add(labelnotelp07175);
            
            textnotelp07175 = new JTextField();
            textnotelp07175.setBounds(55, 250, 200, 30);
            log07175.add(textnotelp07175);
            
            labelalamat07175 = new JLabel("Alamat : ");
            labelalamat07175.setBounds(55, 280, 130, 30);
            log07175.add(labelalamat07175);
            
            textalamat07175 = new JTextField();
            textalamat07175.setBounds(55, 310, 200, 30);
            log07175.add(textalamat07175);
            
            daftarbutton07175 = new JButton("Daftar");
            daftarbutton07175.setBounds(100, 360, 100, 40);
            daftarbutton07175.setBackground(Color.gray);
            daftarbutton07175.setForeground(Color.black);
            log07175.add(daftarbutton07175);
            
            kembali07175 = new JButton("Kembali");
            kembali07175.setBounds(10, 410, 80, 25);
            kembali07175.setBackground(Color.gray);
            kembali07175.setForeground(Color.black);
            log07175.add(kembali07175);

            log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log07175.setVisible(true);
            log07175.setLocationRelativeTo(null);
            
            daftarbutton07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    AnggotaControllerInterface07175 anggota07175 = new AnggotaControllerInterfaceImpl07175();
                    anggota07175.insert07175(textusername07175.getText(), pass07175.getText(), textnotelp07175.getText(), textalamat07175.getText());
                    LoginAnggota07175 l07175 = new LoginAnggota07175();
                    log07175.dispose();
                }
            });
            
            kembali07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    LoginAnggota07175 l07175 = new LoginAnggota07175();
                    log07175.dispose();
                }
            });
        }
    public void kosong(){
        textusername07175.setText(null);
        textnama07175.setText(null);
        pass07175.setText(null);
        textnotelp07175.setText(null);
    }

    public static void main(String[] args) {
        DaftarAnggota07175 d =new DaftarAnggota07175();
    }
}
