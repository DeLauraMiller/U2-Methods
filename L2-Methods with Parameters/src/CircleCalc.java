import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        //create and run the program
        double radius = getInput("What is the radius?");
        double area = area(radius);
        circ(radius);

    }
    public static double getInput(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    //re-write the method to calculate a circle's area using parameters
    public static double area(double radius){

        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }


    //re-write the method to calculate a circle's perimeter using parameters
    public static double circ(double radius){

        double circ = 2 * (Math.PI * radius);
        return circ;
    }
    public static String displayResult(double area, double circ){
        DecimalFormat round= new DecimalFormat("#.00");

        String message = "The area is : " + round.format(area);
        message +="\nThe circumference is: " + round.format(circ);
        return message;
    }

}
