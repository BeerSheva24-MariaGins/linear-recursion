package telran.util;

public class RecursionMethods {

    public static long factorial(int n) {
        if (n < 0) {
            n = -n;
        }
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    // #1
    public static int pow(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }

        int result = 1;

        if (degree > 0) {
            result = recursivePow(pow(num, degree - 1), num);
        }
        return result;
    }

    private static int recursivePow(int num, int degree) {
        int result = 0;

        if (degree < 0) {
            num = -num;
            degree = -degree;
        }

        if (degree > 0) {
            result = num + recursivePow(num, degree - 1);
        }

        return result;
    }

}
