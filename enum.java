// Практика #1 - Инициализация элементов enum
enum Status {
    // Элементы с инициализацией
    PENDING(0, "Ожидание"),
    PROCESSING(1, "В обработке"),
    COMPLETED(2, "Завершено"),
    FAILED(-1, "Ошибка");
    
    private final int code;
    private final String description;
    
    // Конструктор (private по умолчанию)
    Status(int code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public int getCode() { return code; }
    public String getDescription() { return description; }
}

// Практика #2 - Enum с дополнительными методами
enum Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { 
            if (y == 0) throw new ArithmeticException();
            return x / y; 
        }
    };
    
    private final String symbol;
    
    Operation(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() { return symbol; }
    
    // Абстрактный метод - каждый элемент должен реализовать
    public abstract double apply(double x, double y);
    
    // Дополнительный метод
    public static Operation fromSymbol(String symbol) {
        for (Operation op : values()) {
            if (op.symbol.equals(symbol)) return op;
        }
        throw new IllegalArgumentException();
    }
}

// Пример использования
public class EnumDemo {
    public static void main(String[] args) {
        // Практика #1
        Status s = Status.PROCESSING;
        System.out.println(s + ": " + s.getCode() + " - " + s.getDescription());
        
        // Практика #2
        Operation op = Operation.PLUS;
        System.out.println("2 " + op.getSymbol() + " 3 = " + op.apply(2, 3));
        
        op = Operation.fromSymbol("*");
        System.out.println("4 * 5 = " + op.apply(4, 5));
    }
}
