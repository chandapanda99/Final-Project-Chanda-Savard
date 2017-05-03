import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MainMenu extends JFrame {
    private static final long serialVersionUID = 1L;

    int screenWidth = 600;
    int screenHeight = 300;

    int buttonWidth = 500;
    int buttonHeight = 30;

    JButton Play, Quit;
    JCheckBox twoPlayer;

    public MainMenu() {

        addButtons();
        addActions();

        getContentPane().setLayout(null);

        Play.setBounds((screenWidth - buttonWidth) / 2, 5, buttonWidth, buttonHeight);
        Quit.setBounds((screenWidth - buttonWidth) / 2, 50, buttonWidth, buttonHeight);

        getContentPane().add(Play);
        getContentPane().add(Quit);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(screenWidth, screenHeight);
        setTitle("Speed Pong! Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.BLACK);
        setResizable(false);
    }

    private void addButtons() {
        Play = new JButton("Play Speed Pong!");
        Quit = new JButton("Don't Play Speed Pong! if you are prone to seizures. Click to quit");
    }

    private void addActions() {

        Play.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                dispose();

                Game game = new Game();

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