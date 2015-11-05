
import java.awt.*;
import javax.swing.*;

public class TestMessagePanel extends JFrame {
  public TestMessagePanel() {
    MessagePanel messagePanel1 = new MessagePanel("Wecome to Java");
   
    add(messagePanel1);
   
  }

  public static void main(String[] args) {
    TestMessagePanel frame = new TestMessagePanel();
    frame.setSize(300, 200);
    frame.setTitle("TestMessagePanel");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
