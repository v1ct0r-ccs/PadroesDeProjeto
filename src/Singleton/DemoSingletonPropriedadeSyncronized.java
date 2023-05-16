package Singleton;

public class DemoSingletonPropriedadeSyncronized {

    public static void main (String args[]) {
        Thread t1 = new Thread(new ThreadFoo());
        Thread t2 = new Thread(new ThreadBar());
        t1.start();
        t2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedade = SingletonPropriedadeSyncronized.getInstance("Teste foo");
            System.out.println(singletonPropriedade.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropriedadeSyncronized singleton = SingletonPropriedadeSyncronized.getInstance("Teste bar");
            System.out.println(singleton.getValue());
        }
    }
}
