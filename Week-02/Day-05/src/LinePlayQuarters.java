import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static int WIDTH = 400;
  public static int HEIGHT = 423;
  public static int n=3;
  public static int size = 14;


  public static int glsize=WIDTH/n;
  public static int pitch = glsize/(size);


    public static void mainDraw(Graphics graphics) {

    int glsize=WIDTH/n;
    int pitch = glsize/(size);
      for (int i = 0; i <n; i++) {
        for (int j = 0; j <n; j++) {
          int x=j*glsize;
          int y=i*glsize;
          lineplay(graphics, x, y);
        }
      }
      }

  public static void lineplay(Graphics graphics,int x0,int y0) {
      graphics.setColor(Color.red);
      nets(graphics, 180.0, x0+glsize, y0+0);
      graphics.setColor(Color.green);
      nets(graphics, 0.0,x0,y0+glsize);
  }

  public static void nets(Graphics graphics, double orient, int x0, int y0) {
      for (int i = 0; i != size; i++) {
        int y1=y0-(size-i)*pitch*(int)(Math.cos((orient/180)*Math.PI));
        int x2=x0+pitch * (i)*(int)(Math.cos((orient/180)*Math.PI));
        graphics.drawLine(x0, y1, x2, y0);
      }
   }

    // Don't touch the code below
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
