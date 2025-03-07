package HELLOWORLD;  // Ensure the package name matches your folder structure

import javax.swing.*; // Import Swing components

public class SwingTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // Ensure GUI runs on the Event Dispatch Thread
            JFrame frame = new JFrame("Swing Test");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null); // Center the window
            frame.setVisible(true);
        });
    }
}
