// Практика #1
// Throwable
// ├── Error (не обрабатываем): OutOfMemoryError, StackOverflowError
// └── Exception
//     ├── RuntimeException (unchecked)
//     │   ├── NullPointerException
//     │   ├── IllegalArgumentException
//     │   └── ArithmeticException
//     └── IOException (checked)

// Практика #2
public class ExceptionDemo {
    public static void main(String[] args) {
        // 1. ArithmeticException - деление на 0
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e.getMessage());
        }
        
        // 2. ArrayIndexOutOfBoundsException - выход за границы массива
        try {
            int[] arr = {1, 2, 3};
            int y = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный индекс: " + e.getMessage());
        }
        
        // 3. IllegalArgumentException - неверный аргумент
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный возраст: " + e.getMessage());
        }
        
        // 4. ClassCastException - неверное приведение типа
        try {
            Object obj = "строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Ошибка приведения: " + e.getMessage());
        }
        
        // 5. NullPointerException - обращение к null
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Null указатель: " + e.getMessage());
        }
    }
    
    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
