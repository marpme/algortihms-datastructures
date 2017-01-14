package menu.plugins;

import resources.Student;
import stack.Stack;

import java.util.Scanner;

/**
 * Class description ...
 * Included in menu.plugins
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 14. Jan 2017
 */
public class PrintStackMenu extends BasePlugin {

    public PrintStackMenu(String MENU_NAME) {
        super(MENU_NAME);
    }

    /**
     * Executes the certain plugin
     *
     * @param stack stack which will be used for that.
     * @param sn
     */
    public void executePlugin(Stack<Student> stack, Scanner sn) throws Exception {
        System.out.println(stack);
    }
}
