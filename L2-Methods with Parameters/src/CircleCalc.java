import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        //create and run the program
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));

        area(radius);
        circ(radius);

    }

    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius){
        DecimalFormat round = new DecimalFormat("#.##");

        double area = Math.pow(radius,2) * Math.PI;
        JOptionPane.showMessageDialog(null, "The area of the circle is: " + round.format(area));
    }


    //re-write the method to calculate a circle's perimeter using parameters
    public static void circ(double radius){
        DecimalFormat round = new DecimalFormat("#.##");

        double circ = 2 * (Math.PI * radius);
        JOptionPane.showMessageDialog(null, "The are of the circumference is: " + round.format(circ));
    }

}
