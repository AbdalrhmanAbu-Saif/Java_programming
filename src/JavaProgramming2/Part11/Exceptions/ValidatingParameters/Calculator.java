package JavaProgramming2.Part11.Exceptions.ValidatingParameters;

public class Calculator {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Parameters must be non-negative");
        }
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subset size cannot exceed set size");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }
}
