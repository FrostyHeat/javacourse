// Практика #1
public class BufferBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder (несинхронизированный, быстрее)
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() - добавление в конец
        sb.append(" World");
        System.out.println("append: " + sb);
        
        // 2. insert() - вставка по индексу
        sb.insert(5, ",");
        System.out.println("insert: " + sb);
        
        // 3. delete() - удаление части
        sb.delete(5, 7);
        System.out.println("delete: " + sb);
        
        // 4. reverse() - обратный порядок
        sb.reverse();
        System.out.println("reverse: " + sb);
        
        // 5. replace() - замена части
        sb.replace(0, 5, "12345");
        System.out.println("replace: " + sb);
        
        // 6. capacity() - текущая ёмкость
        System.out.println("capacity: " + sb.capacity());
        
        // 7. ensureCapacity() - гарантированная ёмкость
        sb.ensureCapacity(100);
        
        // 8. setLength() - установка длины
        sb.setLength(3);
        System.out.println("setLength: " + sb);
        
        // 9. charAt() - символ по индексу
        System.out.println("charAt(1): " + sb.charAt(1));
        
        // 10. substring() - часть строки
        System.out.println("substring: " + sb.substring(1));
        
        // StringBuffer (синхронизированный, потокобезопасный)
        StringBuffer sbf = new StringBuffer("Buffer");
        sbf.append(" Test"); // Те же методы
    }
}

// Практика #2
class ConvertDemo {
    public static void main(String[] args) {
        // String → StringBuilder/StringBuffer
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str); // конструктор
        StringBuffer sbf = new StringBuffer(str);  // конструктор
        
        // StringBuilder/StringBuffer → String
        String fromSB = sb.toString();
        String fromSBF = sbf.toString();
        
        // StringBuilder ↔ StringBuffer (через String)
        StringBuilder sb2 = new StringBuilder(sbf.toString());
        StringBuffer sbf2 = new StringBuffer(sb.toString());
        
        // Методом append
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sbf); // StringBuffer → StringBuilder
        
        StringBuffer sbf3 = new StringBuffer();
        sbf3.append(sb); // StringBuilder → StringBuffer
    }
}
