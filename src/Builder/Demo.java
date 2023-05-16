package Builder;

public class Demo {

    public static void main(String args[]){
        //Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Hamburguer hamburguer = gerente.buildHamburguer();
        hamburguer.print();

        //Gerente gerente1 = new Gerente(new VeganBurger());
        gerente.setBuilder(new VeganBurgerBuilder());
        Hamburguer hamburguer1 = gerente.buildHamburguer();
        hamburguer1.print();
    }
}
