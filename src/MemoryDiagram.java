class Student {
    String name;
    int age;
}

public class MemoryDiagram {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Ali";
        s.age = 20;

        System.out.println("Stack                      Heap");
        System.out.println();
        System.out.println("+------+                 +----------------------+");
        System.out.println("|  s   |---------------> | Student Object       |");
        System.out.println("+------+                 | name = \"" + s.name + "\"         |");
        System.out.println("                         | age = " + s.age + "             |");
        System.out.println("                         +----------------------+");
    }
}