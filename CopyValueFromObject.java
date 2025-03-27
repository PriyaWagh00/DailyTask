class CopyValueFromObject {
    int id;
    String name;

    CopyValueFromObject(int i, String n) {
        id = i;
        name = n;
    }

    CopyValueFromObject(CopyValueFromObject c) {
        id = c.id;
        name = c.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        CopyValueFromObject c1 = new CopyValueFromObject(1, "Priya");
        CopyValueFromObject c2 = new CopyValueFromObject(c1);
        c1.display();
        c2.display();
    }
}