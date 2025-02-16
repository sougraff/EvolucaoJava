import javax.swing.*;
import java.awt.*;

public class BolaRaquete1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setTitle("Roland Garros");
        f.setSize(600, 600);
        f.setLocation(500, 150);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        Personagens personagens = new Personagens();
        f.add(personagens);
        f.setVisible(true);
    }
}
    class Personagens extends JPanel{
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLACK);
            g.fillOval(300, 300, 25, 25);

            g.setColor(Color. red);
            g.fillRect(1, 250, 10, 50);
        }
}
