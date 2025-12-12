// Практика #1
class GrandParent {
    int value = 10;
    
    void show() {
        System.out.println("GrandParent");
    }
}

class Parent extends GrandParent {
    int value = 20;
    
    Parent() {
        super(); // 1. Вызов конструктора родителя
    }
    
    void show() {
        System.out.println("Parent");
    }
    
    void demo() {
        System.out.println(super.value); // 2. Доступ к полю родителя
        super.show(); // 3. Вызов метода родителя
    }
}

// Практика #2
class A {
    int a = 1;
    void method() {
        System.out.println("A.method()");
    }
}

class B extends A {
    // Пусто - наследует a и method() от A
}

class C extends B {
    void method() {
        int a = super.a; // Обращается к A.a (через B)
        super.method(); // Вызывает A.method() (через B)
    }
}

// Практика #3
class A {
    int a, b, c, z;
    
    public A() {
        this(0, 0, 0); // Вызов конструктора с 3 параметрами
    }
    
    public A(int a) {
        this(a, 0, 0);
    }
    
    public A(int a, int b) {
        this(a, b, 0);
    }
    
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }
}
