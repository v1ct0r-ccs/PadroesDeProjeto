package Facade;

public class Apartamento {
    private Long codigo;
    private String endereco;

    public Apartamento(Long codigo, String endereco) {
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "codigo=" + codigo +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
