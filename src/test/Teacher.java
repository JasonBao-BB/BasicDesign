package test;

public class Teacher {

    public String name;
    private Integer age;
    private String sex;
    private Integer salary;


    public Teacher() {

    }

    public Teacher(String name, Integer age, String sex, Integer salary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }

    public void teach(){
        System.out.println("Teaching....");
    }

    private void prepare() {
        System.out.println("Preparing....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                '}';
    }
}
