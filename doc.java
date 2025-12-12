/**
 * Класс для демонстрации комментариев Java
 * @author Student
 */
public class CommentDemo {
    public static void main(String[] args) {
        // Однострочный комментарий
        int a = 10;
        
        /*
          Блочный комментарий
          на нескольких строках
        */
        int b = 20;
        
        int sum = add(a, b); // Комментарий в конце строки
        System.out.println("Сумма: " + sum);
        
        System.out.println("Площадь круга: " + circleArea(5));
    }
    
    /**
     * Складывает два числа
     * @param x первое число
     * @param y второе число
     * @return сумма чисел
     */
    static int add(int x, int y) {
        return x + y;
    }
    
    /**
     * Вычисляет площадь круга
     * @param r радиус
     * @return площадь
     */
    static double circleArea(double r) {
        return 3.14 * r * r;
    }
}
