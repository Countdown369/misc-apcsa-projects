import java.awt.*;

import javax.swing.*;

import java.util.Random;

public class Graphics3 extends JFrame
{

    public Graphics3()

    {

        super();

    }

    public void paint(Graphics g)     

    {

        // Draw Grid

        g.drawRect(10,10,780,580);

        g.drawLine(400,10,400,590);

        g.drawLine(10,300,790,300);


        // Draw Random Lines
        Random rand = new Random();
        for(int k = 0; k < 100; k++)
        {
            g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
            g.drawLine(10+rand.nextInt(390),10+rand.nextInt(290),10+rand.nextInt(390),10+rand.nextInt(290));
        }
        // Draw Random Squares
        for (int k = 0; k < 100; k++)

        {

            int x = rand.nextInt(341)+400;

            int y = rand.nextInt(251);

            int red = rand.nextInt(256);

            int green = rand.nextInt(256);

            int blue = rand.nextInt(256);

            g.setColor(new Color(red,green,blue));

            g.fillRect(x,y,50,50);
        }
        // Draw Random Circles
        for(int k = 0; k < 100; k++)
        {
            int d = (int)(Math.random()*201);
            int x = rand.nextInt(390-d)+10;
            int y = rand.nextInt(290-d)+300;
            g.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
            g.drawOval(x,y,d,d);
        }
        // Draw 3-D Box
        g.setColor(Color.red);
        g.fillRect(550,400,100,100);
        g.setColor(Color.blue);
        Polygon blue = new Polygon();
        blue.addPoint(650,400);
        blue.addPoint(600,350);
        blue.addPoint(600,400);
        g.fillPolygon(blue);
        g.setColor(Color.yellow);
        g.fillRect(500,350,100,50);
        g.setColor(Color.green);
        Polygon gt1 = new Polygon();
        gt1.addPoint(500,350);
        gt1.addPoint(500,400);
        gt1.addPoint(550,400);
        g.fillPolygon(gt1);
        g.fillRect(500,400,50,50);
        Polygon gt2 = new Polygon();
        gt2.addPoint(500,450);
        gt2.addPoint(550,450);
        gt2.addPoint(550,500);
        g.fillPolygon(gt2);
    }    
    public static void main(String args[]) 
    {

        Graphics3 frame = new Graphics3();

        frame.setSize(850,650);

        frame.setVisible(true);

    }

}