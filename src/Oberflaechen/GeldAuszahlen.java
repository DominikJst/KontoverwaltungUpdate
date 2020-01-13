package Oberflaechen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Oberflaechen.KontoErstellen.listOfKonten;

public class GeldAuszahlen extends JFrame{
    private JTextField kontonummerField;
    private JTextField kontonameField;
    private JTextField betragField;
    private JButton auszahlenButton;
    private JPanel panel1;

    public GeldAuszahlen(){

        add(panel1);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Auszahlen");

        auszahlenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(!kontonameField.getText().isEmpty() && !kontonummerField.getText().isEmpty() && !betragField.getText().isEmpty()) {

                    String name = kontonameField.getText();
                    int kontonummer = Integer.parseInt(kontonummerField.getText());
                    double betrag = Double.parseDouble(betragField.getText());

                    for(int i = 0; i < listOfKonten.size(); i++){

                        if(listOfKonten.get(i).getKontonummer() == kontonummer && listOfKonten.get(i).getName().equals(name)){

                            listOfKonten.get(i).setKontostand(listOfKonten.get(i).getKontostand() - betrag);

                            JOptionPane.showMessageDialog(null, "Der gewünschte Betrag wurde ausgezahlt!", "Auszahlung erfolgt!", JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            break;
                        }

                    }

                }
                else{
                    JOptionPane.showMessageDialog(null, "Bitte valide Eingaben treffen!", "Warnung!", JOptionPane.ERROR_MESSAGE);
                }

            }

        });
    }
}
