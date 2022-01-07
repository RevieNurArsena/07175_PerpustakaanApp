package GUI07175;

import Controller07175.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginAnggota07175 {
    JFrame log07175 = new JFrame();
    JLabel login07175, judul07175;
    JTextField textusername07175, textnama07175;
    JLabel labelusername07175, labelnama07175, labelpass07175;
    JButton daftarbutton07175, loginbutton07175, loginadmin07175;
    JPasswordField passlogin07175;
    private AnggotaControllerInterface07175 anggota07175 = new AnggotaControllerInterfaceImpl07175();
    public LoginAnggota07175(){
        
    log07175.setSize(320,480);
            log07175.setLayout(null);
            log07175.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("SELAMAT DATANG");
            judul07175.setBounds(60, 10, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 20));
            log07175.add(judul07175);

            login07175 = new JLabel("Login Anggota");
            login07175.setBounds(100, 50, 150, 100);
            login07175.setFont(new Font("poppins", Font.BOLD, 15));
            log07175.add(login07175);

            labelusername07175 = new JLabel("Username : ");
            labelusername07175.setBounds(55, 150, 70, 30);
            log07175.add(labelusername07175);

            textusername07175 = new JTextField();
            textusername07175.setBounds(55, 180, 200, 30);
            log07175.add(textusername07175);

            labelpass07175 = new JLabel("Password : ");
            labelpass07175.setBounds(55, 220, 100, 30);
            log07175.add(labelpass07175);

            passlogin07175 = new JPasswordField();
            passlogin07175.setBounds(55, 250, 200, 30);
            log07175.add(passlogin07175);

            loginbutton07175 = new JButton("Login");
            loginbutton07175.setBounds(100, 310, 100, 40);
            loginbutton07175.setBackground(Color.gray);
            loginbutton07175.setForeground(Color.black);
            log07175.add(loginbutton07175);
            
            daftarbutton07175 = new JButton("Daftar Anggota");
            daftarbutton07175.setBounds(75, 360, 150, 40);
            daftarbutton07175.setBackground(Color.gray);
            daftarbutton07175.setForeground(Color.black);
            log07175.add(daftarbutton07175);
            
            loginadmin07175 = new JButton("<=");
            loginadmin07175.setBounds(0, 420, 50, 20);
            loginadmin07175.setBackground(Color.gray);
            loginadmin07175.setForeground(Color.black);
            log07175.add(loginadmin07175);
            
            log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log07175.setVisible(true);
            log07175.setLocationRelativeTo(null);
            
            loginbutton07175.addActionListener(new ActionListener() {    
            @Override
            public void actionPerformed(ActionEvent ae) {
                int cek07175 = anggota07175.login07175(textusername07175.getText(), passlogin07175.getText());    
                        if (cek07175 > 0){
                            JOptionPane.showMessageDialog(null, "Login Berhasil", 
                                "information", JOptionPane.INFORMATION_MESSAGE);
                            MenuAnggota07175 m = new MenuAnggota07175(cek07175);
                            log07175.dispose();
                            
                            log07175.dispose();
                        }else {
                           JOptionPane.showMessageDialog(null, "Username Atau Password Salah", 
                                "information", JOptionPane.INFORMATION_MESSAGE);
                           log07175.dispose();
                        }      
                }
            });

        daftarbutton07175.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            DaftarAnggota07175 d07175 = new DaftarAnggota07175();
            log07175.dispose();
        }
        });
        
        loginadmin07175.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            loginAdmin07175 logAdmin07175 = new loginAdmin07175();
            log07175.dispose();
        }
        });
    }
}

