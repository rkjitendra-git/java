package designpattern;

public class Singleton {
    private Singleton(){
    }

    private static Singleton obj;

    public static Singleton getSigltonObject(){
        if(obj==null){
            synchronized (Singleton.class){
                if(obj==null)
                    obj=new Singleton();
            }
        }
    return obj;
    }
}
