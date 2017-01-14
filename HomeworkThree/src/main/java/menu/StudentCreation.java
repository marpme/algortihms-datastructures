package menu;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import resources.Gender;
import resources.Student;

import java.util.Scanner;

/**
 * Class description ...
 * Included in menu
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 14. Jan 2017
 */
public class StudentCreation {

    public static Student createNewStudent(Scanner sn) throws Exception{

        System.out.println("Creating a new Student ...");
        System.out.printf("Student name:");
        String name = sn.next();
        System.out.printf("Student surname:");
        String surname = sn.next();
        System.out.printf("Student field of studies:");
        String field = sn.next();
        System.out.printf("Student age:");
        int age = sn.nextInt();
        System.out.printf("Student mn:");
        int mn = sn.nextInt();
        System.out.println("Gender - 1 female, 2 male, 3 other");
        System.out.printf("Student gender:");
        int gender = sn.nextInt();
        Gender finalGender;

        switch (gender){
            case 1:
                finalGender = Gender.FEMALE;
                break;
            case 2:
                finalGender = Gender.MALE;
                break;
            case 3:
                finalGender = Gender.OTHER;
                break;
            default:
                throw new Exception();
        }

        return new Student(name, surname, field, age, mn, finalGender);
    }

}
