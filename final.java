public class FinalInit {
    // Способ 1: сразу при объявлении
    public final int a1 = 10;
    
    // Способ 2: в конструкторе
    public final int a2;
    public FinalInit(int value) {
        a2 = value;
    }
    
    // Способ 3: в блоке инициализации
    public final int a3;
    {
        a3 = 20;
    }
}

// Static final (константа класса) - отдельный случай
class Constants {
    public static final double PI = 3.14;           // сразу
    public static final int MAX;
    static {
        MAX = 100;                                  // static блок
    }
}

// Что НЕЛЬЗЯ:
class BadExample {
    public final int x; // ОШИБКА: не инициализировано
    
    // Конструктор без инициализации x
    public BadExample() {
        // x не инициализируется - ошибка компиляции
    }
}
