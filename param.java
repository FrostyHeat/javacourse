import java.util.*;

public class GenShort {
    public static void main(String[] args) {
        // Практика #1: instanceof с дженериками
        Box<Integer> intBox = new Box<>(10);
        

        System.out.println(intBox instanceof Box); // true
        // Проверка содержимого:
        if (intBox.get() instanceof Integer) {
            System.out.println("Содержит Integer");
        }
        
        // Практика #2: extends и super
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Number> nums = new ArrayList<>();
        
        // <? extends Number> - МОЖНО ЧИТАТЬ
        double sum = sumNumbers(ints);
        
        // <? super Integer> - МОЖНО ПИСАТЬ
        addNumbers(nums);
    }
    
    // <? extends Number> - producer (источник)
    static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) { // Читаем как Number
            sum += n.doubleValue();
        }
        return sum;
        // list.add(10); // НЕЛЬЗЯ писать!
    }
    
    // <? super Integer> - consumer (приемник)
    static void addNumbers(List<? super Integer> list) {
        list.add(1); // Можно писать Integer
        list.add(2);
        // Integer i = list.get(0); // НЕЛЬЗЯ читать как Integer
        Object obj = list.get(0); // Только как Object
    }
}

class Box<T> {
    private T value;
    public Box(T v) { value = v; }
    public T get() { return value; }
}
