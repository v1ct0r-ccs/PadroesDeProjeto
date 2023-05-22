package Observer.MeiosDeComunicacao;

import Observer.IObserver;
import Observer.ISubject;

public class Radio implements IObserver {
    @Override
    public void update(ISubject iSubject) {
        System.out.println("Noticiando a informação por radio :" + iSubject.toString());
    }
}
