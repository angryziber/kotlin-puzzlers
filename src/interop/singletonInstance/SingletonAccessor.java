package interop.singletonInstance;

public class SingletonAccessor {

    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE);
    }

}

// What will it print?
// a) Will not compile
// b) Hello world!
// c) interop.singletonInstance.Singleton@4b67cf4d
// d) Undefined behavior