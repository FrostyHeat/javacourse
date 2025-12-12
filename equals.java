class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Проверка ссылки
        if (this == obj) return true;
        
        // 2. Проверка null и типа
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // 3. Приведение типа
        Person other = (Person) obj;
        
        // 4. Сравнение полей
        return age == other.age && 
               (name == null ? other.name == null : name.equals(other.name));
    }
    
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
