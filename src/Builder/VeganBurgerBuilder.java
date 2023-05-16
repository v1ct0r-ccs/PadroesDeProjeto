package Builder;

public class VeganBurgerBuilder extends HambueguerBuilder {

    @Override
    public void buildPao() {
        hamburguer.setPao("Pão Branco com gergelim Vegano");
    }

    @Override
    public void buildCarne() {
        hamburguer.setCarne("Hamburger Vegano");
    }

    @Override
    void buildSalada() {
        hamburguer.setSalada("Salada Americana e Tomate");
    }

    @Override
    void buildQueijo() {
        hamburguer.setQueijo("Queijo Vegano");
    }

    @Override
    void buildMolho() {
        hamburguer.setMolho("Mostarda e Molho Especial");
    }
}
