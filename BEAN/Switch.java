package elect;
import java.awt.*;
import java.io.Serializable;
   
public class Switch extends Canvas implements Serializable {
   
   public Switch() { setSize(80,40); }  // constructor
   
   private boolean closed = false;      // property
   public boolean isClosed() { return closed; }
   public void setClosed(boolean b) { closed = b; }
   
   public void paint(Graphics g) {
      g.drawLine(10, 20, 30, 20);
      g.drawLine(50, 20, 70, 20);
      g.fillOval(30-2, 20-2, 5, 5);
      g.fillOval(50-2, 20-2, 5, 5);
      if (closed)
         g.drawLine(30, 20, 50, 20);
      else
         g.drawLine(30, 20, 47, 10);
   }
   
   // Toggle the switch
   public void toggle() {
      closed = !closed;
      repaint();
   }
}
