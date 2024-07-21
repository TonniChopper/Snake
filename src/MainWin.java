import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainWin extends JFrame {
    private final JButton restartButton;
    private GamePole gamePole = new GamePole();
    public MainWin() {
        setTitle("Zmejka");
        setSize(645, 695);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gamePole);
        restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MainWin();
            }
        });
        add(restartButton, "South");
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWin mw = new MainWin();
    }
}
