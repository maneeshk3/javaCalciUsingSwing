import javax.swing.*;

import java.awt.event.ActionListener;

class Calci extends JFrame{

    public Calci(){
        setVisible(true);
        setSize(200, 400);

        //creating a text field.
        JTextField textfield = new JTextField(10);

        //creating a pannnel
        JPanel panarea = new JPanel();

        // create number buttons        
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bdiv, bmul, bdot, bcan, beql;
        //creating numberic button.
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        // equals button
        beql = new JButton("=");
        // create operator buttons
        badd = new JButton("+");
        bsub = new JButton("-");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bcan = new JButton("C");
        // create . button
        bdot = new JButton(".");
        
        //adding components to the fpanel.
        panarea.add(textfield);
        panarea.add(b0);
        panarea.add(b1);
        panarea.add(b2);
        panarea.add(b3);
        panarea.add(b4);
        panarea.add(b5);
        panarea.add(b6);
        panarea.add(b7);
        panarea.add(b8);
        panarea.add(b9);
        panarea.add(badd);
        panarea.add(bsub);
        panarea.add(bdiv);
        panarea.add(bmul);
        panarea.add(beql);
        panarea.add(bdot);
        panarea.add(bcan);

        //adding panel to the frame
        this.getContentPane().add(panarea);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Calci calculator = new Calci();
    }
}