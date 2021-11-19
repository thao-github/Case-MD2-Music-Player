package HomeWork.Human;

public class Human {
    private int id;
    private String name;
    private int age;
    static int idNumber = 1;

    public Human() {
    }

    public Human(String name, int age) {
        this.id = idNumber++;
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return  "id='" + id +  ',' + '\'' +
                "name='" + name + '\'' +
                ", age=" + age + ',' + '\'';
    }
}

