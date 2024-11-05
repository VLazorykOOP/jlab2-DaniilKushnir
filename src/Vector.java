public class Vector {
    private double x;
    private double y;
    private double z;

    // Конструктор з параметрами
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Конструктор з масиву
    public Vector(double[] components) {
        if (components.length != 3) {
            throw new IllegalArgumentException("Масив повинен містити три компоненти.");
        }
        this.x = components[0];
        this.y = components[1];
        this.z = components[2];
    }

    // Метод для знаходження модуля вектора
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Метод для нормалізації вектора
    public Vector normalize() {
        double mag = magnitude();
        if (mag == 0) {
            throw new ArithmeticException("Неможливо нормалізувати нульовий вектор.");
        }
        return new Vector(x / mag, y / mag, z / mag);
    }

    // Метод для множення вектора на число
    public Vector multiplyByScalar(double scalar) {
        return new Vector(x * scalar, y * scalar, z * scalar);
    }

    // Метод для додавання двох векторів
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    // Метод для скалярного множення (дот продукт)
    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // Метод для векторного множення (крос продукт)
    public Vector crossProduct(Vector other) {
        double newX = this.y * other.z - this.z * other.y;
        double newY = this.z * other.x - this.x * other.z;
        double newZ = this.x * other.y - this.y * other.x;
        return new Vector(newX, newY, newZ);
    }

    // Перевантаження методу equals для порівняння векторів
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vector other = (Vector) obj;
        return Double.compare(other.x, x) == 0 &&
               Double.compare(other.y, y) == 0 &&
               Double.compare(other.z, z) == 0;
    }

    // Перевантаження методу toString для виведення координат
    @Override
    public String toString() {
        return String.format("Vector3D(x=%.2f, y=%.2f, z=%.2f)", x, y, z);
    }
}
