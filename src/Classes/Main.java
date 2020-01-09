package Classes;

import Oberflaechen.StartLogin;

import javax.swing.*;

public class Main {

    public static void main(String []args){

          //        ******* Made by Dominik Jost *******        //

        StartLogin login = new StartLogin();
        login.setVisible(true);
        login.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        login.setTitle("Login");
    }
}
