import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandlerSeizureTwo implements KeyListener 
{  
    public InputHandlerSeizureTwo (SeizureTwoPlayer game)
    {
        game.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) 
    {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_W) 
        {
            SeizureTwoPlayer.player.goingUp = true;
        }
        else if (keyCode == KeyEvent.VK_S) 
        {
            SeizureTwoPlayer.player.goingDown = true;
        }

        if (keyCode == KeyEvent.VK_UP)
        {
            SeizureTwoPlayer.player2.goingUp = true;
        }
        else if (keyCode == KeyEvent.VK_DOWN)
        {
            SeizureTwoPlayer.player2.goingDown = true;
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
            SeizureTwoPlayer.player.goingUp = false;
        }
        else if (keyCode == KeyEvent.VK_S) 
        {
            SeizureTwoPlayer.player.goingDown = false;
        }
        
        if (keyCode == KeyEvent.VK_UP)
        {
            SeizureTwoPlayer.player2.goingUp = false;
        }
        else if (keyCode == KeyEvent.VK_DOWN)
        {
            SeizureTwoPlayer.player2.goingDown = false;
        }
    }

    public void keyTyped(KeyEvent e) 
    {

    }

}
