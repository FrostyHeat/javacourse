public class MethodsOver {
    public static void main(String[] args) {
        // ПЕРЕГРУЗКА (Overloading) - в одном классе
        MathUtil math = new MathUtil();
        System.out.println("ПЕРЕГРУЗКА:");
        System.out.println("sum(2, 3) = " + math.sum(2, 3));          // int
        System.out.println("sum(2.5, 3.5) = " + math.sum(2.5, 3.5));  // double
        System.out.println("sum(1, 2, 3) = " + math.sum(1, 2, 3));    // три числа
        
        // ПЕРЕОПРЕДЕЛЕНИЕ (Overriding) - в разных классах
        System.out.println("\nПЕРЕОПРЕДЕЛЕНИЕ:");
        Animal animal = new Animal();
        Animal dog = new Dog(); // полиморфизм
        
        animal.sound(); // из Animal
        dog.sound();    // из Dog (переопределено!)
        
        System.out.println("\nСравнение объектов:");
        Student s1 = new Student("Иван", 1);
        Student s2 = new Student("Иван", 1);
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // true (переопределен)
    }
}

// ========== ПЕРЕГРУЗКА (Overloading) ==========
class MathUtil {
    // Разные сигнатуры - перегрузка
    int sum(int a, int b) {
        return a + b;
    }
    
    double sum(double a, double b) {
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    // ОШИБКА: нельзя по возвращаемому значению
    // double sum(int a, int b) { return a + b; }
}

// ========== ПЕРЕОПРЕДЕЛЕНИЕ (Overriding) ==========
class Animal {
    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override // аннотация для проверки
    void sound() {
        System.out.println("Собака лает: Гав!");
    }
}

// Переопределение equals() и hashCode()
class Student {
    String name;
    int id;
    
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return id == other.id && name.equals(other.name);
    }
    
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + id;
    }
}
