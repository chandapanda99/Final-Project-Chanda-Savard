import javax.swing.JFrame;
import java.awt.*;

public class Background
{
    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame();
        
        frame.setSize(1710, 910);
        frame.setTitle("PONG!");
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int h1 = 95;
        RectangleComponent building1 = new RectangleComponent(98, 90, 50, 410, 0, 0, 0);
        while (h1 < 500)
        {
            RectangleComponent window = new RectangleComponent(118, h1, 10, 10, 255, 255, 0);
            frame.add(window);
            frame.setVisible(true);
            h1 += 15;
        }
        frame.add(building1);
        frame.setVisible(true);
        
        int h2 = 100;
        RectangleComponent building2 = new RectangleComponent(310, 95, 50, 405, 255, 0, 255);
        while (h2 < 500)
        {
            RectangleComponent window1 = new RectangleComponent(330, h2, 10, 10, 255, 255, 0);
            frame.add(window1);
            frame.setVisible(true);
            h2 += 15;
        }
        frame.add(building2);
        frame.setVisible(true);
        
        int h3 = 385;
        RectangleComponent building3 = new RectangleComponent(700, 380, 50, 120, 233, 221, 231);
        while (h3 < 500)
        {
            RectangleComponent window2 = new RectangleComponent(720, h3, 10, 10, 255, 255, 0);
            frame.add(window2);
            frame.setVisible(true);
            h3 += 15;
        }
        frame.add(building3);
        frame.setVisible(true);
        
        int h4 = 85;
        RectangleComponent building4 = new RectangleComponent(899, 80, 50, 420, 244, 123, 212);
        while (h4 < 500)
        {
            RectangleComponent window3 = new RectangleComponent(919, h4, 10, 10, 255, 255, 0);
            frame.add(window3);
            frame.setVisible(true);
            h4 += 15;
        }
        frame.add(building4);
        frame.setVisible(true);
        
        int h5 = 7;
        RectangleComponent building5 = new RectangleComponent(1199, 2, 50, 498, 255, 0, 0);
        while (h5 < 500)
        {
            RectangleComponent window4 = new RectangleComponent(1219, h5, 10, 10, 255, 255, 0);
            frame.add(window4);
            frame.setVisible(true);
            h5 += 15;
        }
        frame.add(building5);
        frame.setVisible(true);
        
        RectangleComponent road = new RectangleComponent(0, 550, 2147483647, 75, 0, 0, 0);
        frame.add(road);
        frame.setVisible(true);
        
        RectangleComponent ground = new RectangleComponent(0, 500, 2147483647, 21474, 16, 79, 0);
        frame.add(ground);
        frame.setVisible(true);
    }
}