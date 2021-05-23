package enum_test;

public class Student {
    private int age;
    private String name;
    private Gender sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Student(int age, String name, Gender sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(19);
        s.setName("lili");
        s.setSex(Gender.Male);
        System.out.println(s);

        Student s2 = new Student(22, "feifei", Gender.Female);
        System.out.println(s2);
    }
}
