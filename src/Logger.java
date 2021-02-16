import java.util.Date;

public class Logger {
    private static Logger instance = null;

    protected int num = 1;
    private static Logger logger;

    private Logger(){
    }

    public static Logger getInstance(){
        if (instance == null) instance = new Logger();
        return  instance;
    }

    public void log(String msg) {
        Date date = new Date();
        System.out.println("["+ date.toString() + " " + num++ + "] " + msg);
    }
}
