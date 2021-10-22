import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    JFrame window = new JFrame();
    JPanel panel = new JPanel();
    JButton buttonRoyal = new JButton("Theme: Royal");
    JButton buttonCreme = new JButton("Theme: Creme");
    JButton buttonVanilla = new JButton("Theme: Vanilla");

    //Declare your frame, panel and three buttons.

    public ColorSwitchGUI(){
        //create your GUI

        window = new JFrame("Color Switcher");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340,125);
        window.setLocationRelativeTo(null);

        //Add Action Listeners to buttons
        buttonRoyal.addActionListener( new Royal());
        buttonCreme.addActionListener( new Creme());
        buttonVanilla.addActionListener( new Vanilla());

        panel.add(buttonRoyal);
        panel.add(buttonCreme);
        panel.add(buttonVanilla);

        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class Royal implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = new Color(217, 140, 0);
            Color buttonBack = new Color(15, 0, 255);
            Color buttonText = new Color(255, 164, 0);

            panel.setBackground(buttonBack);
            buttonRoyal.setForeground(panelBack);
            buttonRoyal.setBackground(buttonText);
            buttonCreme.setForeground(panelBack);
            buttonCreme.setBackground(buttonText);
            buttonVanilla.setForeground(panelBack);
            buttonVanilla.setBackground(buttonText);
        }
    }

    private class Creme implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = new Color(255, 130, 67);
            Color buttonBack = new Color(253, 166, 93);
            Color buttonText = new Color(255, 208, 127);

            panel.setBackground(buttonBack);
            buttonRoyal.setForeground(panelBack);
            buttonRoyal.setBackground(buttonText);
            buttonCreme.setForeground(panelBack);
            buttonCreme.setBackground(buttonText);
            buttonVanilla.setForeground(panelBack);
            buttonVanilla.setBackground(buttonText);
        }
    }
    private class Vanilla implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent){
            Color panelBack = new Color(245, 198, 165);
            Color buttonBack = new Color (255, 119, 119);
            Color buttonText = new Color (162, 65, 107);

            panel.setBackground(buttonBack);
            buttonRoyal.setForeground(panelBack);
            buttonRoyal.setBackground(buttonText);
            buttonCreme.setForeground(panelBack);
            buttonCreme.setBackground(buttonText);
            buttonVanilla.setForeground(panelBack);
            buttonVanilla.setBackground(buttonText);
        }
    }
}
