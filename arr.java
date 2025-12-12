import java.util.Arrays;
import java.util.Comparator;

public class ArraysPractice {
    public static void main(String[] args) {
        System.out.println("=== Практика #1: Присваивание массивов ===");
        
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        
        System.out.println("До присваивания:");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        
        a1 = a2; // Теперь a1 и a2 ссылаются на ОДИН массив
        
        System.out.println("\nПосле присваивания a1 = a2:");
        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));
        
        a2[0] = 999; // Меняем через a2
        
        System.out.println("\nПосле изменения a2[0] = 999:");
        System.out.println("a1: " + Arrays.toString(a1)); // a1 тоже изменился!
        System.out.println("a2: " + Arrays.toString(a2));
        
        System.out.println("\nОбъяснение: a1 и a2 теперь ссылаются на один объект массива в памяти");
        
        System.out.println("\n=== Практика #2: Методы класса java.util.Arrays ===");
        
        // 1. toString(...)
        System.out.println("\n1. Arrays.toString(...):");
        int[] arr1 = {5, 3, 8, 1, 9};
        System.out.println("Массив: " + Arrays.toString(arr1));
        
        // 2. binarySearch(...) - массив должен быть отсортирован!
        System.out.println("\n2. Arrays.binarySearch(...):");
        int[] sortedArr = {1, 3, 5, 7, 9, 11};
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArr));
        int index = Arrays.binarySearch(sortedArr, 7);
        System.out.println("Индекс элемента 7: " + index);
        index = Arrays.binarySearch(sortedArr, 4);
        System.out.println("Индекс элемента 4: " + index + " (отрицательный - элемент не найден)");
        
        // 3. equals(...)
        System.out.println("\n3. Arrays.equals(...):");
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4};
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr2.equals(arr3) -> " + arr2.equals(arr3)); // false - сравнение ссылок
        System.out.println("Arrays.equals(arr2, arr3) -> " + Arrays.equals(arr2, arr3)); // true
        System.out.println("Arrays.equals(arr2, arr4) -> " + Arrays.equals(arr2, arr4)); // false
        
        // 4. compare(...) - Java 9+
        System.out.println("\n4. Arrays.compare(...):");
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {1, 2, 4};
        int[] arr7 = {1, 2, 3, 4};
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr6: " + Arrays.toString(arr6));
        System.out.println("arr7: " + Arrays.toString(arr7));
        System.out.println("Arrays.compare(arr5, arr6) -> " + Arrays.compare(arr5, arr6)); // -1 (arr5 < arr6)
        System.out.println("Arrays.compare(arr6, arr5) -> " + Arrays.compare(arr6, arr5)); // 1 (arr6 > arr5)
        System.out.println("Arrays.compare(arr5, arr5) -> " + Arrays.compare(arr5, arr5)); // 0 (равны)
        System.out.println("Arrays.compare(arr5, arr7) -> " + Arrays.compare(arr5, arr7)); // -1 (короче)
        
        // 5. sort(...)
        System.out.println("\n5. Arrays.sort(...):");
        int[] arrToSort = {5, 2, 9, 1, 7, 3};
        System.out.println("До сортировки: " + Arrays.toString(arrToSort));
        Arrays.sort(arrToSort);
        System.out.println("После сортировки: " + Arrays.toString(arrToSort));
        
        // sort с Comparator (для объектов)
        System.out.println("\n6. Arrays.sort(...) с Comparator:");
        String[] names = {"Иван", "Анна", "Петр", "Мария", "Алексей"};
        System.out.println("До сортировки: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("После сортировки по алфавиту: " + Arrays.toString(names));
        
        // Обратная сортировка
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println("После обратной сортировки: " + Arrays.toString(names));
        
        // Сортировка части массива
        System.out.println("\n7. Сортировка части массива:");
        int[] partialSort = {5, 8, 2, 9, 1, 3, 7};
        System.out.println("Исходный: " + Arrays.toString(partialSort));
        Arrays.sort(partialSort, 2, 5); // сортировка элементов с индекса 2 до 5 (не включая)
        System.out.println("После сортировки элементов [2,5): " + Arrays.toString(partialSort));
        
        // Многомерные массивы
        System.out.println("\n=== Бонус: Многомерные массивы ===");
        int[][] multiArray = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        System.out.println("Многомерный массив:");
        for (int i = 0; i < multiArray.length; i++) {
            System.out.println("  multiArray[" + i + "] = " + Arrays.toString(multiArray[i]));
        }
        System.out.println("multiArray[2][1] = " + multiArray[2][1]); // 5
        
        // deepToString для многомерных массивов
        System.out.println("Arrays.deepToString(multiArray): " + Arrays.deepToString(multiArray));
    }
}
