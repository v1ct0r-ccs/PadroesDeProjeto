package Factory;

import Factory.Montadoras.Fiat;
import Factory.Montadoras.Toyota;
import Factory.Montadoras.Volkswagen;

public class SemContratoFactory  extends Factory{
    @Override
    Carro buscarCarro(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new Volkswagen(95, "Gasolina", "Prata", "Polo");
        }
        if ("B".equals(requestGrade)){
            return new Toyota(170, "Flex", "Azul", "Corolla");
        }
        if ("C".equals(requestGrade)){
            return new Fiat(180, "Gasolina", "Branco", "Pulse");
        }
        else {
            return null;
        }
    }
}
