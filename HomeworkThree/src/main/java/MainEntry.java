import menu.MenuManager;
import menu.MenuPlugins;
import menu.plugins.*;

/**
 * Class description ...
 * Included in PACKAGE_NAME
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 13. Jan 2017
 */
public class MainEntry {

    public static void main(String[] args) {
        BasePlugin[] mps = {
                new PushMenu("push new item") ,
                new PopMenu("pop top item (remove)"),
                new PeekMenu("Peek top item (view)"),
                new PrintStackMenu("print entire stack"),
                new ExitMenu("Exit"),
        };
        MenuPlugins mp = new MenuPlugins(mps);
        MenuManager mm = new MenuManager(mp);
        mm.initialze();
    }
}
