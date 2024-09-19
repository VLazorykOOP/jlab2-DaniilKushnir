public class Main {
    public static void main(String[] args) {
        // Створення об'єктів Money
        Money money1 = new Money(50, (byte) 75); // 50 грн 75 коп
        Money money2 = new Money(25, (byte) 50); // 25 грн 50 коп

        // Додавання сум
        Money sum = money1.add(money2);
        System.out.println("Сума: " + sum);  // Виведе 76,25

        // Віднімання сум
        Money difference = money1.subtract(money2);
        System.out.println("Різниця: " + difference);  // Виведе 25,25

        // Ділення суми на число
        Money divided = money1.divide(2);
        System.out.println("Ділення на 2: " + divided);  // Виведе 25,37

        // Перевірка рівності
        System.out.println("money1 і money2 рівні? " + money1.equals(money2));  // Виведе false

        // Порівняння двох об'єктів Money
        System.out.println("Порівняння money1 і money2: " + Money.compare(money1, money2));  // Виведе > 0, тому що money1 > money2
    }
}
