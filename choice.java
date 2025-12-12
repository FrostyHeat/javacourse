public class SwitchDemo {
    public static void main(String[] args) {
        // Практика #1: Все типы для switch
        System.out.println("=== Практика #1: Типы для switch ===");
        
        // 1. int
        int intVal = 1;
        switch(intVal) {
            case 1: System.out.println("int: 1"); break;
        }
        
        // 2. byte
        byte byteVal = 2;
        switch(byteVal) {
            case 2: System.out.println("byte: 2"); break;
        }
        
        // 3. short  
        short shortVal = 3;
        switch(shortVal) {
            case 3: System.out.println("short: 3"); break;
        }
        
        // 4. char
        char charVal = 'A';
        switch(charVal) {
            case 'A': System.out.println("char: A"); break;
        }
        
        // 5. String (Java 7+)
        String strVal = "test";
        switch(strVal) {
            case "test": System.out.println("String: test"); break;
        }
        
        // 6. enum
        enum Color {RED, GREEN}
        Color color = Color.RED;
        switch(color) {
            case RED: System.out.println("enum: RED"); break;
        }
        
        // 7. Классы-оболочки (автораспаковка)
        Integer integerVal = 5;
        switch(integerVal) {
            case 5: System.out.println("Integer: 5"); break;
        }
        
        // Практика #2: Отсутствие break
        System.out.println("\n=== Практика #2: Fall-through (нет break) ===");
        
        int value = 2;
        int result = 0;
        
        System.out.println("value = " + value);
        switch(value) {
            case 1:
                result = 1;
                System.out.println("case 1: result = 1");
                break;
            case 2:
                result = 2;
                System.out.println("case 2: result = 2 (НЕТ BREAK!)");
                // Проваливается в case 3!
            case 3:
                result = 3;
                System.out.println("case 3: result = 3");
                break;
            default:
                result = 0;
        }
        
        System.out.println("Итоговый результат: " + result + " (ожидали 2, но получили 3!)");
        
        // Демонстрация для всех случаев
        System.out.println("\nДемонстрация fall-through:");
        for(int test = 1; test <= 4; test++) {
            System.out.print("\nvalue = " + test + ": ");
            switch(test) {
                case 1: System.out.print("One "); // нет break
                case 2: System.out.print("Two "); // нет break  
                case 3: System.out.print("Three "); break;
                default: System.out.print("Other");
            }
        }
    }
}
