import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
    public static void main(String[] args) {
        JFrame window = new JFrame("Insightful window");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Click for a quote");
        JButton button2 = new JButton("Click for a quote");
        JButton button3 = new JButton("Click for a quote");


        window.setSize(400,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button1.addActionListener(new ButtonListener1());
        button1.addActionListener(new ButtonListener2());
        button1.addActionListener(new ButtonListener3());

        window.add(panel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
    }
    private static class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Everything seems impossible until its done");
        }
    }
    private static class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Everything seems impossible until its done");
        }
    }
    private static class ButtonListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Everything seems impossible until its done");
        }
    }

}
