package Observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements ISubject{

    public List<IObserver> iObservers = new ArrayList<>();

    private String titulo;

    @Override
    public void add(IObserver iObserver) {
        iObservers.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        iObservers.remove(iObserver);
    }

    @Override
    public void notifyAll(String titulo) {
        this.titulo = titulo;
        for (IObserver ob : this.iObservers) {
            ob.update(this);
        }
    }

    @Override
    public String toString() {
        return "Jornalista{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}
