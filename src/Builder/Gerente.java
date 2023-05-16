package Builder;

public class Gerente {

    HambueguerBuilder builder;

    public void setBuilder(HambueguerBuilder builder) {
        this.builder = builder;
    }

    /**
    public Gerente(HambueguerBuilder builder) {
        this.builder = builder;
    }
*/

    public Hamburguer buildHamburguer() {
        builder.buildPao();
        builder.buildCarne();
        builder.buildSalada();
        builder.buildQueijo();
        builder.buildMolho();
        return builder.build();
    }
}
