package TestWindows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;

public class Windows extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JPanel mainPanel;
    private JRadioButton texteEnBleuRadioButton;
    private JRadioButton texteEnGrasRadioButton;
    private JComboBox comboBox1;
    private JFormattedTextField formattedTextField1;

    public Windows() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(button1, textField1.getText() + " " + comboBox1.getSelectedItem());

        }
    });
        texteEnBleuRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(texteEnBleuRadioButton.isSelected()) {
                textField1.setFont(new Font("Arial", Font.PLAIN, 20));
                textField1.setForeground(blue);
                textField1.getText().equals("bleu");
            } else {
                textField1.setFont(new Font("Arial", Font.PLAIN, 20));
                textField1.setForeground(black);
            }
            }
        });
        texteEnGrasRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(texteEnGrasRadioButton.isSelected()) {
                    textField1.setFont(new Font("Arial", Font.BOLD, 20));
                } else {
                    textField1.setFont(new Font("Arial", Font.PLAIN, 20));
                }

            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = (String) comboBox1.getSelectedItem();
                formattedTextField1.setText(text);
            }
        });
    }

    public static void main(String[] args) {
    
        Windows t = new Windows();
        t.setContentPane(t.mainPanel);
        t.setTitle("test");
        t.setSize(300, 300);
        t.setVisible(true);
        t.textField1.getText();
    }

}


