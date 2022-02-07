package t360.j9.methodhandle;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int birth) {
        this.name = name;
        this.age = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
