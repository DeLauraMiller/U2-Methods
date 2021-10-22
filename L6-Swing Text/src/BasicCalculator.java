import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JTextField inputField1, inputField2;
    static JLabel answerLabel;

    public static void main(String[] args) {


        JFrame window = new JFrame("Simple calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("enter a number: ");
        JLabel inputLabel2 = new JLabel(" Enter a number: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        JButton addButton = new JButton("add");
        JButton subtractButton = new JButton("subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("divide");

        answerLabel = new JLabel(" 0.00 ");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        //addButton.addActionListener(new AdditionListener());

        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);
        panel.add(answerLabel);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        window.add(panel);
        window.setVisible(true);
    }
}
