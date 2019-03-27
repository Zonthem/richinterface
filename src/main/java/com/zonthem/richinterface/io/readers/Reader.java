package com.zonthem.richinterface.io.readers;

import com.zonthem.richinterface.dataModel.AbstractFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class Reader {

    protected String path;

    protected final String EXTENTION;

    protected List<File> fileList;

    public Reader(String extention) {
        fileList = new ArrayList<>();
        EXTENTION = extention;
    }

    /**
     * Lis le fichier donné en paramètre et stocke ses infos dans un objet spécifique
     * @param file un fichier du disque dur
     * @return un fichier de données
     */
    public abstract AbstractFile decode(File file);

    /**
     * Référence tous les fichiers présents dans le répertoire sélectionné (si le path est un rép).
     */
    public void listFiles() {
        if (path == null || "".equals(path))
            return ;

        if (Files.isDirectory(Paths.get(path))) {

            File[] list = new File(path).listFiles();
            for (File f : list) {
                if (f.getAbsolutePath().endsWith(EXTENTION)) {
                    fileList.add(f);
                }
            }

        } else if (Files.isRegularFile(Paths.get(path)) && path.endsWith(EXTENTION)) {

            fileList.add(new File(path));

        }
    }

}
