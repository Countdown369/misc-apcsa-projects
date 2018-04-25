import java.awt.*;
import javax.swing.*;

public class Executable extends JFrame{
  public Executable()
  {
    super();
  }
  public void paint(Graphics g)
  {
      Shapes.drawBack(g);
      Shapes.drawCircle(g);
      Shapes.drawSquare(g);
      Shapes.drawTriangle(g);
      Border.drawWhite(g);
      Border.drawCorner(g);
      Border.drawBlackBorder(g);
      Text.drawNum(g);
      Text.drawWord(g);
  }
  public static void main(String args[]) {
    Executable executableframe = new Executable();
    executableframe.setSize(1920,1080);
    executableframe.setVisible(true);
  }
}
