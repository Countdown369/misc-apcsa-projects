import java.awt.*;
import javax.swing.*;
public class Graphics2 extends JFrame{
    public Graphics2()
    {
        super();
    }
    public void paint(Graphics g){
        int width = 980;
        int height = 630;
        g.drawRect(10,10,width,height);

        for (double br = 0, bl = 0; br < width && bl < height; br+=(10.0*(98.0/63.0)), bl+=10)
        {
            g.drawLine(width+10,10+(int)bl,width+10-(int)br,height+10);
        }
        
        for (double ar = 0, al = 0; ar < width && al < height; ar+=(10.0*(98.0/63.0)), al+=10)
        {
            g.drawLine(10,10+(int)al,10+(int)ar,height+10);
        }
        
        for (double cr = 0, cl = 0; cr < width && cl < height; cr+=(10.0*(98.0/63.0)), cl+=10)
        {
            g.drawLine(10+(int)cr,10,10,height-(int)cl);
        }
        
        for (double dr = 0, dl = 0; dr < width && dl < height; dr+=(10.0*(98.0/63.0)), dl+=10)
        {
            g.drawLine(width-(int)dr,10,width+10,height-(int)dl);
        }
        
        for (double er = 0, el = 0; er < 440 && el < 348; er+=(10.0*(98.0/63.0)*(44.0/97.0)), el+=(10.0)*(348.0/630.0))
        {
            g.drawLine(718-(int)er,498,718,150+(int)el);
        }
        
        for (double fr = 0, fl = 0; fr < 440 && fl < 348; fr+=(10.0*(98.0/63.0)*(44.0/97.0)), fl+=(10.0)*(348.0/630.0))
        {
            g.drawLine(278+(int)fr,498,278,150+(int)fl);
        }
        
        for (double gr = 0, gl = 0; gr < 440 && gl < 348; gr+=(10.0*(98.0/63.0)*(44.0/97.0)), gl+=(10.0)*(348.0/630.0))
        {
            g.drawLine(278+(int)gr,150,278,498-(int)gl);
        }
        
        for (double gr = 0, gl = 0; gr < 440 && gl < 348; gr+=(10.0*(98.0/63.0)*(44.0/97.0)), gl+=(10.0)*(348.0/630.0))
        {
            g.drawLine(718-(int)gr,150,718,498-(int)gl);
        }
    }
    public static void main(String arg[]) {
        Graphics2 frame = new Graphics2();
        frame.setSize(980,630);
        frame.setVisible(true);
    }
}