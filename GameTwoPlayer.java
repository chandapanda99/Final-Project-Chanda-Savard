import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.JFrame;

public class GameTwoPlayer extends Canvas implements Runnable 
{
    public static NormalPlayerPaddle player;
    public static SecondPlayer player2;
    public static Ball ball;
    Random generator = new Random();
    InputHandlerTwo IH;
    Scanner Keyboard = new Scanner(System.in);
    JFrame frame;
    public final int WIDTH = 1580;
    public final int HEIGHT = 800;
    public final Dimension gameSize = new Dimension(WIDTH, HEIGHT);

    BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    static boolean gameRunning = false;

    int p1Score = -1;
    int p2Score;

    public void run() 
    {
        while (gameRunning) 
        {
            tick();
            render();
            try 
            {
                Thread.sleep(1);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }

    public void start() 
    {
        gameRunning = true;
        new Thread(this).start();
    }

    public static void stop() 
    {
        gameRunning = false;
        System.exit(0);
    }

    public GameTwoPlayer() 
    {
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
        frame.setTitle("Two Player Pong!");
        frame.setLocationRelativeTo(null);

        IH = new InputHandlerTwo(this);

        player = new NormalPlayerPaddle(10, 60);
        player2 = new SecondPlayer(getWidth() - 20, 60);
        ball = new Ball(getWidth() / 2, getHeight() / 2, true);

    }

    public void tick() 
    {
        player.tick(this);
        player2.tick(this);
        ball.tick(this);
    }

    public void render() 
    {
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) 
        {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();

        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

        g.setColor(Color.WHITE);
        
        g.setFont(new Font("Impact", Font.PLAIN, 30));
        g.drawString("Player 1: " + p1Score, 10, 30);
        g.drawString("Player 2: " + p2Score, getWidth() - 900, 30);

        player.render(g);
        player2.render(g);
        ball.render(g);

        g.dispose();
        bs.show();
    }
}