package arayuz;

import yeniProje.Kahve;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showInputDialog;

public class ArayuzForm extends JFrame {

    static boolean sekerTercih=false;



    private JRadioButton hangiKahveyiIstiyorsunuzRadioButton;
    private JPanel anaPanel;
    private JRadioButton ekspresso;
    private JRadioButton buyuk;
    private JRadioButton sutEvet;
    private JRadioButton filteKahve;
    private JRadioButton orta;
    private JRadioButton sutHayir;
    private JButton HazirlaButonu;
    private JRadioButton sekerEvet;
    private JRadioButton sekerHayir;
    private JRadioButton turkKahvesi;
    private JRadioButton kucuk;
    private JOptionPane miktar;




    public ArayuzForm(){
        String cesit="";
        String boyut1="";
        String seker1="";
        String sut1="";
        String miktar="";
        Kahve deneme=new Kahve(cesit,sut1,seker1,boyut1,miktar);


        add(anaPanel);
        setSize(800,400);
        setTitle("Kahve Makinası");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ButtonGroup seker=new ButtonGroup();

        seker.add(sekerEvet);
        seker.add(sekerHayir);

        ButtonGroup kahve=new ButtonGroup();

        kahve.add(turkKahvesi);
        kahve.add(filteKahve);
        kahve.add(ekspresso);

        ButtonGroup boyut=new ButtonGroup();

        boyut.add(buyuk);
        boyut.add(kucuk);
        boyut.add(orta);

        ButtonGroup sut=new ButtonGroup();

        sut.add(sutEvet);
        sut.add(sutHayir);




        turkKahvesi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                deneme.setCesit("Türk Kahvesi");


            }
        });
        ekspresso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setCesit("Eksperesso");
            }
        });
        filteKahve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setCesit("Filtre Kahve");
            }
        });
        buyuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setBoyut("Büyük");
            }
        });
        orta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setBoyut("Orta");
            }
        });
        kucuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setBoyut("Küçük");
            }
        });
        sutEvet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setSut("Sütlü");
            }
        });
        sutHayir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setSut("Sütsüz");

            }
        });
        sekerHayir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deneme.setSeker("Sekersiz");
            }
        });
        HazirlaButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(sekerTercih){JOptionPane.showMessageDialog(HazirlaButonu,deneme.getSut()+" "+
                       deneme.getMiktar()+ " "+deneme.getSeker()+" "+deneme.getBoyut()+" "+
                        " boy"+deneme.getCesit()+" hazır.");}
                else{JOptionPane.showMessageDialog(HazirlaButonu,deneme.getSut()+" "+deneme.getSeker()+" "+deneme.getBoyut()+" "+
                        " boy"+deneme.getCesit()+" hazır.");}

            }
        });
        sekerEvet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sekerTercih=true;

                deneme.setSeker("sekerli");

                JOptionPane a=new JOptionPane();
                    int miktar= Integer.parseInt(showInputDialog("Kaç şeker istersiniz?"));

                deneme.setMiktar(String.valueOf(miktar));


            }


        });
    }



}
