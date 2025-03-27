class ConstructorOverload {
    int id;
    String name;
    int age;

    ConstructorOverload(int id, String name) {
        this.id = id;
        this.name = name;
    }

    ConstructorOverload(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    ConstructorOverload(int age) {
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        ConstructorOverload c1 = new ConstructorOverload(28);
        ConstructorOverload c2 = new ConstructorOverload(1, "Priya", 21);
        ConstructorOverload c3 = new ConstructorOverload(2, "Sayali");
        c1.display();
        c2.display();
        c3.display();

    }
}