package pack2;

public class Student {

    public String name;
    public String address;
    public String course;

    public Student(String name, String address, String course, int semester, String id) {
        this.name = name;
        this.address = address;
        this.course = course;
        this.semester = semester;
        this.id = id;
    }

    public int semester;
    public String id;
}
