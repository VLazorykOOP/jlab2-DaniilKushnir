public class MathOperations {

    // Метод для знаходження найбільшого спільного дільника (НД)
    public static int gcd(int a, int b) {
        a = Math.abs(a); 
        b = Math.abs(b); 
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Метод для знаходження найменшого кратного (НК)
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b); 
    }
}
