import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandlerNormal implements KeyListener 
{
    public InputHandlerNormal(NormalGame game) 
    {
        game.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) 
    {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_W) 
        {
            NormalGame.player.goingUp = true;
        }
        else if (keyCode == KeyEvent.VK_S) 
        {
            NormalGame.player.goingDown = true;
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
            NormalGame.player.goingUp = false;
        }
        else if (keyCode == KeyEvent.VK_S) 
        {
            NormalGame.player.goingDown = false;
        }
    }

    public void keyTyped(KeyEvent e) 
    {

    }

}
