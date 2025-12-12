public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("=== ВСЕ варианты вызова метода printVars() ===\n");
        
        // Вариант 1: Через имя класса (рекомендуемый способ)
        System.out.println("1. Через имя класса:");
        A.printVars();
        
        // Вариант 2: Через объект класса
        System.out.println("\n2. Через объект класса:");
        A obj1 = new A();
        obj1.printVars();
        
        // Вариант 3: Через несколько объектов
        System.out.println("\n3. Через разные объекты:");
        A obj2 = new A();
        A obj3 = new A();
        obj2.printVars();
        obj3.printVars();
        
        // Вариант 4: Через null-ссылку (работает!)
        System.out.println("\n4. Через null-ссылку:");
        A nullObj = null;
        nullObj.printVars(); // Не вызывает NullPointerException!
        
        // Вариант 5: Внутри того же класса
        System.out.println("\n5. Изнутри класса A:");
        A.testInternalCall();
        
        // Вариант 6: Из статического метода другого класса
        System.out.println("\n6. Из статического метода другого класса:");
        callFromOtherClass();
        
        // Вариант 7: Из нестатического метода другого класса
        System.out.println("\n7. Из нестатического метода:");
        StaticDemo demo = new StaticDemo();
        demo.callFromInstanceMethod();
        
        // Демонстрация статических полей
        System.out.println("\n=== Демонстрация статических полей ===");
        A.a = 100; // Меняем через класс
        System.out.println("После A.a = 100:");
        
        A obj4 = new A();
        A obj5 = new A();
        
        System.out.println("obj4.a = " + obj4.a);
        System.out.println("obj5.a = " + obj5.a);
        System.out.println("A.a = " + A.a);
        
        obj4.a = 200; // Меняем через объект
        System.out.println("\nПосле obj4.a = 200:");
        System.out.println("obj4.a = " + obj4.a);
        System.out.println("obj5.a = " + obj5.a);
        System.out.println("A.a = " + A.a);
        
        // Статический блок инициализации
        System.out.println("\n=== Статический блок инициализации ===");
        B.test();
    }
    
    public static void callFromOtherClass() {
        A.printVars();
    }
    
    public void callFromInstanceMethod() {
        A.printVars();
    }
}

class A {
    public static int a = 1;
    public static int b;
    
    public static void printVars() {
        System.out.println("a = " + a + ", b = " + b);
    }
    
    public static void testInternalCall() {
        // Вызов из того же класса
        printVars(); // Можно без имени класса
        A.printVars(); // Можно с именем класса
    }
    
    // Нестатический метод
    public void instanceMethod() {
        printVars(); // Можно вызвать статический метод из нестатического
        // nonStaticMethod(); // А так нельзя - нет нестатического метода
    }
}

class B {
    static int x;
    int y;
    
    // Статический блок инициализации
    static {
        x = 42;
        System.out.println("Статический блок выполнен: x = " + x);
    }
    
    public static void test() {
        System.out.println("B.x = " + x);
        // System.out.println(y); // ОШИБКА: нельзя получить доступ к нестатическому полю
    }
}
