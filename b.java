import java.io.*;
import java.nio.file.*;

// Практика #1
class InputStreamDemo {
    void readDemo() throws IOException {
        InputStream is = new FileInputStream("test.txt");
        int data;
        while ((data = is.read()) != -1) { // Читает байт как int
            System.out.print((char) data);
        }
        is.close();
    }
}

// Практика #2
class OutputStreamDemo {
    void writeDemo() throws IOException {
        OutputStream os = new FileOutputStream("output.txt");
        String text = "Hello";
        for (char c : text.toCharArray()) {
            os.write(c); // Пишет младшие 8 бит char
        }
        os.close();
    }
}

// Практика #3
// InputStream/OutputStream - байты (8 бит)
// Reader/Writer - символы (Unicode, 16 бит)
class CharVsByte {
    void demo() throws IOException {
        // Русская буква 'Я' в UTF-8 = 2 байта
        // Reader прочитает как 1 символ
        // InputStream прочитает как 2 байта
    }
}

// Практика #4
// AutoCloseable для try-with-resources
class Resource implements AutoCloseable {
    void use() { System.out.println("Используем"); }
    
    @Override
    public void close() {
        System.out.println("Закрываем автоматически");
    }
}

class Main {
    public static void main(String[] args) {
        try (Resource r = new Resource()) {
            r.use();
        } // close() вызывается сам
    }
}
