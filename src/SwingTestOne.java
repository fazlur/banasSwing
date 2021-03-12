import java.awt.Dimension; //Allow us to defin height and width of an object
import java.awt.ToolKit; // Allow to ask questions 
import javax.swing.*; // Swing library

public class SwingTestOne extends JFrame{ // makes it a suclass of JFrame

    public static void main(String[] args) {
        new SwingTestOne(); // calling the contructor
        
    }

    public SwingTestOne(){ // defining the constructor

        this.setSize(400, 400); // Setting the frame size
        this.setVisible(true); // makes frame visible
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Making the window close on exit
        
    }
}
