import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.*;

public class Ball 
{
    int size = 40;
    int speed = 5;
    int vx, vy;
    Random generator = new Random();
    int x = generator.nextInt(300) + 50;
    int y = generator.nextInt(500);

    Rectangle boundingBox;

    public Ball(int x, int y) 
    {
        this.x = x;
        this.y = y;

        vx = speed;
        vy = speed;

        boundingBox = new Rectangle(x, y, size, size);
        boundingBox.setBounds(this.x, this.y, this.size, this.size);
    }

    public void tick(Game game) 
    {
        boundingBox.setBounds(x, y, size, size);

        if (x <= 0) {
            game.p2Score++;
            vx = speed;
        } 
        else if (x + size >= game.getWidth()) {
            game.p1Score++;
            vx = -speed;
        }

        if (y <= 0) {
            vy = speed;
        } 
        else if (y + size >= game.getHeight()) {
            vy = -speed;
        }

        x += vx;
        y += vy;

        paddleCollide(game);
    }
    
    public void tick(GameTwoPlayer game2) 
    {
        boundingBox.setBounds(x, y, size, size);

        if (x <= 0) {
            game2.p2Score++;
            vx = speed;
        } 
        else if (x + size >= game2.getWidth()) {
            game2.p1Score++;
            vx = -speed;
        }

        if (y <= 0) {
            vy = speed;
        } 
        else if (y + size >= game2.getHeight()) {
            vy = -speed;
        }

        x += vx;
        y += vy;

        paddleCollide(game2);
    }

    private void paddleCollide(Game game) 
    {
        if (boundingBox.intersects(game.player.boundingBox)) {
            vx = speed;
        } 
        else if (boundingBox.intersects(game.ai.boundingBox)) {
            vx = -speed;
        }
    }
    
    private void paddleCollide(GameTwoPlayer game) 
    {
        if (boundingBox.intersects(game.player.boundingBox)) {
            vx = speed;
        } 
        else if (boundingBox.intersects(game.player2.boundingBox)) {
            vx = -speed;
        }
    }

    public void render(Graphics g) 
    {
        //g.setColor(new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256)));
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
}