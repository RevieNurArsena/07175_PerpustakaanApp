package GUI07175;

import Controller07175.AnggotaControllerInterface07175;
import Controller07175.AnggotaControllerInterfaceImpl07175;
import Entity07175.AnggotaEntity07175;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class EditAnggota {
    JFrame log07175 = new JFrame();
    JLabel daftar07175, judul07175;
    JTextField textusername07175, textnama07175, textnotelp07175;
    JLabel labelusername07175, labelnama07175, labelpass07175, labelnotelp07175;
    JButton updatebutton07175, kembali07175, upalamat, upnotelp;
    JPasswordField passwd07175;
    String nama07175, username07175, pass07175, notelp07175;
    int id07175;
    private AnggotaControllerInterface07175 anggota = new AnggotaControllerInterfaceImpl07175();
    JTable tableview07175;
    JScrollPane scroll;
    
    public EditAnggota(int cek07175){
        Edit07175(cek07175);
    }
    
    public void Edit07175(final int cek07175){
        
            log07175.setSize(500,500);
            log07175.setLayout(null);
            log07175.getContentPane().setBackground(Color.white);
            judul07175 = new JLabel("Edit Profile");
            judul07175.setBounds(200, 50, 200, 20);
            judul07175.setFont(new Font("Arial", Font.BOLD, 15));
            log07175.add(judul07175);
            
            tableview07175 = new JTable();
            scroll = new JScrollPane(tableview07175);
            scroll.setBounds(30, 100, 430, 50);
            tableview07175.setModel(anggota.daftarDataMurid07175(cek07175));
            log07175.add(scroll);
            
            labelpass07175 = new JLabel("Password : ");
            labelpass07175.setBounds(55, 160, 100, 30);
            log07175.add(labelpass07175);

            passwd07175 = new JPasswordField();
            passwd07175.setBounds(55, 190, 200, 30);
            passwd07175.setText(pass07175);
            log07175.add(passwd07175);
            
            labelnama07175 = new JLabel("Alamat : ");
            labelnama07175.setBounds(55, 220, 100, 30);
            log07175.add(labelnama07175);

            textnama07175 = new JTextField();
            textnama07175.setBounds(55, 250, 200, 30);
            textnama07175.setText(nama07175);
            log07175.add(textnama07175);
            
            labelnotelp07175 = new JLabel("No Telepon : ");
            labelnotelp07175.setBounds(55, 280, 130, 30);
            log07175.add(labelnotelp07175);
            
            textnotelp07175 = new JTextField();
            textnotelp07175.setBounds(55, 310, 200, 30);
            textnotelp07175.setText(notelp07175);
            log07175.add(textnotelp07175);

            updatebutton07175 = new JButton("Edit Password");
            updatebutton07175.setBounds(280, 190, 150, 30);
            updatebutton07175.setBackground(Color.gray);
            updatebutton07175.setForeground(Color.black);
            log07175.add(updatebutton07175);
            
            upnotelp = new JButton("Edit Alamat");
            upnotelp.setBounds(280, 250, 150, 30);
            upnotelp.setBackground(Color.gray);
            upnotelp.setForeground(Color.black);
            log07175.add(upnotelp);
            
            upalamat = new JButton("Edit No Telepon");
            upalamat.setBounds(280, 310, 150, 30);
            upalamat.setBackground(Color.gray);
            upalamat.setForeground(Color.black);
            log07175.add(upalamat);
            
            kembali07175 = new JButton("Kembali");
            kembali07175.setBounds(10, 410, 80, 25);
            kembali07175.setBackground(Color.gray);
            kembali07175.setForeground(Color.black);
            log07175.add(kembali07175);

            log07175.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log07175.setVisible(true);
            log07175.setLocationRelativeTo(null);
            
            updatebutton07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anggota.updateData(1, passwd07175.getText(), cek07175);
                EditAnggota ed = new EditAnggota(cek07175);
                log07175.dispose();
            }
            
            });
            
            upnotelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anggota.updateData(2, textnama07175.getText(), cek07175);
                EditAnggota ed = new EditAnggota(cek07175);
                log07175.dispose();
            }
            
            });
            
            upalamat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anggota.updateData(3, textnotelp07175.getText(), cek07175);
                EditAnggota ed = new EditAnggota(cek07175);
                log07175.dispose();
            }
            
            });
            
            kembali07175.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAnggota07175 m = new MenuAnggota07175(cek07175);
                log07175.dispose();
            }
            
            });
            
            
    }
    
    public static void main(String[] args) {
        EditAnggota e = new EditAnggota(1);
    }
}
