package Facade;

public class Demo {
    public static void main(String args[]){
        IApartamentoSevice service = new ApartamentoService();
        Apartamento apartamento = new Apartamento(1L, "Endereco");
        service.cadastrarApartamento(apartamento);

        System.out.println("Apartamento disponivel: " + apartamento.toString());
    }
}
