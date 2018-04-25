import javax.swing.JFrame;
public class GUIDriver
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        GUI12 gui = new GUI12();
        frame.add(gui);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
    }
}