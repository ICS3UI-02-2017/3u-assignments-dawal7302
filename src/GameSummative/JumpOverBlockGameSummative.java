package GameSummative;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author leendawamneh
 */
public class JumpOverBlockGameSummative extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "Jump Over Block";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    Color lightBlue = new Color (168, 236, 255);
    
    //create the rectangle and ball
    Rectangle blockOne = new Rectangle(30, 560, 100, 30);
    Rectangle ball = new Rectangle(360, 540, 50, 50);
    

    //control variables
    int blockMove = 30;
    boolean movingBlock = true;
    boolean jumping = false;
    boolean onGround = true;
    int gravity = 1;
    int deltaY = -20;
    int ySpeed = 0;
    int scoreOne = 0;
    
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public JumpOverBlockGameSummative(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        
        //make background blue
        g.setColor(lightBlue);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        //add a sun and some clouds
        g.setColor(Color.YELLOW);
        g.fillOval(30, 30, 80, 80);
        g.setColor(Color.WHITE);
        g.fillOval(130, 110, 50, 50);
        g.fillOval(160, 110, 50, 50);
        g.fillOval(190, 110, 50, 50);
        g.fillOval(410, 180, 50, 50);
        g.fillOval(440, 180, 50, 50);
        g.fillOval(470, 180, 50, 50);
        g.fillOval(600, 90, 40, 40);
        g.fillOval(630, 90, 40, 40);
        g.fillOval(660, 90, 40, 40);
        
        //create the ball that will jump
        g.setColor(Color.RED);
        g.fillOval(ball.x, ball.y, ball.width, ball.height);
        
        //create the block 
        g.setColor(Color.BLACK);
        g.fillRect(blockMove, blockOne.y, blockOne.width, blockOne.height);
        
        
            
        
        
        
        
		
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
     {
     makeBallJump();
     moveBlock();
     checkForCollision();
     addPoints();
    }
    }
    private void makeBallJump() {
      ySpeed = ySpeed + gravity;
        
        if (jumping && onGround){
          ySpeed = -20;
          onGround = false;
      }
      ball.y = ball.y + ySpeed; 
        
      if(ball.y > 540){
          ball.y = 540;
          onGround = true;
          ySpeed = 0;
      }
    }
             
    
    private void moveBlock() {
        //move the block across screen
        if(movingBlock){
            blockMove = blockMove +4;
        //when the block leaves the screen
        if(blockMove > WIDTH){ 
            blockMove = -100;  
        }
        
        
    }
    }

    private void checkForCollision() {
        //does the ball hit the block
        if(blockMove >= 360 && blockMove <= 460){
            
            //player, b, player
            ball.y = blockOne.y -ball.height;
        }
                    
        
           
         }

    private void addPoints() {
        if (ball.x > 0){
            
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            //make ball jump when space bar is pressed
            if (keyCode == KeyEvent.VK_SPACE){
                jumping = true;
        }else if (keyCode == KeyEvent.VK_SPACE){
            onGround = false;
       
        }
            
            
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE){
                jumping = false;
        }else if (keyCode == KeyEvent.VK_SPACE){
            onGround = true;
        }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        JumpOverBlockGameSummative game = new JumpOverBlockGameSummative();
    }
}

