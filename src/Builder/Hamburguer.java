package Builder;

public class Hamburguer {
    private String pao = "Sem Pão";
    private String carne = "Sem Carne";
    private String salada = "Sem Salada";
    private String queijo = "Sem Queijo";
    private String molho = "Sem Molho";

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void print() {
        System.out.println(
                "Hamburguer Finalizado! " + "n" +
                        " - Pão: " + pao +
                        " - Carne: " + carne +
                        " - Queijo: " + queijo +
                        " - Salada: " + salada +
                        " - Molho: " + molho);
    }
}
