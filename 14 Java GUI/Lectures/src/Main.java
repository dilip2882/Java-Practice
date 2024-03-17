import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent from resized
        frame.setSize(420,420); // sets the x-dimension and y-dimension of frame
        frame.setVisible(true); // make frame visible
    }
}