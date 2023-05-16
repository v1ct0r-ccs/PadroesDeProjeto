package Factory;

public abstract class Factory {
    public Carro create(String requestGrade) {
        Carro carro = buscarCarro(requestGrade);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro) {
        carro.limpeza();
        carro.revisaoMecanica();
        carro.combustivel();
        return carro;
    }
    abstract Carro buscarCarro(String requestGrade);
}
