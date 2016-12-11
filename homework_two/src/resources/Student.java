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
     * Field of study variable
     */
    private String fieldOfStudies;

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
     * @param fieldStudy
     * @param age
     * @param mn
     * @param gender
     */
    public Student(String name, String surname, String fieldStudy, int age, int mn, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mn = mn;
        this.gender = gender;
        this.fieldOfStudies = fieldStudy;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student { " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fieldOfStudies='" + fieldOfStudies + '\'' +
                ", age=" + age +
                ", mn=" + mn +
                ", gender=" + gender +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (mn != student.mn) return false;
        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;
        if (!fieldOfStudies.equals(student.fieldOfStudies)) return false;
        return gender == student.gender;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + fieldOfStudies.hashCode();
        result = 31 * result + mn;
        result = 31 * result + gender.hashCode();
        return result;
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
    public String getFieldOfStudies() {
        return fieldOfStudies;
    }

    /**
     *
     * @param fieldOfStudies
     */
    public void setFieldOfStudies(String fieldOfStudies) {
        this.fieldOfStudies = fieldOfStudies;
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
