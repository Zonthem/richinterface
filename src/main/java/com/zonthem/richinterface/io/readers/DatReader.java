package com.zonthem.richinterface.io.readers;

import com.zonthem.richinterface.dataModel.AbstractFile;
import com.zonthem.richinterface.dataModel.DatFile;
import com.zonthem.richinterface.dataModel.NodeNode;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DatReader extends Reader {

    public DatReader(String _path) {
        super(".dat");
        path = _path;
    }

    @Override
    public AbstractFile decode(File file) {

        AbstractFile dataFile = new DatFile();

        NodeNode rootNode = new NodeNode(file.getName());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.split(":").length > 1) {
                    rootNode.addNode(new NodeNode(line.split(":")[0], line.split(":")[1]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataFile;

    }

}
