package resources;

/**
 * Class description ...
 * Included in resources
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 05. Dec 2016
 */
public class Student {

    private String name;
    private String surname;
    private int mn;
    private int age;
    private int gender;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mn=" + mn +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMn() {
        return mn;
    }

    public void setMn(int mn) {
        this.mn = mn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Student(String name, String surname, int mn, int age, int gender) {

        this.name = name;
        this.surname = surname;
        this.mn = mn;
        this.age = age;
        this.gender = gender;
    }
}
