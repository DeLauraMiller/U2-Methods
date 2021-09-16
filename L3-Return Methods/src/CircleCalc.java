import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        DecimalFormat round = new DecimalFormat("#.##");
        //1.
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
        //2.
        double area = area(radius);
        //3.
        double circ = circ(radius);
        //4.
        JOptionPane.showMessageDialog(null,displayResult(area,circ));
    }


    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

        return Math.pow(radius,2) * Math.PI;
    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
        public static double circ(double radius) {

            return 2 * (Math.PI * radius);
        }
        
    public static String displayResult(double area, double circ){
        DecimalFormat round= new DecimalFormat("#.00");

        String message = "The area is : " + round.format(area);
        message +="\nThe circumference is: " + round.format(circ);
        return message;
    }
}
