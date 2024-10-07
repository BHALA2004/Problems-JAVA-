

import java.util.ArrayList;

class Variables {
    String var;
    int degree;

    public Variables(String var, int degree) {
        this.var = var;
        this.degree = degree;
    }
}

class Coeffcient {
    int value;
    Variables variables;

    public Coeffcient(int value, Variables variables) {
        this.value = value;
        this.variables = variables;
    }
}

public class EquationMain {
    public static void main(String[] args) {
        // First equation: 2x^2 + 4y^2
        Variables var1 = new Variables("x", 1);
        Variables var2 = new Variables("y", 2);
        ArrayList<Coeffcient> coeffList1 = new ArrayList<>();
        coeffList1.add(new Coeffcient(2, var1));
        coeffList1.add(new Coeffcient(4, var2));

        // Second equation: 3x^2 + 5y^2
        Variables var3 = new Variables("x", 2);
        Variables var4 = new Variables("y", 2);
        ArrayList<Coeffcient> coeffList2 = new ArrayList<>();
        coeffList2.add(new Coeffcient(2, var3));
        coeffList2.add(new Coeffcient(4, var4));

        // Perform addition of two equations
        ArrayList<Coeffcient> additionResult = addEquations(coeffList1, coeffList2);
        System.out.println("Addition Result: ");
        printEquation(additionResult);

        // Perform multiplication of two equations
        ArrayList<Coeffcient> multiplicationResult = multiplyEquations(coeffList1, coeffList2);
        System.out.println("Multiplication Result: ");
        printEquation(multiplicationResult);
    }

    // Method to add two quadratic equations
    public static ArrayList<Coeffcient> addEquations(ArrayList<Coeffcient> eq1, ArrayList<Coeffcient> eq2) {
        ArrayList<Coeffcient> result = new ArrayList<>();

        // Loop through the first equation and add its terms
        for (int i = 0; i < eq1.size(); i++) {
            boolean termAdded = false;
            for (int j = 0; j < eq2.size(); j++) {
                // Check if variables and degrees match, add the coefficients if they do
                if (eq1.get(i).variables.var.equals(eq2.get(j).variables.var)
                        && eq1.get(i).variables.degree == eq2.get(j).variables.degree) {
                    int sumValue = eq1.get(i).value + eq2.get(j).value;
                    result.add(new Coeffcient(sumValue, eq1.get(i).variables));
                    termAdded = true;
                    break;
                }
            }
            if (!termAdded) {
                result.add(eq1.get(i));
            }
        }

        // Add the remaining terms from the second equation
        for (int j = 0; j < eq2.size(); j++) {
            boolean exists = false;
            for (int i = 0; i < result.size(); i++) {
                if (eq2.get(j).variables.var.equals(result.get(i).variables.var)
                        && eq2.get(j).variables.degree == result.get(i).variables.degree) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                result.add(eq2.get(j));
            }
        }

        return result;
    }

    // Method to multiply two quadratic equations
    public static ArrayList<Coeffcient> multiplyEquations(ArrayList<Coeffcient> eq1, ArrayList<Coeffcient> eq2) {
        ArrayList<Coeffcient> result = new ArrayList<>();

        for (int i = 0; i < eq1.size(); i++) {
            for (int j = 0; j < eq2.size(); j++) {
                int multipliedValue = eq1.get(i).value * eq2.get(j).value;
                String variable = eq1.get(i).variables.var;
                String variable1 = eq2.get(j).variables.var;
                int newDegree = 1;
                // Check if the variables match, multiply the degrees if they do
                if (variable.equals(variable1)) {
                    newDegree = eq1.get(i).variables.degree + eq2.get(j).variables.degree;
                    Variables newVariable = new Variables(variable, newDegree);
                    result.add(new Coeffcient(multipliedValue, newVariable));
                } else {
                    // If the variables don't match, handle them as separate terms (e.g., xy)
                    Variables newVariable = new Variables(variable + variable1, eq1.get(i).variables.degree + eq2.get(j).variables.degree);
                    result.add(new Coeffcient(multipliedValue, newVariable));
                }
            }
        }

        return result;
    }

    // Method to print the equation in readable format
    public static void printEquation(ArrayList<Coeffcient> coeffList) {
        for (int i = 0; i < coeffList.size(); i++) {
            Coeffcient c = coeffList.get(i);
            System.out.print(c.value + c.variables.var + "^" + c.variables.degree + " ");
            if (i != coeffList.size() - 1) {
                System.out.print("+ ");
            }
        }
        System.out.println();
    }
}
