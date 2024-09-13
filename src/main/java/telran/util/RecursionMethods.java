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
            result = recursiveMultiply(pow(num, degree - 1), num);
        }
        return result;
    }

    private static int recursiveMultiply(int num, int degree) {
        int result = 0;

        if (degree < 0) {
            num = -num;
            degree = -degree;
        }

        if (degree > 0) {
            result = num + recursiveMultiply(num, degree - 1);
        }

        return result;
    }

    // #2
    public static int square(int x) {
        int result = 0;
        if (x < 0) {
            x = -x;
        }
        if (x > 0) {
            result = x + x - 1 + square(x - 1);
        }
        return result;
    }

    // #3
    public static boolean isSubstring(String string, String subString) {
        boolean result = false;
		if (string.length() >= subString.length()) {
			result = isSubstringAtFirstPart(string, subString) ? 
					true : isSubstring(string.substring(1), subString);
		} 

		return result;

	}

	private static boolean isSubstringAtFirstPart(String str, String substr) {
		boolean result = false;
		if (substr.length() == 0) {
			result = true;
		} else if (str.charAt(0) == substr.charAt(0)) {
			result = isSubstringAtFirstPart(str.substring(1), substr.substring(1));
		}
		
		return result;
	}


    public static long pow2(int num, int degree){
        if (degree < 0) {
			throw new IllegalArgumentException();
		}
		int res = 1;
		if (degree > 0) {
            long powIn = pow2(num, degree - 1);
			res = powIn < 0 ? multiply(-num, -powIn) : multiply(num, powIn);
		}
		return res;
    }
    
    private static int multiply(int a, long b) {
        return b == 0 ? 0 : a + multiply(a, b - 1);
    }

}
