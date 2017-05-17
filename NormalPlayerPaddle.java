import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.*;

public class NormalPlayerPaddle 
{
    
    int x;
    int y;
    int width = 20;
    int height = 100;
    double speed = 35;
    Random generator = new Random();

    Rectangle boundingBox;

    boolean goingUp = false;
    boolean goingDown = false;

    public NormalPlayerPaddle(int x, int y) 
    {
        this.x = x;
        this.y = y;
        
        boundingBox = new Rectangle(x, y, width, height);
        boundingBox.setBounds(x, y, width, height);
    }
    
    public void tick(NormalGame game) 
    {
        boundingBox.setBounds(x, y, width, height);
        
        if (goingUp && y > 0) {
            y -= speed;
        }
        else if (goingDown && y < game.getHeight() - height) {
            y += speed;
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }
}