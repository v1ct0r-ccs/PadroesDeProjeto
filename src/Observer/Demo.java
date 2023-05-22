package Observer;

import Observer.MeiosDeComunicacao.Internet;
import Observer.MeiosDeComunicacao.Jornal;
import Observer.MeiosDeComunicacao.Radio;
import Observer.MeiosDeComunicacao.TV;

public class Demo {
    public static void main(String args[]) {
        Jornalista jor = new Jornalista();
        jor.add(new Radio());
        jor.notifyAll("Teste");
    }
}
