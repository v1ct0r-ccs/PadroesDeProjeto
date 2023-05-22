package TemplateMethod;

public abstract class Trabalhador {

    public void executarRotina() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando a rotina");
    }

    protected void levantar() {
        System.out.println("Levantando da cama");
    }

    protected void irAoTrabalho() {
        System.out.println("Indo para o trabalho");
    }

    protected abstract void trabalhar();

    protected void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }
}
