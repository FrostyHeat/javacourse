// ПРАКТИКА #1: decode()
System.out.println("=== Практика #1: decode() ===");
System.out.println("Integer.decode(\"42\") = " + Integer.decode("42"));      // 42 (десятичное)
System.out.println("Integer.decode(\"0x2A\") = " + Integer.decode("0x2A"));  // 42 (шестнадцатеричное)
System.out.println("Integer.decode(\"052\") = " + Integer.decode("052"));    // 42 (восьмеричное)
System.out.println("Integer.decode(\"#2A\") = " + Integer.decode("#2A"));    // 42 (шестнадцатеричное)

// ПРАКТИКА #2: Boolean
System.out.println("\n=== Практика #2: Boolean ===");
Boolean b1 = Boolean.valueOf(true);      // Рекомендуется
Boolean b2 = Boolean.valueOf("true");    // Рекомендуется
boolean b3 = Boolean.parseBoolean("true"); // Возвращает примитив
Boolean b4 = true;                       // Автоупаковка
Boolean b5 = Boolean.TRUE;               // Константа
System.out.println("Boolean.valueOf(true) = " + b1);
System.out.println("Boolean.valueOf(\"true\") = " + b2);

// ПРАКТИКА #3: NPE
System.out.println("\n=== Практика #3: NullPointerException ===");
Integer obj = null;
try {
    int value = obj;  // NPE здесь! Попытка распаковать null
    System.out.println("Это не выполнится");
} catch (NullPointerException e) {
    System.out.println("Пойман NPE: нельзя распаковать null Integer в int");
}

// ПРАКТИКА #4: Сравнение Integer
System.out.println("\n=== Практика #4: Сравнение Integer ===");

// Случай с 128 (вне кэша)
int i1 = 128;
Integer a1 = i1;
Integer b1i = i1;
System.out.println("Для 128 (вне кэша -128..127):");
System.out.println("a1 == i1: " + (a1 == i1) + "    // true (автораспаковка)");
System.out.println("b1 == i1: " + (b1i == i1) + "    // true (автораспаковка)");
System.out.println("a1 == b1: " + (a1 == b1i) + "   // false (разные объекты вне кэша)");

// Случай с 127 (в кэше)
int i2 = 127;
Integer a2 = i2;
Integer b2i = i2;
System.out.println("\nДля 127 (в кэше -128..127):");
System.out.println("a2 == i2: " + (a2 == i2) + "    // true (автораспаковка)");
System.out.println("b2 == i2: " + (b2i == i2) + "    // true (автораспаковка)");
System.out.println("a2 == b2: " + (a2 == b2i) + "    // true (один объект из кэша!)");

System.out.println("\nВсе equals() возвращают true - сравнивают значения, а не ссылки");
System.out.println("IntegerCache кэширует значения от -128 до 127 для оптимизации");
System.out.println("ВЫВОД: Всегда используйте equals() для сравнения объектов-оболочек!");
