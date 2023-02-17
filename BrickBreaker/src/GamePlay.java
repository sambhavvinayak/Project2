import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePlay extends JPanel implements ActionListener , KeyListener{


   private boolean play = false;
   private int totalBricks = 21;
   private Timer timer ;
   private int delay = 0;
   private int ballposX =120;
   private int ballposY =350;
   private int ballXdir = -1;
   private int ballYdir = -2; 
    private int playerX = 350;

    public GamePlay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);

        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g){

        //blackcnavas

        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592); //this is used to fill the box by this we can easily fill it

        //border
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,692,3);
        g.fillRect(0,3,3,592);
        g.fillRect(692,3,3,592);
       
        //paddle

        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550 ,100,8);

        //ball
        g.setColor(Color.RED);
        g.fillOval(ballposX,ballposY ,20 ,20);



    }

    private void moveLeft(){
        play = true;
        playerX -=20;
    }
    private void moveRight(){
        play = true;
        playerX +=20;
    }
    

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_A){
            totalBricks = 0;
            
        }
        
        
        if(e.getKeyCode() == KeyEvent.VK_LEFT){

            if (playerX<=0) {
                playerX = 0;
            }
            else {
                
            moveLeft();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
           
           
            if (playerX >=600) {
                playerX = 600;
            }else{
            moveRight();
            }
        }
        repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }                                           // we are not using this becouse of i dont know !!

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(play){

            if (ballposX<=0) {
                ballXdir = -ballXdir;

            }
            if (ballposX>=670) {
                ballXdir = -ballXdir;

            }
            if (ballposY>=670) {
                ballYdir = -ballYdir;

            }
            
            if (ballposY<=0) {
                ballYdir = -ballYdir;
            }

            ballposX += ballXdir;
            ballposY += ballYdir;
        }

        repaint();
        
    }

}
