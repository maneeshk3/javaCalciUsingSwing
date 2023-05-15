import javax.swing.*;
import java.awt.*;
class Calci{
    public static void main(String[] args) {
        //creating a calci fram using jframe, setting its size, and visibility true.
        JFrame calci = new JFrame();  
        calci.setSize(100, 200);  
        calci.setVisible(true);
        
        //textfield for the calculation.
        JTextField process = new JTextField(10);
        process.setEditable(false);

        // create number buttons        
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bdiv, bmul, bdot, bcan, beql;
        
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
        
        addAction

    }
}