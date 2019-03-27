package com.zonthem.richinterface.controler;

import com.zonthem.richinterface.Utils.FileType;
import com.zonthem.richinterface.io.readers.DatReader;
import com.zonthem.richinterface.io.readers.Reader;
import com.zonthem.richinterface.io.readers.XmlReader;
import com.zonthem.richinterface.io.writers.DatWriter;
import com.zonthem.richinterface.io.writers.Writer;
import com.zonthem.richinterface.io.writers.XmlWriter;

public class CoreApp {

    private Reader reader;

    private Writer writer;

    public CoreApp() {

    }

    public void setReader(FileType type, String path) {
        this.reader = getNewReader(type, path);
    }

    private Reader getNewReader(FileType type, String path) {
        switch (type) {
            case XML:
                return new XmlReader(path);
            case DAT:
                return new DatReader(path);
            default:
                   return null;
        }
    }

    public void setWriter(FileType type, String path) {
        this.writer = getNewWriter(type, path);
    }

    private Writer getNewWriter(FileType type, String path) {
        switch (type) {
            case XML:
                return new XmlWriter(path);
            case DAT:
                return new DatWriter(path);
            default:
                return null;
        }
    }

    public Reader getReader() {
        return reader;
    }

    public Writer getWriter() {
        return writer;
    }
}
