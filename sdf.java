public class TernaryOperatorPractice {
    public static void main(String[] args) {
        // Исходный код с if-else
        int a = 2;
        int i = 0;
        
        if (a == 1) {
            i = 1;
        } else if (a == 2) {
            i = 2;
        } else {
            i = 3;
        }
        System.out.println("С if-else: i = " + i);
        
        // Решение через тернарный оператор ? :
        // Вариант 1: Вложенные тернарные операторы
        int i1 = (a == 1) ? 1 : ((a == 2) ? 2 : 3);
        System.out.println("С тернарным оператором (вариант 1): i1 = " + i1);
        
        // Вариант 2: Более читаемый вариант с промежуточными переменными
        int i2 = (a == 1) ? 1 : 
                 (a == 2) ? 2 : 3;
        System.out.println("С тернарным оператором (вариант 2): i2 = " + i2);
        
        // Демонстрация для разных значений a
        System.out.println("\nТестирование для разных значений a:");
        
        for (int testValue = 0; testValue <= 4; testValue++) {
            int result = (testValue == 1) ? 1 : 
                        (testValue == 2) ? 2 : 3;
            System.out.println("a = " + testValue + " -> i = " + result);
        }
        
        // Альтернативный компактный вариант
        System.out.println("\nАльтернативный вариант:");
        a = 1;
        int i3 = a == 1 ? 1 : a == 2 ? 2 : 3;
        System.out.println("При a = " + a + ": i3 = " + i3);
    }
}
