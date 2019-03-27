package com.zonthem.richinterface.io.readers;

import com.zonthem.richinterface.dataModel.AbstractFile;

import java.io.File;

public class DatReader extends Reader {

    public DatReader(String _path) {
        super(".dat");
        path = _path;
    }

    @Override
    public AbstractFile decode(File file) {
        return null;
    }

}
