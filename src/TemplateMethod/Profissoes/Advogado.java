package TemplateMethod.Profissoes;

import TemplateMethod.Trabalhador;

public class Advogado extends Trabalhador {
    @Override
    public void executarRotina() {
        super.executarRotina();
        jantarFora();
    }

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como advogado");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando as 9h");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Indo de carro ao trabalho as 11h");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando para casa de carro as 18h");
    }

    protected void jantarFora(){
        System.out.println("Saindo para jantar no restaurante");
    }
}
