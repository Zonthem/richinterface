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

    public void setReader(FileType type) {
        this.reader = getNewReader(type);
    }

    private Reader getNewReader(FileType type) {
        switch (type) {
            case XML:
                return new XmlReader();
            case DAT:
                return new DatReader();
            default:
                   return null;
        }
    }

    public void setWriter(FileType type) {
        this.writer = getNewWriter(type);
    }

    private Writer getNewWriter(FileType type) {
        switch (type) {
            case XML:
                return new XmlWriter();
            case DAT:
                return new DatWriter();
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
