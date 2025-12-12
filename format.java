import java.util.*;

// Практика #1
public class FormatterDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        
        // 1. %s - строки
        fmt.format("Строка: %s%n", "Hello");
        
        // 2. %d - целые числа
        fmt.format("Число: %d%n", 42);
        
        // 3. %f - дробные числа
        fmt.format("Дробь: %.2f%n", 3.14159);
        
        // 4. %b - логические значения
        fmt.format("Булево: %b%n", true);
        
        // 5. %c - символы
        fmt.format("Символ: %c%n", 'A');
        
        System.out.print(fmt);
        fmt.close();
        
        // С printf
        System.out.printf("%% = процентный знак%%n");
        System.out.printf("Хэш: %h%n", "test");
    }
}

// Практика #2
class FlushDemo {
    public static void main(String[] args) {
        // flush() сбрасывает буфер в поток вывода
        System.out.print("Сообщение без flush - ");
        // Может не сразу появиться в консоли
        
        System.out.flush(); // Принудительно выводим буфер
        
        System.out.print("Сообщение после flush");
        
        // Важно для файлов и сетей
        // try (PrintWriter pw = new PrintWriter("file.txt")) {
        //     pw.write("данные");
        //     pw.flush(); // Иначе данные могут остаться в буфере
        // }
    }
}

// Практика #3
class DateTimeFormat {
    public static void main(String[] args) {
        Date now = new Date();
        
        // 1. %tY - год 4 цифры
        System.out.printf("Год: %tY%n", now);
        
        // 2. %tm - месяц 2 цифры
        System.out.printf("Месяц: %tm%n", now);
        
        // 3. %td - день месяца
        System.out.printf("День: %td%n", now);
        
        // 4. %tH:%tM - время
        System.out.printf("Время: %tH:%tM%n", now, now);
        
        // 5. %tA - день недели
        System.out.printf("День недели: %tA%n", now);
        
        // Полная дата
        System.out.printf("Дата: %td.%tm.%tY %tH:%tM%n", 
                         now, now, now, now, now);
    }
}
