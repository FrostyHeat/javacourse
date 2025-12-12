public class Main {
    public static void main(String[] args) {
        new A(100);
        System.out.println("\n--- Второй объект ---");
        new A(200);
    }
}

class A {
    {
        System.out.println("logic (1) id= " + this.id); // id ещё 0
    }

    static {
        System.out.println("static logic"); // Выполняется 1 раз при загрузке класса
    }

    private int id = 1; // Инициализация поля

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id); // id уже 1
    }
}
