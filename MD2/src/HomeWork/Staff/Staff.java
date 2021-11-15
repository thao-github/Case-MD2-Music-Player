package HomeWork.Staff;

public class Staff {
    private String name;
    private int age;
    private String gender;
    private  int id = 1;
    private static int idNumber = 1;

    public Staff(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = idNumber++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "id= " + id + ", " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
