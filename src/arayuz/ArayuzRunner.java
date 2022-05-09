package arayuz;

import javax.swing.*;

public class ArayuzRunner {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                ArayuzForm f=new ArayuzForm();
                f.setVisible(true);

            }
        });


    }
}
