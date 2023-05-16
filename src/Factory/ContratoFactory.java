package Factory;

import Factory.Montadoras.Audi;
import Factory.Montadoras.MercedesBenz;
import Factory.Montadoras.Tesla;

public class ContratoFactory extends Factory{
    @Override
    Carro buscarCarro(String requestGrade) {
        if ("A".equals(requestGrade)) {
            return new Audi(190, "Disel", "Azul", "A4");
        }
        if ("B".equals(requestGrade)){
            return new Tesla(280, "Elétrico", "Vermelho", "Model 3");
        }
        if ("C".equals(requestGrade)){
            return new MercedesBenz(220, "Híbrido", "Preto", "Classe C");
        } else {
            return null;
        }
    }
}
