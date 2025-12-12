// Практика #1
class Outer {
    // 1. Внутренний класс (inner)
    class Inner {
        void show() {
            System.out.println("Inner");
        }
    }
    
    // 2. Статический вложенный класс
    static class StaticNested {
        void show() {
            System.out.println("StaticNested");
        }
    }
    
    // 3. Private внутренний класс
    private class PrivateInner {
        void show() {
            System.out.println("PrivateInner");
        }
    }
    
    // 4. Public внутренний класс
    public class PublicInner {
        void show() {
            System.out.println("PublicInner");
        }
    }
    
    void test() {
        Inner i = new Inner();           // ✓ В том же классе
        StaticNested s = new StaticNested(); // ✓
        PrivateInner p = new PrivateInner(); // ✓
    }
}

// Практика #2
class Outer2 {
    private String privateField = "private";
    protected String protectedField = "protected";
    public String publicField = "public";
    
    class Inner {
        void access() {
            // Внутренний класс имеет доступ ко ВСЕМ полям внешнего
            System.out.println(privateField);
            System.out.println(protectedField);
            System.out.println(publicField);
            // Даже к private!
        }
    }
}

// Практика #3
class Outer3 {
    void accessInner() {
        Inner inner = new Inner();
        
        // Внешний класс имеет доступ ТОЛЬКО к public полям внутреннего
        // System.out.println(inner.privateField); // ✗ private
        // System.out.println(inner.defaultField); // ✗ default
        // System.out.println(inner.protectedField); // ✗ protected
        System.out.println(inner.publicField); // ✓ public
        
        // Но можно через методы
        inner.publicMethod(); // ✓
    }
    
    class Inner {
        private String privateField = "private";
        String defaultField = "default";
        protected String protectedField = "protected";
        public String publicField = "public";
        
        private void privateMethod() {}
        void defaultMethod() {}
        protected void protectedMethod() {}
        public void publicMethod() {}
    }
}
