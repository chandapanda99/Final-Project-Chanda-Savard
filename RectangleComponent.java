import java.awt.*;
import javax.swing.JComponent;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{
    int x, y, w, h, r, g, b;
    Rectangle box;
    public RectangleComponent(int v, int i, int width, int height, int red, int green, int blue)
    {
        this.x = v;
        this.y = i;
        this.w = width;
        this.h = height;
        this.r = red;
        this.g = green;
        this.b = blue;
        box = new Rectangle(x, y, w, h);
    }
    
    public void paintComponent(Graphics g)
    {  
       // Recover Graphics2D
       Graphics2D g2 = (Graphics2D) g;

       // Construct a rectangle and draw it
       //Rectangle box = new Rectangle(5, 10, 20, 30);
       g2.setColor(new Color(this.r, this.g, this.b));
       g2.fill(box);

       // Move rectangle 15 units to the right and 25 units down
       //box.translate(35, 25);
 
       // Draw moved rectangle
    }
    
    public void nextFrame()
    {
        //update the objects in the cityscape so they are animated
        //box.translate(5, 5);
        //request that the java RunTime repaints this component by invoking its paintComponent
        repaint();
    }
}