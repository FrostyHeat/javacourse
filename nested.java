// Вложение класса в интерфейс
interface MyInterface {
    class NestedClass {
        void show() {
            System.out.println("Класс внутри интерфейса");
        }
    }
    
    void interfaceMethod();
}

// Способ вызова
public class Main {
    public static void main(String[] args) {
        // Создание объекта вложенного класса
        MyInterface.NestedClass obj = new MyInterface.NestedClass();
        obj.show();
        
        // Или напрямую
        new MyInterface.NestedClass().show();
    }
}
