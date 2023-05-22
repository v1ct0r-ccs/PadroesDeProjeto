package Observer.MeiosDeComunicacao;

import Observer.IObserver;
import Observer.ISubject;

public class TV implements IObserver {
    @Override
    public void update(ISubject iSubject) {
        System.out.println("Noticiando a informação pela TV : " + iSubject.toString());
    }
}
