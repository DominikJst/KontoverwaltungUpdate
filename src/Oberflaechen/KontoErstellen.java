package Oberflaechen;

import Classes.KontoObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KontoErstellen extends JFrame {
    private JTextField kontonameField;
    private JTextField kontonumerField;
    private JTextField kontostandField;
    private JPanel panel1;
    private JButton erstellenButton;
    public static ArrayList<KontoObject> listOfKonten = new ArrayList<>();

    public KontoErstellen(){

        add(panel1);
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Konto erstellen");

        erstellenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                String kontoname = kontonameField.getText();
                double kontostand = Double.parseDouble(kontostandField.getText());

                if(listOfKonten.size() == 0){
                    int kontonummer = Integer.parseInt(kontonumerField.getText());
                    KontoObject object = new KontoObject(kontonummer, kontoname, kontostand, 1);

                    listOfKonten.add(object);
                    dispose();

                }else{

                    for (int i = 0; i < listOfKonten.size(); i++) {

                        if (Integer.parseInt(kontonumerField.getText()) == listOfKonten.get(i).getKontonummer()) {
                            JOptionPane.showMessageDialog(null, "Die Kontonummer existiert bereits!", "Warnung!", JOptionPane.WARNING_MESSAGE);
                            break;

                        } else if (i == (listOfKonten.size() - 1) && Integer.parseInt(kontonumerField.getText()) != listOfKonten.get(i).getKontonummer()) {
                            int kontonummer = Integer.parseInt(kontonumerField.getText());
                            int id = listOfKonten.get(listOfKonten.size() - 1).getId() + 1;
                            KontoObject object = new KontoObject(kontonummer, kontoname, kontostand, id);
                            listOfKonten.add(object);
                            dispose();
                            break;

                        }

                    }
                }


                }catch(Exception e){
                   JOptionPane.showMessageDialog( null, "Bitte valide Eingaben treffen!", "Warnung!", JOptionPane.ERROR_MESSAGE);
                    System.out.println(e);
                }
        }
    });
    }


}
