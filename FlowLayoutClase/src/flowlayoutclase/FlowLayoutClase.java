package flowlayoutclase;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutClase {

    JFrame frameObj;

    public FlowLayoutClase() {

        frameObj = new JFrame();

        JButton b1 = new JButton("Boton Uno");
        JButton b2 = new JButton("Boton Dos");
        JButton b3 = new JButton("Boton Tres");

        frameObj.add(b1);
        frameObj.add(b2);
        frameObj.add(b3);
        frameObj.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 25));
        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
        frameObj.setTitle("Ejemplo FlowLayout");

    }

    public static void main(String[] args) {

        new FlowLayoutClase();

    }

}
