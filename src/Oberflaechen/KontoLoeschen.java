package Oberflaechen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static Oberflaechen.KontoErstellen.listOfKonten;

public class KontoLoeschen extends JFrame {

    private JPanel panel1;
    private JTextField kontonummerLoeschenFeld;
    private JTextField kontonameLoeschenFeld;
    private JButton löschenButton;

    public KontoLoeschen() {

        add(panel1);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Konto löschen");

        löschenButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    int kontonummer = Integer.parseInt(kontonummerLoeschenFeld.getText());
                    String kontoname = kontonameLoeschenFeld.getText();

                    for (int i = 0; i < listOfKonten.size(); i++) {

                        if (kontonummer == listOfKonten.get(i).getKontonummer() && kontoname.equals(listOfKonten.get(i).getName())) {

                            listOfKonten.remove(i);
                        }
                    }
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Das Konto existiert nicht!", "Warnung!", JOptionPane.WARNING_MESSAGE);
                    System.out.println(e);
                }
            }
        });
    }
}
