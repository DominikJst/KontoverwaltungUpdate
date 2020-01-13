package Oberflaechen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GesuchteKontenAnzeigen extends JFrame{
    private JButton schließenButton;
    private JTextArea textArea1;
    private JPanel panel1;

    public GesuchteKontenAnzeigen(){

        add(panel1);
        setSize(500, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Gesuchte Konten");



        schließenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    public void Anzeigen(String string){

        textArea1.setText(string);
    }
}
