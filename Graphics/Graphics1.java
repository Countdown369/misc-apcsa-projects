import java.awt.*;
import javax.swing.*;
public class Graphics1 extends JFrame{
  public Graphics1(){
    super();
  }
  public void paint(Graphics g){
        g.drawRect(30,50,200,200);
        g.drawRect(80,100,200,200);
        g.drawLine(30,50,80,100);
        g.drawLine(230,50,280,100);
        g.drawLine(30,250,80,300);
        g.drawLine(230,250,280,300);
        g.drawOval(55,75,200,200); //COPY
        g.drawOval(80,75,150,200);
        g.drawOval(105,75,100,200);
        g.drawOval(130,75,50,200);
        g.drawOval(55,100,200,150);
        g.drawOval(55,125,200,100);
        g.drawOval(55,150,200,50);
        g.fillRect(30,500,20,100);
        g.fillRect(50,500,40,20);
        g.fillRect(70,520,20,80);
        g.fillRect(50,540,20,20);
        g.fillRect(110,500,20,100);
        g.fillRect(130,500,40,20);
        g.fillRect(150,520,20,40);
        g.fillRect(130,540,20,20);
        g.fillRect(190,500,20,100);
        g.fillRect(210,500,40,20);
        g.fillRect(210,580,40,20);
        
        g.fillRect(270,500,60,20);
        g.fillRect(270,520,20,40);
        g.fillRect(290,540,40,20);
        g.fillRect(310,560,20,40);
        g.fillRect(270,580,40,20);
        
        g.fillArc(380,500,60,60,135,270);
        g.fillArc(340,540,60,60,225,270);
        g.fillArc(380,580,60,60,315,270);
        g.fillArc(420,540,60,60,45,270);
        
        g.drawOval(520,500,150,150);
        g.drawLine(595,650,520,575);
        g.drawLine(595,650,648,522);
        g.drawLine(520,575,648,522);
        
        g.drawOval(547,552,70,70);
  }
  public static void main(String args[])
  {
    Graphics1 frame = new Graphics1();
    frame.setSize(700,700);
    frame.setVisible(true);
  }
}