class SingletonManager {
    static String browserName;
    static String baseURL;
    static int timeOut;

    private static SingletonManager instance;

    SingletonManager(){
        browserName = "chrome";
        baseURL = "www.exampl.com";
        timeOut = 14;

    }
    static SingletonManager getInstance(){
        if (instance ==null){
            instance = new SingletonManager();
        }
        return instance;
    }


}

public class Singleton{
    public static void main(String[]args){
        SingletonManager obj1 = SingletonManager.getInstance();
        SingletonManager obj2 = SingletonManager.getInstance();
        System.err.println(obj1==obj2);
        System.err.println(obj1.browserName);
        System.err.println(obj2.browserName);
    }
}