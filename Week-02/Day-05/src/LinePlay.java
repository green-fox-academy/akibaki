import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics) {
      // Draw the canvas' diagonals.
      // If it starts from the upper-left corner it should be green, otherwise it should be red.
      graphics.setColor(Color.red);
      nets(graphics, 180.0, 300, 0);
      graphics.setColor(Color.green);
      nets(graphics, 0.0,0,300);
      }



    public static void nets(Graphics graphics, double orient, int x0, int y0) {
      int pitch = 20;
      int size = 14;






      for (int i = 0; i != size; i++) {
        int y1=y0-(size-i)*pitch*(int)(Math.cos((orient/180)*Math.PI));
        int x2=x0+pitch * (i)*(int)(Math.cos((orient/180)*Math.PI));
        graphics.drawLine(x0, y1, x2, y0);
      }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
      JFrame jFrame = new JFrame("Drawing");
      jFrame.setSize(new Dimension(WIDTH, HEIGHT));
      jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jFrame.add(new ImagePanel());
      jFrame.setLocationRelativeTo(null);
      jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
      @Override
      protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        mainDraw(graphics);
      }
    }
  }
