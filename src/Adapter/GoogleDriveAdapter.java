package Adapter;

import java.io.File;

import java.util.Arrays;

public class GoogleDriveAdapter implements IPercistenciaArquivos{

    private GoogleDrive googleDrive;

    public GoogleDriveAdapter(GoogleDrive googledrive) {
        this.googleDrive = googledrive;
    }

    @Override
    public void gravar(File file) {
        System.out.println("Gravando o arquivo do Google Drive: " + file.getName());
    }

    @Override
    public File ler(String caminho) {
        System.out.println("Lendo o arquivo do Google Drive: " + caminho);

        File[] fileBytes;
        fileBytes = File.listRoots();

        return new File(caminho, Arrays.toString(fileBytes));
    }
}
