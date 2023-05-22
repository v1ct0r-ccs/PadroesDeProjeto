package Observer;

public interface ISubject {
    public void add(IObserver iObserver);

    public void remove(IObserver iObserver);

    public void notifyAll(String titulo);
}
