public class SingletonPattern {

    private static int counter=0;
    private static SingletonPattern instance=null;

    //Lazy Instantiation

    public static SingletonPattern getInstance(){
        if (instance==null)
            instance= new SingletonPattern();
        return instance;
    }

    private SingletonPattern(){
        counter++;
        System.out.println("Counter: "+counter);
    }

    public void disp(String str){
        System.out.println(str);
    }
}
