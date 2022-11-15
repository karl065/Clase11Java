package borderlayoutclase;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutClase {

    JFrame jframe;

    public BorderLayoutClase() {

        jframe = new JFrame(); // JFrame jframe = new JFrame();

        JButton btn1 = new JButton("NORTE");
        JButton btn2 = new JButton("SUR");
        JButton btn3 = new JButton("ESTE");
        JButton btn4 = new JButton("OESTE");
        JButton btn5 = new JButton("CENTRO");

        jframe.setLayout(new BorderLayout(50, 15));
        jframe.add(btn1, BorderLayout.NORTH);
        jframe.add(btn2, BorderLayout.SOUTH);
        jframe.add(btn3, BorderLayout.EAST);
        jframe.add(btn4, BorderLayout.WEST);
        jframe.add(btn5, BorderLayout.CENTER);
        
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        jframe.setTitle("Ejemplo Border Layout");
        

    }

    public static void main(String[] args) {
        
        new BorderLayoutClase();

    }

}
