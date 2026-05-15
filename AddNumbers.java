public class AddNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Sum = " + (a + b));
    }
}

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c)
            System.out.println(a);
        else if (b >= a && b >= c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29;
        boolean prime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println(rev);
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}


public class Armstrong {
    public static void main(String[] args) {
        int num = 153, temp = num, sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345, count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println(count);
    }
}

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Add = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Mul = " + (a * b));
        System.out.println("Div = " + (a / b));
    }
}