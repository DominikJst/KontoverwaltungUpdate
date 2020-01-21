package Classes;

import Oberflaechen.MainMenue;

import javax.swing.*;

public class Main {

    public static void main(String []args){
        MainMenue login = new MainMenue();
        login.setVisible(true);
        login.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        login.setTitle("Menü");
    }
}
