import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.*;

public class NormalBall 
{
    int size = 40;
    int speed = 25;
    int vx, vy;
    Random generator = new Random();
    int x = generator.nextInt(300) + 50;
    int y = generator.nextInt(500);

    Rectangle boundingBox;

    public NormalBall(int x, int y) 
    {
        this.x = x;
        this.y = y;

        vx = speed;
        vy = speed;

        boundingBox = new Rectangle(x, y, size, size);
        boundingBox.setBounds(this.x, this.y, this.size, this.size);
    }
    
    public void tick(NormalGame game) 
    {
        boundingBox.setBounds(x, y, size, size);
        if (x + size >= game.getWidth()) 
        {
            game.p1Score++;
            vx = -speed;
        }

        if (y <= 0) 
        {
            vy = speed;
        } 
        else if (y + size >= game.getHeight()) 
        {
            vy = -speed;
        }

        x += vx;
        y += vy;

        paddleCollide(game);
    }
    
    private void paddleCollide(NormalGame game) 
    {
        if (boundingBox.intersects(game.player.boundingBox)) {
            vx = speed;
        } 
        else if (boundingBox.intersects(game.ai.boundingBox)) {
            vx = -speed;
        }
    }

    public void render(Graphics g) 
    {
        g.setColor(Color.RED);
        //g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
}