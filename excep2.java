public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // 1. Это исключение будет перехвачено
            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Перехватили: " + e.getMessage());
        }
        
        // 2. Это исключение приведет к аварийной остановке
        String str = null;
        str.length(); // NullPointerException - не перехвачено!
        
        System.out.println("Эта строка не выполнится");
    }
}
