package com.zonthem.richinterface.io.readers;

import com.zonthem.richinterface.dataModel.AbstractFile;
import com.zonthem.richinterface.dataModel.XmlFile;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlReader extends Reader {

    public XmlReader(String _path) {
        super(".xml");
        path = _path;
    }

    @Override
    public AbstractFile decode(File file) {

        AbstractFile dataFile = new XmlFile();

        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);


        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }

}
