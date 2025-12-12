// Практика #1
public class StringDemo {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        
        // 1. length() - длина строки
        System.out.println("Длина: " + str.length());
        
        // 2. trim() - удаляет пробелы по краям
        System.out.println("trim: '" + str.trim() + "'");
        
        // 3. toUpperCase() / toLowerCase() - регистр
        System.out.println("toUpperCase: " + str.toUpperCase());
        
        // 4. substring() - часть строки
        System.out.println("substring(3,8): " + str.substring(3, 8));
        
        // 5. replace() - замена символов
        System.out.println("replace('o','a'): " + str.replace('o', 'a'));
        
        // 6. split() - разделение на массив
        String[] parts = "a,b,c".split(",");
        System.out.println("split: " + parts.length + " частей");
        
        // 7. indexOf() - поиск подстроки
        System.out.println("indexOf('World'): " + str.indexOf("World"));
        
        // 8. startsWith() / endsWith() - проверка начала/конца
        System.out.println("startsWith('  He'): " + str.startsWith("  He"));
        
        // 9. equals() / equalsIgnoreCase() - сравнение
        System.out.println("equals: " + str.equals("  hello, world!  "));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("  hello, world!  "));
        
        // 10. charAt() - символ по индексу
        System.out.println("charAt(5): " + str.charAt(5));
        
        // 11. format() - форматирование (бонус)
        System.out.println(String.format("Число: %d, Строка: %s", 10, "test"));
    }
}

// Практика #2
import java.util.StringJoiner;

class StringJoinerDemo {
    public static void main(String[] args) {
        // Простой пример
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("Java").add("Python").add("C++");
        System.out.println(sj); // [Java, Python, C++]
        
        // Для коллекций
        StringJoiner sj2 = new StringJoiner(" | ");
        sj2.add("One").add("Two").add("Three");
        System.out.println(sj2); // One | Two | Three
        
        // Пустые значения
        StringJoiner sj3 = new StringJoiner("-", "(", ")");
        sj3.setEmptyValue("пусто");
        System.out.println(sj3); // пусто
        sj3.add("A");
        System.out.println(sj3); // (A)
    }
}

// Практика #3
class TextBlocks {
    public static void main(String[] args) {
        // Тройные кавычки - text blocks (Java 13+)
        String html = """
            <html>
                <body>
                    <p>Hello, World!</p>
                </body>
            </html>
            """;
        
        String json = """
            {
                "name": "John",
                "age": 30
            }
            """;
        
        System.out.println(html);
        System.out.println(json);
    }
}
