package Oberflaechen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartLogin extends JFrame {

    private JPanel panel1;
    private JButton loginButton;

    public StartLogin(){

        add(panel1);
        setSize(500, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Login");
        loginButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                MainMenue menue = new MainMenue();
                menue.setVisible(true);

                dispose();
            }
        });
    }
}
