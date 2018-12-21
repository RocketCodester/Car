/* 
   11/11/14
   JDK 1.7
   Draw a car
*/
import javax.swing.*;
import java.awt.*;
public class Car extends JComponent{
    JFrame frame = new JFrame("Car");
    Container content = frame.getContentPane();
    public static void main(String[] args) {
        Car drawing = new Car();
        drawing.setUp();
    }
    public void setUp(){
        content.setBackground(new Color(131,168,237));
        content.add(this);
        frame.setSize(475,325);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.RED); //draw a red car
        g.drawLine(7,206,7,141); //car
        g.drawLine(7,141,64,88); //car
        g.drawLine(64,88,181,88); //car
        g.drawLine(181,88,214,7); //car
        g.drawLine(214,7,335,7); //car
        g.drawLine(335,7,364,89); //car
        g.drawLine(364,89,427,89); //top of car
        g.drawLine(427,89,427,159); //car
        g.drawLine(427,159,377,206); //car
        g.drawLine(377,206,7,206); //front
        g.drawOval(60,155,100,100); //front tire
        g.drawOval(300,155,100,100); //back tire       
    }    
}