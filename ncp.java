public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.print();                 // Нет аргументов
        t.print("A");              // Один
        t.print("A", "B", "C");    // Три
        t.print(1, 2, 3, 4, 5);    // Пять чисел
    }
}

class Test {
    // Varargs метод
    void print(String... strings) {
        for (String s : strings) System.out.print(s + " ");
        System.out.println();
    }
    
    // Перегрузка для чисел
    void print(int... numbers) {
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
    }
}
