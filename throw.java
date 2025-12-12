// Собственный класс исключения
class MyException extends Exception {
    private int errorCode;
    
    public MyException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    public int getErrorCode() {
        return errorCode;
    }
}

// Использование
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            process(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage() + " Код: " + e.getErrorCode());
        }
    }
    
    static void process(int value) throws MyException {
        if (value < 0) {
            throw new MyException("Отрицательное значение", 1001);
        }
        System.out.println("Значение: " + value);
    }
}
