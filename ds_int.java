// Практика #1
interface MyInterface {
    // Неабстрактный метод (default)
    default void defaultMethod() {
        System.out.println("Default method");
    }
    
    // Статический метод
    static void staticMethod() {
        System.out.println("Static method");
    }
}

class MyClass implements MyInterface {
    // Не нужно реализовывать default метод
}

class Main1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        // Вызов default метода через объект
        obj.defaultMethod();
        
        // Вызов static метода через интерфейс
        MyInterface.staticMethod();
        
        // Или через реализацию
        MyInterface inter = new MyClass();
        inter.defaultMethod();
    }
}

// Практика #2
interface InterfaceA {
    default void sameMethod() {
        System.out.println("From InterfaceA");
    }
}

interface InterfaceB {
    default void sameMethod() {
        System.out.println("From InterfaceB");
    }
}

class ConflictClass implements InterfaceA, InterfaceB {
    // ОШИБКА: нужно явно переопределить
    @Override
    public void sameMethod() {
        // Можно выбрать один
        InterfaceA.super.sameMethod(); // Вызов метода из InterfaceA
        // Или написать свою реализацию
    }
}
