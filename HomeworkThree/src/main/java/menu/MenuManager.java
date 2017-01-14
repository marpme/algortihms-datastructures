package menu;

import resources.Student;
import stack.Stack;

import java.util.Scanner;

/**
 * Class description ...
 * Included in menu
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 14. Jan 2017
 */
public class MenuManager {

    private MenuPlugins mps;
    private Stack<Student> stackStudent;

    public MenuManager(MenuPlugins mps) {
        this.mps = mps;
        this.stackStudent = new Stack<Student>();
    }

    public void initialze(){
        Scanner scanner = new Scanner(System.in);
        MainMenu(scanner);
    }

    public void MainMenu(Scanner scanner){
        do {
            System.out.println();
            System.out.println("Please choose one of the following algorithms.");
            for (int i = 0; i < mps.getPlugins().length; i++) {
                System.out.printf("%d -> %s%n", i+1, mps.getPlugins()[i].name);

            }
            System.out.println();
            System.out.println("Put in your choice:");

            int choice = 0;

            try {
                if (scanner.hasNext()) {
                    choice = scanner.nextInt();
                }
                mps.getPlugins()[choice - 1].executePlugin(stackStudent, scanner);

            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Oh ... there was a weird input.");
                System.out.println("Returning to the main menu.");
                System.out.println();
            }

        }while(true);
    }
}
