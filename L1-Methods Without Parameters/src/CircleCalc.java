import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        //call the area method
        area();
        //call the circumference method
        circ();

    }

    //write a method to calculate a circle's area
    public static void area(){
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
        double area = Math.pow(radius,2) * Math.PI;

        JOptionPane.showMessageDialog(null,"The area of the circle is: " + round.format(area));
    }


    //write a method to calculate a circle's circumference
    public static void circ(){
        DecimalFormat round = new DecimalFormat("#.##");

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of the circle?"));
        double circ = 2 * (Math.PI * radius);

        JOptionPane.showMessageDialog(null,"The circumference of the circle is: " + round.format(circ));
    }

}
