import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */
    /*
    1. get input
    2. locate FIRST p
    3. find three letters after P
    4. return the combination of p and three after p
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word that contains a 'P' ");

        JOptionPane.showMessageDialog(null, splitP(word) );
    }
    public static String splitP(String word){

       int pIndex = word.indexOf('p');

       return word.substring(pIndex,pIndex + 4);
    }
}


