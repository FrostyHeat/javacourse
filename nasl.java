// Практика #1
class Parent {
    int x = 10;
    
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int x = 20; // Скрывает родительское x
    
    void show() {
        System.out.println("Child");
    }
    
    void demo() {
        // this - текущий объект
        System.out.println(this.x); // 20 (свое поле)
        this.show(); // Child (свой метод)
        
        // super - родительская часть
        System.out.println(super.x); // 10 (родительское поле)
        super.show(); // Parent (родительский метод)
    }
}

// Практика #2
class A {
    int a1;                 // default - доступ в пакете
    public int a2;          // public - доступ везде
    protected int a3;       // protected - доступ в пакете + наследники
    private int a4;         // private - только в A
    
    void method1() {}       // default
    public void method2() {} // public
    protected void method3() {} // protected
    private void method4() {}   // private
}

class B extends A {
    void test() {
        a1 = 1;    // ✓ default - если в том же пакете
        a2 = 2;    // ✓ public - всегда
        a3 = 3;    // ✓ protected - наследник
        // a4 = 4; // ✗ private - не доступно
        
        method1(); // ✓ default (если тот же пакет)
        method2(); // ✓ public
        method3(); // ✓ protected
        // method4(); // ✗ private
    }
}

class C extends B {
    void test() {
        // Всё то же самое (наследование транзитивно)
        a2 = 2;    // ✓ public
        a3 = 3;    // ✓ protected
    }
}
