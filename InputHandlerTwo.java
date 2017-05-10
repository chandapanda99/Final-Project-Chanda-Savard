import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandlerTwo implements KeyListener 
{  
    public InputHandlerTwo (GameTwoPlayer game)
    {
        game.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) 
    {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_W) 
        {
            GameTwoPlayer.player.goingUp = true;
        }
        else if (keyCode == KeyEvent.VK_S) 
        {
            GameTwoPlayer.player.goingDown = true;
        }

        if (keyCode == KeyEvent.VK_UP)
        {
            GameTwoPlayer.player2.goingUp = true;
        }
        else if (keyCode == KeyEvent.VK_DOWN)
        {
            GameTwoPlayer.player2.goingDown = true;
        }

        if (keyCode == KeyEvent.VK_ESCAPE) 
        {
            System.exit(0);
        }
    }

    public void keyReleased(KeyEvent e) 
    {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_W) 
        {
            GameTwoPlayer.player.goingUp = false;
        }
        else if (keyCode == KeyEvent.VK_S) 
        {
            GameTwoPlayer.player.goingDown = false;
        }
        
        if (keyCode == KeyEvent.VK_UP)
        {
            GameTwoPlayer.player2.goingUp = false;
        }
        else if (keyCode == KeyEvent.VK_DOWN)
        {
            GameTwoPlayer.player2.goingDown = false;
        }
    }

    public void keyTyped(KeyEvent e) 
    {

    }

}
