package sample;

/**
 * Created by Karol on 2017-03-20.
 */
public class Context {
    private final static Context instance = new Context();
    public static Context getInstance() {
        return instance;
    }

    private Controller tabRough;
    public void setTabRough(Controller tabRough) {
        this.tabRough=tabRough;
    }

    public Controller getTabRough() {
        return tabRough;
    }
}