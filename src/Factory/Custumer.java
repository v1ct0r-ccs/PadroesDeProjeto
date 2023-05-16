package Factory;

public class Custumer {

    private String gradeRequest;
    private boolean contratadoEmpresa;

    public Custumer(String gradeRequest, boolean contratadoEmpresa) {
        this.gradeRequest = gradeRequest;
        this.contratadoEmpresa = contratadoEmpresa;
    }

    public boolean contratadoEmpresa() {
        return contratadoEmpresa;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
