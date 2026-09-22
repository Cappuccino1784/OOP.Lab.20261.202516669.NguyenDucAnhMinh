// Example 5: SimpleCalculator.java

package Lab01.Homework;

import javax.swing.JOptionPane;
public class SimpleCalculator {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(
            null,
            "Please input the first number: ",
            "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(
            null,
            "Please input the second number: ",
            "Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        String resultMessage = strNotification + "\n\n" +
                "Sum: " + sum + "\n" +
                "Difference: " + difference + "\n" +
                "Product: " + product + "\n" +
                "Quotient: " + quotient;

        JOptionPane.showMessageDialog(
            null,
            resultMessage,
            "Simple Calculator Results",
            JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);



    }
    
}
