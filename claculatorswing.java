import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class Cal extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;
    int a, b, tot = 0;

    Cal() {
        setTitle("Calcullator");
        setSize(800, 400);
        setVisible(true);
        GridLayout go = new GridLayout(5, 2);
        this.setLayout(go);
        l1 = new Label("first number");
        l2 = new Label("second number");
        l3 = new Label("Result : ");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);
        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        b1 = new Button("Add");
        b2 = new Button("Subtract");
        b3 = new Button("Multiply");
        b4 = new Button("Division");
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(l3);
        this.add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Input.....");
        }
        if (e.getSource() == b1) {
            tot = a + b;
            t3.setText(String.valueOf(tot));
        }
        if (e.getSource() == b2) {
            tot = a - b;
            t3.setText(String.valueOf(tot));
        }
        if (e.getSource() == b3) {
            tot = a * b;
            t3.setText(String.valueOf(tot));
        }
        if (e.getSource() == b4) {
            tot = a / b;
            t3.setText(String.valueOf(tot));
        }
    }
}

class claculatorswing {
    public static void main(String[] args) {
        Cal ob = new Cal();
    }
}
