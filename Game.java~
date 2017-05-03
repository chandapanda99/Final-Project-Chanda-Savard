import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
    private static final long serialVersionUID = 1L;

    public static PlayerPaddle player;
    public static AIPaddle ai;
    public static Ball ball;
    InputHandler IH;
    Scanner Keyboard = new Scanner(System.in);
    JFrame frame;
    public final int WIDTH = 1580;
    public final int HEIGHT = 800;
    public final Dimension gameSize = new Dimension(WIDTH, HEIGHT);

    BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    static boolean gameRunning = false;

    int p1Score, p2Score;

    public void run() {

        while (gameRunning) {
            tick();
            render();

            try {
                Thread.sleep(1);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void start() {
        gameRunning = true;
        new Thread(this).start();
        
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
        
        RectangleComponent ground = new RectangleComponent(0, 500, 2147483647, 21474, 16, 79, 0);
        frame.add(ground);
        frame.setVisible(true);
    }

    public static void stop() {
        gameRunning = false;
        System.exit(0);
    }

    public Game() {
        frame = new JFrame();

        setMinimumSize(gameSize);
        setPreferredSize(gameSize);
        setMaximumSize(gameSize);

        frame.add(this, BorderLayout.CENTER);
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBackground(Color.GREEN);
        frame.setTitle("Speed Pong!");
        frame.setLocationRelativeTo(null);

        IH = new InputHandler(this);

        player = new PlayerPaddle(10, 60);
        ai = new AIPaddle(getWidth() - 20, 60);
        ball = new Ball(getWidth() / 2, getHeight() / 2);

    }

    public void tick() {
        player.tick(this);
        ai.tick(this);
        ball.tick(this);
    }

    public void render() {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        g.setColor(Color.RED);

        g.drawString("Player 1: " + p1Score, 5, 10);
        g.drawString("Player 2: " + p2Score, getWidth() - 70, 10);

        player.render(g);
        ai.render(g);
        ball.render(g);

        g.dispose();
        bs.show();
    }
}