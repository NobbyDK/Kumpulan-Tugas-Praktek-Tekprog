// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------

    public static int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Input should be less than or equal to 16.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}    
