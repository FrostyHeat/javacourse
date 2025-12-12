public class AccessModifiersDemo {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация спецификаторов доступа ===\n");
        
        // Создаем объект TestClass
        TestClass obj = new TestClass();
        
        // 1. PUBLIC - доступен везде
        System.out.println("1. PUBLIC доступ:");
        obj.publicMethod();
        System.out.println("publicVariable = " + obj.publicVariable);
        System.out.println();
        
        // 2. PRIVATE - доступен только внутри класса
        System.out.println("2. PRIVATE доступ:");
        // obj.privateMethod(); // ОШИБКА: privateMethod() имеет private доступ в TestClass
        // System.out.println(obj.privateVariable); // ОШИБКА: privateVariable имеет private доступ
        obj.accessPrivateMembers(); // Но можем получить доступ через public метод
        System.out.println();
        
        // 3. PROTECTED - доступен в пакете и наследниках
        System.out.println("3. PROTECTED доступ:");
        obj.protectedMethod(); // Доступно в том же пакете
        System.out.println("protectedVariable = " + obj.protectedVariable);
        System.out.println();
        
        // 4. DEFAULT (package-private) - доступен только в пакете
        System.out.println("4. DEFAULT (package-private) доступ:");
        obj.defaultMethod(); // Доступно в том же пакете
        System.out.println("defaultVariable = " + obj.defaultVariable);
        System.out.println();
        
        // Создаем объект наследника
        System.out.println("=== Проверка доступа из подкласса ===");
        SubClass subObj = new SubClass();
        subObj.testInheritanceAccess();
        
        // Создаем объект из другого пакета
        System.out.println("\n=== Проверка доступа из другого пакета ===");
        otherpackage.OtherPackageClass other = new otherpackage.OtherPackageClass();
        other.testCrossPackageAccess();
    }
}

// Класс для демонстрации разных модификаторов доступа
class TestClass {
    // 1. PUBLIC - доступен везде
    public int publicVariable = 10;
    
    // 2. PRIVATE - доступен только внутри этого класса
    private int privateVariable = 20;
    
    // 3. PROTECTED - доступен в пакете и наследникам
    protected int protectedVariable = 30;
    
    // 4. DEFAULT (package-private) - доступен только в пакете
    int defaultVariable = 40;
    
    // PUBLIC методы
    public void publicMethod() {
        System.out.println("Вызван publicMethod()");
    }
    
    // Метод для доступа к private членам
    public void accessPrivateMembers() {
        System.out.println("Доступ к private членам через public метод:");
        System.out.println("  privateVariable = " + privateVariable);
        privateMethod();
    }
    
    // PRIVATE метод
    private void privateMethod() {
        System.out.println("Вызван privateMethod() - только внутри TestClass");
    }
    
    // PROTECTED метод
    protected void protectedMethod() {
        System.out.println("Вызван protectedMethod()");
    }
    
    // DEFAULT метод
    void defaultMethod() {
        System.out.println("Вызван defaultMethod()");
    }
    
    // Вспомогательный метод для демонстрации доступа внутри класса
    public void showAllVariables() {
        System.out.println("Все переменные изнутри класса:");
        System.out.println("  public: " + publicVariable);
        System.out.println("  private: " + privateVariable);
        System.out.println("  protected: " + protectedVariable);
        System.out.println("  default: " + defaultVariable);
    }
}

// Подкласс в том же пакете
class SubClass extends TestClass {
    public void testInheritanceAccess() {
        System.out.println("Доступ из подкласса в том же пакете:");
        
        // PUBLIC - доступно
        System.out.println("  publicVariable = " + publicVariable);
        publicMethod();
        
        // PRIVATE - НЕ доступно
        // System.out.println(privateVariable); // ОШИБКА
        // privateMethod(); // ОШИБКА
        
        // PROTECTED - доступно (наследник)
        System.out.println("  protectedVariable = " + protectedVariable);
        protectedMethod();
        
        // DEFAULT - доступно (тот же пакет)
        System.out.println("  defaultVariable = " + defaultVariable);
        defaultMethod();
    }
}

// Создаем отдельный пакет для демонстрации межпакетного доступа
package otherpackage;

import AccessModifiersDemo.*;

// Класс в другом пакете
public class OtherPackageClass {
    public void testCrossPackageAccess() {
        System.out.println("Доступ из другого пакета:");
        
        // Создаем объект TestClass
        TestClass obj = new TestClass();
        
        // PUBLIC - доступно
        System.out.println("  publicVariable = " + obj.publicVariable);
        obj.publicMethod();
        
        // PRIVATE - НЕ доступно
        // System.out.println(obj.privateVariable); // ОШИБКА
        // obj.privateMethod(); // ОШИБКА
        
        // PROTECTED - НЕ доступно (другой пакет и не наследник)
        // System.out.println(obj.protectedVariable); // ОШИБКА
        // obj.protectedMethod(); // ОШИБКА
        
        // DEFAULT - НЕ доступно (другой пакет)
        // System.out.println(obj.defaultVariable); // ОШИБКА
        // obj.defaultMethod(); // ОШИБКА
    }
}

// Класс-наследник в ДРУГОМ пакете
package otherpackage;

public class OtherPackageSubClass extends TestClass {
    public void testProtectedFromDifferentPackage() {
        System.out.println("Доступ protected из наследника в другом пакете:");
        
        // PUBLIC - доступно
        System.out.println("  publicVariable = " + publicVariable);
        
        // PROTECTED - доступно (наследник, даже в другом пакете)
        System.out.println("  protectedVariable = " + protectedVariable);
        protectedMethod();
        
        // PRIVATE - НЕ доступно
        // System.out.println(privateVariable); // ОШИБКА
        
        // DEFAULT - НЕ доступно (другой пакет)
        // System.out.println(defaultVariable); // ОШИБКА
    }
}
