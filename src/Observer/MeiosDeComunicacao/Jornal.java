package Observer.MeiosDeComunicacao;


import Observer.IObserver;
import Observer.ISubject;

public class Jornal implements IObserver {

    @Override
    public void update(ISubject iSubject) {
        System.out.println("Noticiando a informação pelo jornal :" + iSubject.toString());
    }
}
