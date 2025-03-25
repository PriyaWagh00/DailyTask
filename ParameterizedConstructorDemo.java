import java.io.*;

class ParameterizedConstructorDemo {
    String name;
    int id;

    ParameterizedConstructorDemo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String args[]) {
        ParameterizedConstructorDemo a = new ParameterizedConstructorDemo("Priya", 1);
        System.out.println("Name=" + a.name + " and id=" + a.id);
    }

}