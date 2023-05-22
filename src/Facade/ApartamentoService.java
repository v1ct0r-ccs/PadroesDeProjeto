package Facade;

public class ApartamentoService implements IApartamentoSevice{
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado =  isApartamentoCadastrado(apartamento);
        Boolean isValidarCampos = isValidarCampos(apartamento);
        // (Lógica complexa)
        // se for Cadastrado e o Validar varlidar não correto ele retorna false pois já está cadastrado
        if (isCadastrado && !isValidarCampos) {
            return false;
        }

        return cadastrarBancoDeDados(apartamento);

    }

    private Boolean cadastrarBancoDeDados (Apartamento apartamento) {
        //Lógica de cadastro
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //Ir no banco em memoria e verificar se está cadastrado
        return false;
    }
    private Boolean isValidarCampos(Apartamento apartamento) {
        return true;
    }
}
