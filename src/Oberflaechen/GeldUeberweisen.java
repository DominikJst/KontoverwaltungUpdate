package Oberflaechen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Oberflaechen.KontoErstellen.listOfKonten;

public class GeldUeberweisen extends JFrame{
    private JTextField kontonameField;
    private JTextField kontonummerField;
    private JTextField betragField;
    private JTextField kontonameFieldEmpfaenger;
    private JTextField kontonummerFieldEmpfaenger;
    private JPanel panel1;
    private JButton überweisenButton;
    private JButton verlassenButton;

    public GeldUeberweisen() {
        try {
            add(panel1);
            setSize(400, 300);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setTitle("Geld überweisen");

            verlassenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    dispose();
                }
            });
            überweisenButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {

                    if (!kontonameField.getText().isEmpty() && !kontonummerField.getText().isEmpty() && !betragField.getText().isEmpty() && !kontonameFieldEmpfaenger.getText().isEmpty() && !kontonummerFieldEmpfaenger.getText().isEmpty()) {

                            String kontoname = kontonameField.getText();
                            int kontonummer = Integer.parseInt(kontonummerField.getText());
                            double betrag = Double.parseDouble(betragField.getText());

                            String kontonameEmpfaenger = kontonameFieldEmpfaenger.getText();
                            int kontonummerEmpfaenger = Integer.parseInt(kontonummerFieldEmpfaenger.getText());

                        for (int i = 0; i < listOfKonten.size(); i++) {

                            if (listOfKonten.get(i).getName().equals(kontoname) && listOfKonten.get(i).getKontonummer() == kontonummer) {

                                for (int e = 0; e < listOfKonten.size(); e++) {

                                    if (listOfKonten.get(e).getName().equals(kontonameEmpfaenger) && listOfKonten.get(e).getKontonummer() == kontonummerEmpfaenger) {

                                        //Sender
                                        listOfKonten.get(i).setKontostand(listOfKonten.get(i).getKontostand() - betrag);

                                        //Empfaenger
                                        listOfKonten.get(e).setKontostand(listOfKonten.get(e).getKontostand() + betrag);
                                        JOptionPane.showMessageDialog(null, "Der gewünschte Betrag wurde überwiesen!", "Überwiesen!", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }

                            }

                        }

                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Bitte valide Eingaben treffen!", "Warnung!", JOptionPane.ERROR_MESSAGE);
                    }

                }

            });

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bitte valide Eingaben treffen!", "Warnung!", JOptionPane.ERROR_MESSAGE);
        }

    }

}


