public class SingletonDemo {

    public static void main(String args[]){
        SingletonPattern s1=SingletonPattern.getInstance();
        SingletonPattern s2=SingletonPattern.getInstance();
        s2.disp("Object 2");
        s1.disp("Object 1");
    }
}
