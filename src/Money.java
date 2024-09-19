public class Money {
    private long hryvnia;  
    private byte kopecks; 

    private static final int KOPECKS_IN_HRYVNIA = 100;

    public Money(long hryvnia, byte kopecks) {
        if (kopecks < 0 || kopecks >= KOPECKS_IN_HRYVNIA) {
            throw new IllegalArgumentException("Кількість копійок повинна бути від 0 до 99");
        }
        this.hryvnia = hryvnia;
        this.kopecks = kopecks;
    }

    // Метод додавання 
    public Money add(Money other) {
        long totalKopecks = this.toKopecks() + other.toKopecks();
        return fromKopecks(totalKopecks);
    }

    // Метод віднімання 
    public Money subtract(Money other) {
        long totalKopecks = this.toKopecks() - other.toKopecks();
        return fromKopecks(totalKopecks);
    }

    // Метод ділення 
    public Money divide(long divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ділення на нуль");
        }
        long totalKopecks = this.toKopecks() / divisor;
        return fromKopecks(totalKopecks);
    }

    // Метод перевантаження equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money other = (Money) obj;
        return this.hryvnia == other.hryvnia && this.kopecks == other.kopecks;
    }

    // Метод перевантаження toString для виведення у форматі "грн,коп"
    @Override
    public String toString() {
        return hryvnia + "," + String.format("%02d", kopecks);
    }

    // Статичний метод для порівняння двох об'єктів
    public static int compare(Money a, Money b) {
        return Long.compare(a.toKopecks(), b.toKopecks());
    }

    // Перетворення гривень і копійок у загальну кількість копійок
    private long toKopecks() {
        return this.hryvnia * KOPECKS_IN_HRYVNIA + this.kopecks;
    }

    // Створення об'єкта Money з кількості копійок
    private static Money fromKopecks(long totalKopecks) {
        if (totalKopecks < 0) {
            throw new IllegalArgumentException("Кількість копійок не може бути від'ємною");
        }
    
        long hryvnia = totalKopecks / KOPECKS_IN_HRYVNIA;
        byte kopecks = (byte) (totalKopecks % KOPECKS_IN_HRYVNIA);
    
        return new Money(hryvnia, kopecks);
    }
    
    }
