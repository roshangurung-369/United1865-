import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements KeyListener {
    int x = 100, y = 100;

    public Game() {
        JFrame frame = new JFrame("2D Game");
        frame.add(this);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addKeyListener(this);

        Timer timer = new Timer(16, e -> repaint());
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) x -= 5;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) x += 5;
        if (e.getKeyCode() == KeyEvent.VK_UP) y -= 5;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) y += 5;
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new Game();
    }
}