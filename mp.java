public class VarargsExample {
    public static void main(String[] args) {
        Printer p = new Printer();
        
        p.print();                    // Нет аргументов
        p.print("A");                 // Один
        p.print("A", "B", "C");       // Несколько
        
        p.print(1);                   // Один int
        p.print(1, 2, 3);             // Несколько int
        
        p.log("Сообщение");           // Без параметров
        p.log("Сумма: %d + %d = %d", 2, 3, 5); // С параметрами
    }
}

class Printer {
    // Varargs для строк
    void print(String... strings) {
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    
    // Перегрузка для чисел
    void print(int... numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    // Varargs с обычным параметром
    void log(String format, Object... args) {
        System.out.printf(format + "%n", args);
    }
