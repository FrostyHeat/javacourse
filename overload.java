public class OverloadingDemo {
    public static void main(String[] args) {
        A a = new A();
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        
        System.out.println("=== Цикл for (1) ===");
        // Компилятор видит тип Number для всех элементов массива
        for (Number n : num) {
            a.printNum(n); // ВСЕГДА вызовется printNum(Number n)
        }
        
        System.out.println("\n=== Прямые вызовы (2) ===");
        // Компилятор знает точные типы аргументов
        a.printNum(new Integer(1));  // printNum(Integer i)
        a.printNum(11);              // printNum(int i) 
        a.printNum(1.11f);           // printNum(Float f)
        a.printNum(11.11);           // printNum(Number n) - Double наследует Number
    }
}

class A {
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }
    
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }
    
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }
    
    public void printNum(Number n) {
        System.out.println("Number = " + n);
    }
}
