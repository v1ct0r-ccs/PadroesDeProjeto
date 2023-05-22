package Adapter;

import java.io.File;

public interface IPercistenciaArquivos {

    public void gravar(File file);

    public File ler(String caminho);
}
