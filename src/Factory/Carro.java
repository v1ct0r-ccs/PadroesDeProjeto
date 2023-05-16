package Factory;

public abstract class Carro {
    private int potencia;
    private String combustivelUtilizado;
    private String cor;

    private String modelo;

    public Carro(int potencia, String combustivelUtilizado, String cor, String modelo) {
        this.potencia = potencia;
        this.combustivelUtilizado = combustivelUtilizado;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void motorDePartida(){
        System.out.println(getClass().getSimpleName() + " - " + modelo);
        System.out.println("O " + modelo + " que utiliza o combustivel " + combustivelUtilizado + " iniciou o motor, e está pronto para utilizar os " + potencia + " cavalos de potencia, no carro com a cor: " + cor );
    }
    public void limpeza(){
        System.out.println("O carro foi lavado e higienizado, e a cor " + cor.toLowerCase() + " está brilhante");
    }
    public void revisaoMecanica(){
        System.out.println("O carro foi checado pelo mecânico, e tudo está correto!");
    }
    public void combustivel(){
        System.out.println("O carro está com o tanque completo com o combustivel: " + combustivelUtilizado.toLowerCase());
    }
}
