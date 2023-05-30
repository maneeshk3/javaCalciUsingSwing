import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calci implements ActionListener{
    JFrame frame;
    JTextField txtFld;
    JButton numBut[] = new JButton[10];
    JButton subBut, addBut, mulBut, divBut, clrBut, decBut, eqlBut, delBut;

    JPanel panel;

    Calci(){  
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(null);

        txtFld = new JTextField();
        txtFld.setBounds(50, 25, 300, 50);
        txtFld.setEditable(false);
        
        subBut = new JButton("-");
        addBut = new JButton("+");
        mulBut = new JButton("*");
        divBut = new JButton("/");
        clrBut = new JButton("C");
        decBut = new JButton(".");
        eqlBut = new JButton("=");
        delBut = new JButton("<-");

        JButton funBut[]= {subBut, addBut, mulBut, divBut, clrBut, decBut, eqlBut, delBut};
        for(int i = 0 ; i < 8 ; i++){
            funBut[i].addActionListener(this);
            funBut[i].setFocusable(false);
        }

        for ( int i = 0 ; i < 10 ; i++){
            numBut[i] = new JButton(String.valueOf(i));
            numBut[i].addActionListener(this);
            numBut[i].setFocusable(false);
        }
        
        //creating button size to add in seperately 
        clrBut.setBounds(80, 390, 80, 65);
        delBut.setBounds(240, 390, 80, 65);
        
        //creating a panel for adding button in it.
        panel = new JPanel();
        panel.setBounds(25, 90, 350, 290);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        //adding button to the panel
        panel.add(addBut);
        panel.add(subBut);
        panel.add(mulBut);
        panel.add(divBut);

        panel.add(numBut[1]);
        panel.add(numBut[2]);
        panel.add(numBut[3]);
        panel.add(numBut[4]);
        panel.add(numBut[5]);
        panel.add(numBut[6]);
        panel.add(numBut[7]);
        panel.add(numBut[8]);

        panel.add(decBut);
        
        panel.add(numBut[9]);
        panel.add(numBut[0]);
        
        panel.add(eqlBut);


        frame.add(panel);
        frame.add(clrBut);
        frame.add(delBut);
        frame.add(txtFld);
        frame.setVisible(true);

    }
  

    public static void main(String[] args) {
        Calci calculator = new Calci();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

