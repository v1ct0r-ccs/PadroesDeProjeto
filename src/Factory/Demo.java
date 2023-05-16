package Factory;

public class Demo {

    public static void main (String args[]){
        Custumer cliente = new Custumer("A", false);
        Factory factory = getFactory(cliente);
        Carro carro =  factory.create(cliente.getGradeRequest());
        carro.motorDePartida();

        System.out.println();

        Custumer cliente1 = new Custumer("B", true);
        Factory factory1 = getFactory(cliente1);
        Carro carro1 = factory1.create(cliente1.getGradeRequest());
        carro1.motorDePartida();
    }

    private static Factory getFactory(Custumer cliente) {
        if (cliente.contratadoEmpresa()) {
            return new ContratoFactory();
        } else {
            return new SemContratoFactory();
        }
    }
}
