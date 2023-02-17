import javax.swing.*;


public class MainApp {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setTitle("BrickBreaker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        frame.setResizable(false);
        frame.setBounds(300,70,700,600);
        frame.setVisible(true);

        GamePlay gamePlay = new GamePlay();
        frame.add(gamePlay);

    }
}
