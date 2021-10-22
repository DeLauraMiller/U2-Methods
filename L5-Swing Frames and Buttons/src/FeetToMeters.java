import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Feet to Meters window");
        JPanel panel = new JPanel();
        JButton button1 = new JButton(" feet to meters ");
        JButton button2 = new JButton(" meters to feet");

        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button1.addActionListener(new convert1());
        button2.addActionListener(new convert2());

        panel.add(button1);
        panel.add(button2);

        window.add(panel);
        window.setVisible(true);
    }

    private static class convert1 implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            double feetDistance = Double.parseDouble(JOptionPane.showInputDialog(" Input the feet"));

            double convertMeter = feetDistance / 3.28;


            JOptionPane.showMessageDialog(null, "your length in meter is " + convertMeter);


        }
    }

        private static class convert2 implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {

                double meterDistance = Double.parseDouble(JOptionPane.showInputDialog(" Input the meters"));

                double convertFeet = meterDistance * 3.28;

                JOptionPane.showMessageDialog(null, "your length in feet is " + convertFeet);


            }
        }

}
