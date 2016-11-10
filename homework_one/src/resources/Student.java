package resources;

/**
 *
 */
public class Student {

    /**
     * Variable for the student name
     */
    private String name;

    /**
     * Variable for the student surname
     */
    private String surname;

    /**
     * Variable for the student age
     */
    private int age;

    /**
     * Variable for the Matrikel number
     */
    private int mn;

    /**
     *  Variable for the gender
     */
    private Gender gender;

    /**
     *
     * @param name
     * @param surname
     * @param age
     * @param mn
     * @param gender
     */
    public Student(String name, String surname, int age, int mn, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mn = mn;
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", mn=" + mn +
                ", gender=" + gender +
                '}';
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getSurname() {
        return surname;
    }

    /**
     *
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public int getMn() {
        return mn;
    }

    /**
     *
     * @param mn
     */
    public void setMn(int mn) {
        this.mn = mn;
    }

    /**
     *
     * @return
     */
    public Gender getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
