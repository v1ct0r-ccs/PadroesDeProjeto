package Observer.MeiosDeComunicacao;

import Observer.IObserver;
import Observer.ISubject;

public class Internet implements IObserver {
    @Override
    public void update(ISubject iSubject) {
        System.out.println("Noticiando a informação por internet : " + iSubject.toString());
    }
}
