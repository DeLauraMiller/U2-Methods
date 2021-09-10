import javax.swing.*;
import java.text.DecimalFormat;

public class LemonadeStand {

    public static double price16 = 0.50;
    public static double price20 = 0.99;
    public static double tax = 7.5;

    /*
        You run a very successful Lemonade Stand.

        You sell 16 oz. cups of lemonade for $0.50 and
        20 oz. cups of lemonade for $0.99.

        You also have to report your income to the IRS,
        so you include a 7.5% sales tax on all purchases.

        Create a program which will ask the number of 16oz and 20oz cups of lemonade and display the total cost with tax.

        Your program should include at least ONE method with two parameters.

     */

    public static void main(String[] args) {
        int lilOz = Integer.parseInt(JOptionPane.showInputDialog("How many 16 oz cups of lemonade would you like?"));
        int bigOz = Integer.parseInt(JOptionPane.showInputDialog("How many 20 oz cups of lemonade would you like?"));
        
        tsjrtxfdn(lilOz, bigOz);
    }

    public static void  tsjrtxfdn(int lilOz, int bigOz){
        DecimalFormat round = new DecimalFormat("#.##");

        double subTotal = (lilOz * price16) + (bigOz * price20);
        double cost = subTotal * (1 + tax/100.0);


        String message = "You purchased\n";
        message += lilOz + ", 16 oz. lemonade(s) and\n";
        message += bigOz + ", 20 oz. lemonade(s)\n";
        message += "Your total is: $" + round.format(subTotal);

        JOptionPane.showMessageDialog(null,message);
        //dont hound me for that dumb name for the "total" (tsjrtxfdn) you typed in something random so I decided to keep that name for the title:)

        //JOptionPane.showMessageDialog(null, "You purchased " + lilOz + ", 16 oz. lemonade(s) and " + bigOz + ", 20 oz. lemonades" + "\n" +  "Your total is: $" + total);
    }


}
