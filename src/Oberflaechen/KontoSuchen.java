package Oberflaechen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static Oberflaechen.KontoErstellen.listOfKonten;

public class KontoSuchen extends JFrame{
    private JTextField kontonameField;
    private JTextField kontonummerField;
    private JButton suchenButton;
    private JPanel panel1;
    StringBuilder string = new StringBuilder();


    public KontoSuchen(){

        add(panel1);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        suchenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (!kontonameField.getText().isEmpty() && !kontonummerField.getText().isEmpty()) {

                        String kontoname = kontonameField.getText();
                        int kontonummer = Integer.parseInt(kontonummerField.getText());

                        for (int i = 0; i < listOfKonten.size(); i++) {

                            if (listOfKonten.get(i).getName().equals(kontoname) && listOfKonten.get(i).getKontonummer() == kontonummer) {
                                string.append("\n" + "  ID: " + listOfKonten.get(i).getId() + "\n" + "  Kontonummer: " + listOfKonten.get(i).getKontonummer() + "\n" + "  Kontoname: " + listOfKonten.get(i).getName() + "\n" + "  Kontostand: " + listOfKonten.get(i).getKontostand() + "\n" + "  ---------------");
                            }
                        }


                    } else if (!kontonameField.getText().isEmpty()) {

                        String kontoname = kontonameField.getText();

                        for (int i = 0; i < listOfKonten.size(); i++) {

                            if (listOfKonten.get(i).getName().equals(kontoname)) {
                                string.append("\n" + "  ID: " + (i + 1) + "\n" + "  Kontonummer: " + listOfKonten.get(i).getKontonummer() + "\n" + "  Kontoname: " + listOfKonten.get(i).getName() + "\n" + "  Kontostand: " + listOfKonten.get(i).getKontostand() + "\n" + "  ---------------");
                            }
                        }


                    } else if (!kontonummerField.getText().isEmpty()) {

                        int kontonummer = Integer.parseInt(kontonummerField.getText());

                        for (int i = 0; i < listOfKonten.size(); i++) {

                            if (listOfKonten.get(i).getKontonummer() == kontonummer) {
                                string.append("\n" + "  ID: " + (i + 1) + "\n" + "  Kontonummer: " + listOfKonten.get(i).getKontonummer() + "\n" + "  Kontoname: " + listOfKonten.get(i).getName() + "\n" + "  Kontostand: " + listOfKonten.get(i).getKontostand() + "\n" + "  ---------------");
                            }
                        }


                    }

                    dispose();

                    GesuchteKontenAnzeigen kontenAnzeigen = new GesuchteKontenAnzeigen();
                    kontenAnzeigen.setVisible(true);
                    kontenAnzeigen.Anzeigen(string.toString());

                }catch(Exception a){
                    JOptionPane.showMessageDialog( null, "Bitte valide Eingaben treffen!", "Warnung!", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

    }


}
