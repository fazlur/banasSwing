import java.awt.Dimension; // Holds width and height
import java.awt.Toolkit; // Allows to ask questions from the system
import javax.swing.*;

public class SwingTestOne extends JFrame { // makes it a subclass of JFrame

    public static void main(String[] args) {
        new SwingTestOne(); // calling the constructor

    }

    public SwingTestOne() { // defining the constructor

        this.setSize(400, 400); // Setting the frame size
        this.setTitle("My Frame Title");

        JPanel thePanel = new JPanel(); // creating the panel

        JLabel label1 = new JLabel("I am the label"); // creating the label

        label1.setText("I am the new label text"); // Changing the label text

        label1.setToolTipText("Mouse over text"); // Adding mouse over text on the label

        thePanel.add(label1); // Adding the label to the panel

        JButton button1 = new JButton("OK"); // Creating a button;button text can be changed with button1.setText("new
                                             // text")

        button1.setToolTipText("Mouse over with setToolTipText");

        button1.setLocation(0, 0);

        thePanel.add(button1); // Adding the button to the panel which in turn will be added to the frame

        JTextField textField1 = new JTextField("Text Field", 15); // creating the text field and adding it's size(15),
                                                                  // the text field size and text can be changed sith
                                                                  // set methods setColumns & setText

        thePanel.add(textField1); // Adding text field to the panel

        JTextArea textArea1 = new JTextArea(15, 20); // creating a text area and defining it's size (this is not in
                                                     // pixels, but letter sizes)

        textArea1.setText("Adding text to the TextArea");
        textArea1.setLineWrap(true); // Enabling line wraping
        a\


        thePanel.add(textArea1);

        this.add(thePanel); // Adding the panel to the frame

        // this.setLocationRelativeTo(null); // positions window in the middle of the
        // screen

        Toolkit tk = Toolkit.getDefaultToolkit(); // gets default toolkit, which cannot be initialized because is an
                                                  // abstract class

        Dimension dim = tk.getScreenSize(); // gets screen size from Toolkit

        int xPos = (dim.width / 2) - (this.getWidth() / 2); // getting the xPosition finding the screen width and
                                                            // dividing it by 2, and doing the same with this frame
        int yPos = (dim.height / 2) - (this.getHeight() / 2);

        this.setLocation(xPos, yPos); // Setting the position of the frame created

        this.setResizable(false); // Making the window not resizable, the default is true

        this.setVisible(true); // makes frame visible
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Making the window close on exit

    }
}
