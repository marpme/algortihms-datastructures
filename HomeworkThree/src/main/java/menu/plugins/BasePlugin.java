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
public abstract class BasePlugin {

    public final String name;

    public BasePlugin(String name) {
        this.name = name;
    }

    /**
     * Executes the certain plugin
     *
     * @param stack stack which will be used for that.
     */
    public abstract void executePlugin(Stack<Student> stack, Scanner sn) throws Exception;

}
