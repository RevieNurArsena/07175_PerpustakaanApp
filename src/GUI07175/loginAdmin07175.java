package GUI07175;

import Controller07175.AdminControllerInterface07175;
import Controller07175.AdminControllerInterfaceImpl07175;
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
import Controller07175.AllObjectModel07175;

public class loginAdmin07175 {
    JFrame log07175 = new JFrame();
    JLabel login07175, judul07175;
    JTextField textusername07175, textnama07175;
    JLabel labelusername07175, labelnama07175, labelpass07175;
    JButton daftarbutton07175, loginbutton07175, loginmurid07175;
    JPasswordField passlogin07175;
    private boolean ceklogin07175 = false;
    
    public loginAdmin07175(){
            log07175.setSize(320,480);
            log07175.setLayout(null);
            log07175.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("SELAMAT DATANG");
            judul07175.setBounds(60, 10, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 20));
            log07175.add(judul07175);

            login07175 = new JLabel("Login Admin");
            login07175.setBounds(110, 50, 100, 100);
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
            
            loginmurid07175 = new JButton("=>");
            loginmurid07175.setBounds(255, 420, 50, 20);
            loginmurid07175.setBackground(Color.gray);
            loginmurid07175.setForeground(Color.black);
            log07175.add(loginmurid07175);

            log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log07175.setVisible(true);
            log07175.setLocationRelativeTo(null);        
            loginbutton07175.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    AdminControllerInterface07175 admin07175 = new AdminControllerInterfaceImpl07175();
                        if (admin07175.login07175(textusername07175.getText(), passlogin07175.getText()) == false){
                            JOptionPane.showMessageDialog(null, "Username Atau Password Salah", 
                                "information", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                           JOptionPane.showMessageDialog(null, "Login Berhasil", 
                                "information", JOptionPane.INFORMATION_MESSAGE);
                           //MenuAdmin07175 menuAdmin07175 = new MenuAdmin07175();
                           log07175.dispose();
                        }      
                }
            });
            
        loginmurid07175.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            LoginAnggota07175 loginAnggota07175 = new LoginAnggota07175();
            log07175.dispose();
        }
        });

        }
    public static void main(String[] args) {
        loginAdmin07175 loginadmin = new loginAdmin07175();
    }
}
