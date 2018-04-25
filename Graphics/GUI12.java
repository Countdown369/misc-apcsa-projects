import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
public class GUI12 extends JPanel implements ActionListener, KeyListener
{
    Timer time = new Timer(5, this);
    double x = 0, y = 0, vx = 0, vy = 0;
    public GUI12()
    {
        time.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
    }
    public void actionPerformed(ActionEvent e)
    {
        repaint();
        x += vx;
        y += vy;
    }
    public void up()
    {
        vy = -1.5;
        vx = 0;
    }
    public void down()
    {
        vy = 1.5;
        vx = 0;
    }
    public void right()
    {
        vy = 0;
        vx = 1.5;
    }
    public void left()
    {
        vy = 0;
        vx = -1.5;
    }
    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP)
        {
            up();
        }
        if (code == KeyEvent.VK_DOWN)
        {
            down();
        }
        if (code == KeyEvent.VK_LEFT)
        {
            left();
        }
        if (code == KeyEvent.VK_RIGHT)
        {
            right();
        }
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e){}
}