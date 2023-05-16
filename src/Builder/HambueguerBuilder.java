package Builder;

public abstract class HambueguerBuilder {

    Hamburguer hamburguer = new Hamburguer();

    abstract void buildPao();
    abstract void buildCarne();
    abstract void buildSalada();
    abstract void buildQueijo();
    abstract void buildMolho();

    Hamburguer build(){
        return hamburguer;
    };
}
