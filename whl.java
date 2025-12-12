public class LoopExamples {
    public static void main(String[] args) {
        
        System.out.println("=== ПРАКТИКА #1: Бесконечные циклы ===\n");
        
        // 1. Бесконечный while
        System.out.println("1. Бесконечный while:");
        System.out.println("   while(true) { }");
        System.out.println("   int x = 1;");
        System.out.println("   while(x > 0) { } // x всегда > 0\n");
        
        // 2. Бесконечный do-while
        System.out.println("2. Бесконечный do-while:");
        System.out.println("   do { } while(true);");
        System.out.println("   int y = 5;");
        System.out.println("   do { } while(y == 5); // условие всегда true\n");
        
        // 3. Бесконечный for
        System.out.println("3. Бесконечный for:");
        System.out.println("   for(;;) { }");
        System.out.println("   for(int i = 0; i >= 0; i++) { } // i всегда >= 0");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        System.out.println("=== ПРАКТИКА #2: break и continue ===\n");
        
        // Пример с break и continue
        System.out.println("Поиск первого чётного числа и пропуск чисел, кратных 3:");
        for (int i = 1; i <= 20; i++) {
            
            // continue - пропускаем числа, кратные 3
            if (i % 3 == 0) {
                System.out.println("  Пропускаем " + i + " (кратно 3)");
                continue; // переходим к следующей итерации
            }
            
            // break - находим первое чётное число и выходим
            if (i % 2 == 0) {
                System.out.println("  Найдено первое чётное число: " + i);
                break; // выходим из цикла
            }
            
            System.out.println("  Проверяем " + i);
        }
        
        System.out.println("\nДополнительный пример с меткой для break:");
        
        // break с меткой (выход из вложенных циклов)
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("Внешний цикл, i = " + i);
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("  Прерываем оба цикла при i=" + i + ", j=" + j);
                    break outerLoop; // выходим из обоих циклов
                }
                System.out.println("  Внутренний цикл, j = " + j);
            }
        }
        
        System.out.println("\nПример с do-while:");
        int counter = 0;
        do {
            counter++;
            if (counter == 3) {
                System.out.println("Пропускаем итерацию " + counter);
                continue;
            }
            if (counter == 5) {
                System.out.println("Выходим на итерации " + counter);
                break;
            }
            System.out.println("Итерация: " + counter);
        } while (counter < 10);
    }
}
