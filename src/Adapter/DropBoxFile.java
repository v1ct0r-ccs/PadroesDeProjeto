package Adapter;

import java.io.File;

public class DropBoxFile {

    public DropBoxFile(File absolutePath) {
    }

    public String getLocalPatch() {
        return "/tmp";
    }
}
