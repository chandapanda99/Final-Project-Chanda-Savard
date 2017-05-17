import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MainMenu extends JFrame 
{
    private static final long serialVersionUID = 1L;

    int screenWidth = 600;
    int screenHeight = 300;

    int buttonWidth = 500;
    int buttonHeight = 30;

    JButton Play, Quit, twoPlayer, Seizure;

    public MainMenu() 
    {

        addButtons();
        addActions();

        getContentPane().setLayout(null);

        Play.setBounds((screenWidth - buttonWidth) / 2, 5, buttonWidth, buttonHeight);
        Seizure.setBounds((screenWidth - buttonWidth) / 2, 100, buttonWidth, buttonHeight);
        Quit.setBounds((screenWidth - buttonWidth) / 2, 200, buttonWidth, buttonHeight);
        twoPlayer.setBounds((screenWidth - buttonWidth) / 2, 50, buttonWidth, buttonHeight);

        getContentPane().add(Play);
        getContentPane().add(Seizure);
        getContentPane().add(Quit);
        getContentPane().add(twoPlayer);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(screenWidth, screenHeight);
        setTitle("Da Pong! Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setResizable(false);
    }

    private void addButtons() {
        Play = new JButton("Play Speed Pong!");
        Seizure = new JButton("Play Epileptic Pong!");
        Quit = new JButton("Click to quit");
        twoPlayer = new JButton("Two Player Mode");
    }

    private void addActions() {

        Play.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) {
                    dispose();

                    NormalGame game = new NormalGame();

                    game.start();

                }
            });
            
        Seizure.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e) {
                    dispose();

                    Game game = new Game();

                    game.start();

                }
            });
            
        twoPlayer.addActionListener(new ActionListener()
            {
                public void actionPerformed (ActionEvent e)
                {
                    dispose();
                    
                    GameTwoPlayer game = new GameTwoPlayer();
                    
                    game.start();
                }
            });

        Quit.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
    }
}