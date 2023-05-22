package TemplateMethod.Profissoes;

import TemplateMethod.Trabalhador;

public class Bombeiro extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Bombeiro");
    }
}
