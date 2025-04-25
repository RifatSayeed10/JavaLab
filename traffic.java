import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class tt {
    private static JLabel label;
    public static void main(String[] args) {
        JFrame frame=new JFrame(" Traffic Light");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton red = new JRadioButton("Red");
        JRadioButton yellow=new JRadioButton("yellow");
        JRadioButton green=new JRadioButton("green");

        ButtonGroup group=new ButtonGroup();
        group.add(red);
        group.add(green);
        group.add(yellow);

        label=new JLabel(" ");
        label.setBounds(140,160,200,30);

        red.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("stop");
                label.setForeground(Color.RED);
            }
        });

        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("go");
                label.setForeground(Color.GREEN);
            }
        });

        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("ready");
                label.setForeground(Color.orange);
            }
        });

        red.setBounds(140,70,100,30);
        yellow.setBounds(140, 100, 100, 30);
        green.setBounds(140, 130, 100, 30);

        frame.add(red);
        frame.add(yellow);
        frame.add(green);
        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);

    }
}
