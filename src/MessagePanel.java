import java.awt.FontMetrics;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Panel;
public class MessagePanel extends JPanel {
  /** The message to be displayed */
	String message = "java is fun";

  /** The x coordinate where the message is displayed */
  private int xCoordinate = 20;

  /** The y coordinate where the message is displayed */
  private int yCoordinate = 20;

  /** Indicate whether the message is displayed in the center */
  private boolean centered;

  /** The interval for moving the message horizontally 
   * and vertically */
  private int interval = 10;

  /** Construct with default properties */
  public MessagePanel() {
  }

  /** Construct a message panel with a specified message */
  public MessagePanel(String message) {
   
  }

  

  

  /** Return xCoordinator */
  public int getXCoordinate() {
    return xCoordinate;
  }

  /** Set a new xCoordinator */
  public void setXCoordinate(int x) {
    this.xCoordinate = x;
    repaint();
  }

  /** Return yCoordinator */
  public int getYCoordinate() {
    return yCoordinate;
  }

  /** Set a new yCoordinator */
  public void setYCoordinate(int y) {
    this.yCoordinate = y;
    repaint();
  }

  /** Return centered */
  public boolean isCentered() {
    return centered;
  }

  /** Set a new centered */
  public void setCentered(boolean centered) {
    this.centered = centered;
    repaint();
  }

  /** Return interval */
  public int getInterval() {
    return interval;
  }

  /** Set a new interval */
  public void setInterval(int interval) {
    this.interval = interval;
    repaint();
  }

  int r = 0;
	String a = "java is fun";
	String b = "java is powerful";
	
			
	
	
  
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (centered) {
      // Get font metrics for the current font
      FontMetrics fm = g.getFontMetrics();

      // Find the center location to display
      int stringWidth = fm.stringWidth(message);
      int stringAscent = fm.getAscent();
      // Get the position of the leftmost character in the baseline
      xCoordinate = getWidth() / 2 - stringWidth / 2;
      yCoordinate = getHeight() / 2 + stringAscent / 2;
    }

    g.drawString(message, xCoordinate, yCoordinate);
    
    
    addMouseListener(new MouseListener(){
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			// TODO Auto-generated method stub
			if(r == 0){
				message = b;
				repaint();
				r++;
			}
			else {
				message = a;
				repaint();
				r--;
			}
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	});
		
    
  }

  /** Move the message left */
  public void moveLeft() {
    xCoordinate -= interval;
    repaint();
  }

  /** Move the message right */
  public void moveRight() {
    xCoordinate += interval;
    repaint();
  }

  /** Move the message up */
  public void moveUp() {
    yCoordinate -= interval;
    repaint();
  }

  /** Move the message down */
  public void moveDown() {
    yCoordinate += interval;
    repaint();
  }

  
  

  
  
  
  
  /** Override get method for preferredSize */
  public Dimension getPreferredSize() {
    return new Dimension(200, 30);
  }
}
