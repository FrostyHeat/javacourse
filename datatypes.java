public class DataTypesPractice {
    public static void main(String[] args) {
        // Практика #1
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0L;
        float f = 0.0f;
        double d = 0.0;
        char c = '\u0000';
        boolean bool = false;
        
        // Практика #2
        System.out.println("\u0410\u043B\u0435\u043A\u0441\u0435\u0439");
        
        // Практика #3 - закомментирован, т.к. вызывает ошибку компиляции
        // int a = 1;
        // {
        //     int b2 = 2;
        // }
        // int c2 = a + b2; // Ошибка: b2 не видна вне блока
        
        // Практика #4
        String s1 = "Hello";
        String s2 = "World";
        int num = 42;
        double d2 = 3.14;
        boolean flag = true;
        String result = s1 + " " + s2 + " " + num + " " + d2 + " " + flag;
        System.out.println(result);
        
        // Практика #5
        int i2 = 10;
        double d3 = 3.5;
        double result1 = i2 + d3;
        System.out.println("int + double = " + result1 + " (тип: double)");
        
        byte b2 = 5;
        short s3 = 10;
        int result2 = b2 + s3;
        System.out.println("byte + short = " + result2 + " (тип: int)");
        
        float f2 = 2.5f;
        long l2 = 100L;
        float result3 = f2 + l2;
        System.out.println("float + long = " + result3 + " (тип: float)");
        
        // Практика #6
        int i3 = 100;
        byte b3 = (byte) i3;
        System.out.println("(byte)100 = " + b3);
        
        double d4 = 123.456;
        int i4 = (int) d4;
        System.out.println("(int)123.456 = " + i4);
        
        // Практика #7
        int a = 120;
        // byte b4 = a + 10; // Ошибка компиляции
        byte c2 = (byte)(a + 10);
        // byte d5 = a + 1; // Ошибка компиляции
        
        System.out.println("(byte)(120 + 10) = " + c2);
        
        // Практика #8
        var name = "Алексей";
        var age = 25;
        var height = 1.75;
        System.out.println("Type inference: " + name + ", " + age + " лет, рост " + height);
    }
}
