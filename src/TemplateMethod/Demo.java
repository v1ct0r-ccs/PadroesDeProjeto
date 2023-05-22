package TemplateMethod;

import TemplateMethod.Profissoes.Advogado;
import TemplateMethod.Profissoes.Bombeiro;
import TemplateMethod.Profissoes.Policial;

public class Demo {

    public static void main (String args[]) {
        Trabalhador tra = new Bombeiro();
        tra.executarRotina();
    }
}
