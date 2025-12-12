// Практика #1
class Parent {
    final void cannotOverride() {
        System.out.println("Это final метод");
    }
}

class Child extends Parent {
    // ОШИБКА: Cannot override the final method
    // void cannotOverride() { 
    //     System.out.println("Попытка переопределения");
    // }
}

// Практика #2
final class FinalClass {
    void method() {
        System.out.println("Метод final класса");
    }
}

// ОШИБКА: Cannot inherit from final class
// class SubClass extends FinalClass { }
