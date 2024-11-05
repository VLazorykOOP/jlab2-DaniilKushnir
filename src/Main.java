import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){;
        // Створення об'єктів Money
        Money money1 = new Money(50, (byte) 75); // 50 грн 75 коп
        Money money2 = new Money(25, (byte) 50); // 25 грн 50 коп

        // Додавання сум
        Money sum = money1.add(money2);
        System.out.println("Сума: " + sum);  

        // Віднімання сум
        Money difference = money1.subtract(money2);
        System.out.println("Різниця: " + difference);  

        
        Money divided = money1.divide(2);
        System.out.println("Ділення на 2: " + divided);  

     
        System.out.println("money1 і money2 рівні? " + money1.equals(money2));  

        System.out.println("Порівняння money1 і money2: " + Money.compare(money1, money2));  


    //task 2
    Vector v1 = new Vector(1, 2, 3);
    Vector v2 = new Vector(4, 5, 6);


    System.out.println("Vector v1: " + v1);
    System.out.println("Vector v2: " + v2);

    Vector v3 = v1.add(v2);
    System.out.println("v1 + v2: " + v3);


    Vector v4 = v1.multiplyByScalar(3);
    System.out.println("v1 * 3: " + v4);


    double dotProduct = v1.dotProduct(v2);
    System.out.println("v1 . v2: " + dotProduct);

    
    Vector v5 = v1.crossProduct(v2);
    System.out.println("v1 x v2: " + v5);

 
    double magnitude = v1.magnitude();
    System.out.println("Модуль v1: " + magnitude);


    //task 3

  
     System.out.print("Enter the first number: ");
     int num1 = in.nextInt();

     
     System.out.print("Enter the second number: ");
     int num2 = in.nextInt();

     if (num1 <= 0 || num2 <= 0) {
         System.out.println("Both numbers must be positive integers.");
         return;
     }

    
     int gcd = MathOperations.gcd(num1, num2);
     int lcm = MathOperations.lcm(num1, num2);

     System.out.println("Greatest Common Divisor (GCD): " + gcd);
     System.out.println("Least Common Multiple (LCM): " + lcm);
    }
 }
}

