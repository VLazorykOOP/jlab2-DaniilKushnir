public class MathOperations {

    // Метод для знаходження найбільшого спільного дільника (НД)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Метод для знаходження найменшого кратного (НК)
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
