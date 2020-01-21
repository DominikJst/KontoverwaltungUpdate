package Oberflaechen;

import Classes.KontoObject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;

import static Oberflaechen.KontoErstellen.listOfKonten;

public class MainMenue extends JFrame{
    private JPanel panel1;
    private JButton kontoErstellen;
    private JButton nameAbsteigend;
    private JButton kontoSuchenButton;
    private JButton kontoLöschen;
    private JButton nameAufsteigend;
    private JButton kontostandAufsteigend;
    private JButton kontostandAbsteigend;
    private JButton geldUeberweisen;
    private JButton kontenAktualisieren;
    private JButton anwendungBeenden;
    public JTextArea textArea1;
    private JButton einzahlenButton;
    private JButton auszahlenButton;
    StringBuilder string = new StringBuilder();


    public MainMenue(){

        add(panel1);
        setSize(600, 500);

        // Konten erstellen
        kontoErstellen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                KontoErstellen accErstellen = new KontoErstellen();
                accErstellen.setVisible(true);
            }
        });

        // Konto loeschen
        kontoLöschen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                KontoLoeschen loeschen = new KontoLoeschen();
                loeschen.setVisible(true);
            }
        });

        // Anwendung beenden
        anwendungBeenden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                dispose();
            }
        });

        // Konten aktualisieren
        kontenAktualisieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(listOfKonten.isEmpty()){

                    textArea1.setText("");
                    JOptionPane.showMessageDialog(null, "Es sind keine Konten vorhanden!", "Warnung!", JOptionPane.WARNING_MESSAGE);
                }
                else{

                    textArea1.setText("");
                    string.delete(0, string.capacity());

                    for(int i = 0; i < listOfKonten.size(); i++){

                        string.append("\n" + "  ID: " +  listOfKonten.get(i).getId() + "\n" + "  Kontonummer: " + listOfKonten.get(i).getKontonummer() + "\n" + "  Kontoname: " + listOfKonten.get(i).getName() + "\n" + "  Kontostand: " + listOfKonten.get(i).getKontostand() + "\n" + "  ---------------");

                    }

                    textArea1.setText(string.toString());
                }

            }
        });

        // Konten suchen
        kontoSuchenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                KontoSuchen suchen = new KontoSuchen();
                suchen.setVisible(true);
            }
        });

        // Geld ueberweisen
        geldUeberweisen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                GeldUeberweisen ueberweisen = new GeldUeberweisen();
                ueberweisen.setVisible(true);
            }
        });

        // Sortieren Name aufsteigend
        nameAufsteigend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Collections.sort(listOfKonten, (KontoObject o1, KontoObject o2) -> CharSequence.compare(o1.name, o2.name));
                JOptionPane.showMessageDialog(null, "Konten wurden aufsteigend nach Name sortiert! Bitte aktualisieren!", "Einzahlung erfolgt!", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Sortieren Name absteigend
        nameAbsteigend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Collections.sort(listOfKonten, (KontoObject o1, KontoObject o2) -> CharSequence.compare(o1.name, o2.name));
                Collections.reverse(listOfKonten);
                JOptionPane.showMessageDialog(null, "Konten wurden absteigend nach Name sortiert! Bitte aktualisieren!", "Einzahlung erfolgt!", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Sortieren Kontostand aufsteigend
        kontostandAufsteigend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Collections.sort(listOfKonten, Comparator.comparingDouble((KontoObject o) -> o.kontostand));
                JOptionPane.showMessageDialog(null, "Konten wurden aufsteigend nach Kontostand sortiert! Bitte aktualisieren!", "Einzahlung erfolgt!", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Sortieren Kontostand absteigend
        kontostandAbsteigend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Collections.sort(listOfKonten, Comparator.comparingDouble((KontoObject o) -> o.kontostand));
                Collections.reverse(listOfKonten);
                JOptionPane.showMessageDialog(null, "Konten wurden absteigend nach Kontostand sortiert! Bitte aktualisieren!", "Einzahlung erfolgt!", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        einzahlenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                GeldEinzahlen einzahlen = new GeldEinzahlen();
                einzahlen.setVisible(true);

            }
        });
        auszahlenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                GeldAuszahlen auszahlen = new GeldAuszahlen();
                auszahlen.setVisible(true);
            }
        });
    }

}
