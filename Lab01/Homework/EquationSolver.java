// Example 6: EquationSolver.java

package Lab01.Homework;

import javax.swing.JOptionPane;
public class EquationSolver {
    public static void main(String[] args) {
        String[] options = {"First-degree, 1 variable", "First-degree, 2 variables", "Second-degree, 1 variable"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Choose an equation type:",
            "Equation Solver",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (choice == 0) {
            solveLinearEquation();
        } else if (choice == 1) {
            solveLinearSystem();
        } else if (choice == 2) {
            solveQuadraticEquation();
        } else {
            JOptionPane.showMessageDialog(
                null,
                "No option selected. Exiting.",
                "Exit",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

    public static void solveLinearEquation(){
        String strNum1, strNum2;
        String strMessage;

        strNum1 = JOptionPane.showInputDialog(
            null,
            "Linear Equation: Ax = B \n Please input value for A: ",
            "Linear Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );

        strNum2 = JOptionPane.showInputDialog(
            null,
            "Linear Equation: Ax = B \n Please input value for B: ",
            "Linear Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );

        String equation = strNum1 + "x = " + strNum2;
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        if (num1 == 0 && num2 == 0) {
            strMessage = "Equation " + equation + " has infinite solutions";
        } else if (num1 == 0 && num2 != 0) {
            strMessage = "Equation " + equation + " has no solutions";
        } else {
            double solution = num2 / num1;
            strMessage = "Equation " + equation + " has solution: x = " + solution;
        }

        JOptionPane.showMessageDialog(
            null,
            strMessage,
            "Linear Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }


    public static void solveLinearSystem(){
        String 
            strNumA1 = "",
            strNumB1 = "",
            strNumC1 = "",
            strNumA2 = "",
            strNumB2 = "",
            strNumC2 = "";

        String strMessage = "";

        String[] constants = {"A1", "B1", "C1", "A2", "B2", "C2"};
        for (String constant : constants) {
            String input = JOptionPane.showInputDialog(
                null,
                "Linear System: \n A1x + B1y = C1 \n A2x + B2y = C2 \n Please input value for " + constant + ": ",
                "Linear System Solver",
                JOptionPane.INFORMATION_MESSAGE
            );

            switch (constant) {
                case "A1":
                    strNumA1 = input;
                    break;
                case "B1":
                    strNumB1 = input;
                    break;
                case "C1":
                    strNumC1 = input;
                    break;
                case "A2":
                    strNumA2 = input;
                    break;
                case "B2":
                    strNumB2 = input;
                    break;
                case "C2":
                    strNumC2 = input;
                    break;
            }
        }

        double A1 = Double.parseDouble(strNumA1);
        double B1 = Double.parseDouble(strNumB1);
        double C1 = Double.parseDouble(strNumC1);
        double A2 = Double.parseDouble(strNumA2);
        double B2 = Double.parseDouble(strNumB2);
        double C2 = Double.parseDouble(strNumC2);

        double D = A1 * B2 - A2 * B1;
        double D1 = C1 * B2 - C2 * B1;
        double D2 = A1 * C2 - A2 * C1;

        if (D == 0) {
            strMessage = "The system has no unique solution.";
        } else {
            double x = D1 / D;
            double y = D2 / D;
            strMessage = "x = " + x + "\ny = " + y;
        }
        

        JOptionPane.showMessageDialog(
            null,
            strMessage,
            "Linear System Solver",
            JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }

    public static void solveQuadraticEquation(){
        String strNumA, strNumB, strNumC;
        String strMessage;

        strNumA = JOptionPane.showInputDialog(
            null,
            "Quadratic Equation: Ax^2 + Bx + C = 0 \n Please input value for A: ",
            "Quadratic Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );

        strNumB = JOptionPane.showInputDialog(
            null,
            "Quadratic Equation: Ax^2 + Bx + C = 0 \n Please input value for B: ",
            "Quadratic Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );

        strNumC = JOptionPane.showInputDialog(
            null,
            "Quadratic Equation: Ax^2 + Bx + C = 0 \n Please input value for C: ",
            "Quadratic Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );


        String equation = strNumA + "x^2 + " + strNumB + "x + " + strNumC + " = 0";
        double numA = Double.parseDouble(strNumA);
        double numB = Double.parseDouble(strNumB);
        double numC = Double.parseDouble(strNumC);

        if (numA == 0) {
            strMessage = "This is not a quadratic equation. Please use the linear equation solver.";
        } else {
            double discriminant = numB * numB - 4 * numA * numC;
            if (discriminant > 0) {
                double root1 = (-numB + Math.sqrt(discriminant)) / (2 * numA);
                double root2 = (-numB - Math.sqrt(discriminant)) / (2 * numA);
                strMessage = "Equation " + equation + " has two distinct real roots: \n" +
                             "Root 1: " + root1 + "\n" +
                             "Root 2: " + root2;
            } else if (discriminant == 0) {
                double root = -numB / (2 * numA);
                strMessage = "Equation " + equation + " has one real root: \n" +
                             "Root: " + root;
            } else {
                strMessage = "Equation " + equation + " has no real roots.";
            }
        }

        JOptionPane.showMessageDialog(
            null,
            strMessage,
            "Quadratic Equation Solver",
            JOptionPane.INFORMATION_MESSAGE
        );
        System.exit(0);
    }

}
