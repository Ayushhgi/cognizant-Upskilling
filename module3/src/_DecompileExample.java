// Q38 - Decompile a Class File
// Step 1: Compile this file -> javac DecompileExample.java
// Step 2: Open DecompileExample.class in JD-GUI or run:
//         java -jar cfr.jar DecompileExample.class

public class _DecompileExample {

    private String name;
    private int age;

    _DecompileExample(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        _DecompileExample obj = new _DecompileExample("Alice", 25);
        obj.display();
    }
}
