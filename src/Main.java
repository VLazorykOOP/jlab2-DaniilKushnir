public class Main {
    public static void main(String[] args) {
        // Створення об'єктів Money
        Money money1 = new Money(50, (byte) 75); // 50 грн 75 коп
        Money money2 = new Money(25, (byte) 50); // 25 грн 50 коп

        // Додавання сум
        Money sum = money1.add(money2);
        System.out.println("Сума: " + sum);  

        // Віднімання сум
        Money difference = money1.subtract(money2);
        System.out.println("Різниця: " + difference);  

        // Ділення суми на число
        Money divided = money1.divide(2);
        System.out.println("Ділення на 2: " + divided);  

        // Перевірка рівності
        System.out.println("money1 і money2 рівні? " + money1.equals(money2));  

        // Порівняння двох об'єктів Money
        System.out.println("Порівняння money1 і money2: " + Money.compare(money1, money2));  


    //task 2
    Vector v1 = new Vector(1, 2, 3);
    Vector v2 = new Vector(4, 5, 6);

    // Виведення векторів
    System.out.println("Vector v1: " + v1);
    System.out.println("Vector v2: " + v2);

    // Додавання векторів
    Vector v3 = v1.add(v2);
    System.out.println("v1 + v2: " + v3);

    // Множення вектора на скаляр
    Vector v4 = v1.multiplyByScalar(3);
    System.out.println("v1 * 3: " + v4);

    // Скалярне множення
    double dotProduct = v1.dotProduct(v2);
    System.out.println("v1 . v2: " + dotProduct);

    // Векторне множення
    Vector v5 = v1.crossProduct(v2);
    System.out.println("v1 x v2: " + v5);

    // Модуль вектора
    double magnitude = v1.magnitude();
    System.out.println("Модуль v1: " + magnitude);
}
}