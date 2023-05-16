package Builder;

public class CheeseBurgerBuilder extends HambueguerBuilder {

    @Override
    public void buildPao() {
        hamburguer.setPao("Pão Branco com gergelim");
    }

    @Override
    public void buildCarne() {
        hamburguer.setCarne("Hamburger Angus 180gr");
    }

    @Override
    void buildSalada() {
        hamburguer.setSalada("Salada Americana e Tomate");
    }

    @Override
    void buildQueijo() {
        hamburguer.setQueijo("Gouda");
    }

    @Override
    void buildMolho() {
        hamburguer.setMolho("Maionese, Mostarda e Molho Especial");
    }
}
