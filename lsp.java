import java.util.*;

public class LiskovExample {
    public static void processList(List<String> list) {
        // Метод работает с любым List (ArrayList, LinkedList, Vector и т.д.)
        list.add("Hello");
        list.add("World");
        
        for (String item : list) {
            System.out.println(item);
        }
    }
    
    public static void main(String[] args) {
        // Все эти вызовы работают корректно благодаря LSP
        processList(new ArrayList<>());
        processList(new LinkedList<>());
        processList(new Vector<>());
        
        // Даже неизменяемый список можно передать (хотя add() выбросит исключение)
        try {
            processList(List.of("Fixed", "List"));
        } catch (UnsupportedOperationException e) {
            System.out.println("Неизменяемый список не поддерживает добавление элементов");
        }
    }
