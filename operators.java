public class OperatorsDemo {
    public static void main(String[] args) {
        // Практика #1: Основные операторы
        
        // Базовые типы
        int a = 10, b = 3;
        
        // Арифметические
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // ++ и --
        int x = 5;
        System.out.println("++x = " + (++x) + ", x = " + x);
        x = 5;
        System.out.println("x++ = " + (x++) + ", x = " + x);
        
        // Битовые
        System.out.println("~5 = " + (~5));
        System.out.println("5 & 3 = " + (5 & 3));
        System.out.println("5 | 3 = " + (5 | 3));
        System.out.println("5 ^ 3 = " + (5 ^ 3));
        
        // Сдвиги
        System.out.println("8 << 1 = " + (8 << 1));
        System.out.println("8 >> 1 = " + (8 >> 1));
        
        // Сравнение
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        
        // Логические
        boolean t = true, f = false;
        System.out.println("!t = " + (!t));
        System.out.println("t && f = " + (t && f));
        System.out.println("t || f = " + (t || f));
        
        // Строки
        String s1 = "Hello";
        String s2 = "World";
        System.out.println("s1 + s2 = " + (s1 + s2));
        s1 += " Java";
        System.out.println("s1 += ' Java' = " + s1);
        
        // Тернарный
        System.out.println("a > b ? 'да' : 'нет' = " + (a > b ? "да" : "нет"));
        
        // Присваивание
        int n = 10;
        n += 5; System.out.println("n += 5: " + n);
        n -= 3; System.out.println("n -= 3: " + n);
        n *= 2; System.out.println("n *= 2: " + n);
        n /= 4; System.out.println("n /= 4: " + n);
        
        // Обертки
        Integer i1 = 100, i2 = 200;
        System.out.println("i1 + i2 = " + (i1 + i2));
        System.out.println("i1 == i2: " + (i1 == i2));
        
        // Практика #2: instanceof
        Object obj = "строка";
        System.out.println("\nobj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
        
        // null
        Object nullObj = null;
        System.out.println("nullObj instanceof String: " + (nullObj instanceof String));
        System.out.println("null instanceof Object: " + (null instanceof Object));
        
        // Наследование
        class Animal {}
        class Dog extends Animal {}
        
        Animal animal = new Dog();
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
    }
}
