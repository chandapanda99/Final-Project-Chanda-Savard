import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.*;

public class Ball 
{
    int size = 40;
    int speed = 20;
    int speed1 = 10;
    int vx, vy;
    Random generator = new Random();
    int x = generator.nextInt(300) + 50;
    int y = generator.nextInt(500);

    Rectangle boundingBox;

    public Ball(int x, int y) 
    {
        this.x = x;
        this.y = y;

        vx = speed1;
        vy = speed1;

        boundingBox = new Rectangle(x, y, size, size);
        boundingBox.setBounds(this.x, this.y, this.size, this.size);
    }
    
    public Ball(int x, int y, boolean isTwo)
    {
        this.x = x;
        this.y = y;

        vx = speed;
        vy = speed;

        boundingBox = new Rectangle(x, y, size, size);
        boundingBox.setBounds(this.x, this.y, this.size, this.size);
    }
    
    public void tick(GameTwoPlayer game) 
    {
        boundingBox.setBounds(x, y, size, size);

        if (x <= 0) {
            game.p2Score++;
            vx = speed1;
        } 
        else if (x + size >= game.getWidth()) {
            game.p1Score++;
            vx = -speed1;
        }

        if (y <= 0) {
            vy = speed1;
        } 
        else if (y + size >= game.getHeight()) {
            vy = -speed1;
        }

        x += vx;
        y += vy;

        paddleCollide(game);
    }
    
    private void paddleCollide(GameTwoPlayer game) 
    {
        if (boundingBox.intersects(game.player.boundingBox)) {
            vx = speed1;
        } 
        else if (boundingBox.intersects(game.player2.boundingBox)) {
            vx = -speed1;
        }
    }

    public void render(Graphics g) 
    {
        //g.setColor(new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)));
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
}