package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
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
public class DrawingAssignment extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My face";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    Color lightGreen = new Color(187, 249, 188);
    Color greenshade = new Color(147, 242, 149);
    Color darkergreen = new Color(66, 132, 68);
    
    int blackEyeOneHeight = 50;
    int blackEyeTwoHeight = 50;
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public DrawingAssignment(){
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
        g.setColor(lightGreen);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        
        //make eyes
        g.setColor(Color.BLACK);
        g.drawOval(150, 85, 80, 80);
        g.drawOval(300, 85, 80, 80);
        g.setColor(Color.GREEN);
        g.fillOval(150, 85, 80, 80);
        g.fillOval(300, 85, 80, 80);
        g.setColor(Color.WHITE);
        g.fillOval(160, 95, 60, 60);
        g.fillOval(310, 95, 60, 60);
        
        
        g.setColor(Color.BLACK);
        g.fillOval(170, 90, 50, blackEyeOneHeight);
        g.fillOval(320, 90, 50, blackEyeTwoHeight);
        
        if(blackEyeOneHeight <=50) {
            blackEyeOneHeight = blackEyeOneHeight -2;
            blackEyeOneHeight = blackEyeOneHeight +1;
            
        }
        if (blackEyeTwoHeight <=50) {
            blackEyeTwoHeight = blackEyeTwoHeight -2;
            blackEyeTwoHeight = blackEyeTwoHeight +1;
            
        }
        
        
        //make body of frog
        g.setColor(Color.BLACK);
        g.drawOval(160, 300, 220, 220);
        g.setColor(Color.GREEN);
        g.fillOval(160, 300, 220, 220);
        g.setColor(Color.BLACK);
        g.drawOval(195, 340, 150, 150);
        g.setColor(greenshade);
        g.fillOval(195, 340, 150, 150);
        
        //make a face
        g.setColor(Color.BLACK);
        g.drawOval(120, 150, 300, 200);
        g.setColor(Color.GREEN);
        g.fillOval(120, 150, 300, 200);
        
        //make legs for frog
        g.setColor(Color.BLACK);
        g.drawOval(30, 490, 250, 80);
        g.drawOval(280, 490, 250, 80);
        g.setColor(Color.GREEN);
        g.fillOval(30, 490, 250, 80);
        g.fillOval(280, 490, 250, 80);
        
        //make a nose for frog
        g.setColor(Color.BLACK);
        g.drawOval(240, 220, 20, 30);
        g.drawOval(280, 220, 20, 30);
        g.setColor(darkergreen);
        g.fillOval(240, 220, 20, 30);
        g.fillOval(280, 220, 20, 30);
      
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

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

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
        DrawingAssignment game = new DrawingAssignment();
    }
}

