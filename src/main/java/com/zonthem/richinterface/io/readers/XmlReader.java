package com.zonthem.richinterface.io.readers;

import com.zonthem.richinterface.dataModel.AbstractFile;
import com.zonthem.richinterface.dataModel.NodeAttribute;
import com.zonthem.richinterface.dataModel.NodeNode;
import com.zonthem.richinterface.dataModel.XmlFile;
import org.w3c.dom.*;
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

            createDomTree(doc.getDocumentElement());

            dataFile.setRootNode(createDomTree(doc.getDocumentElement()));

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        return null;
    }

    private NodeNode createDomTree(Node sourceNode) {

        NodeNode newNode = new NodeNode(sourceNode.getNodeName());
        NodeList list = sourceNode.getChildNodes();

        //add attributes
        for (int i = 0; i < sourceNode.getAttributes().getLength(); i++) {
            newNode.addAttributs(
                    new NodeAttribute(
                            sourceNode.getAttributes().item(i).getNodeName(),
                            sourceNode.getAttributes().item(i).getTextContent()
                    ));
        }

        //add children
        for (int n = 0; n < list.getLength(); n++) {
            newNode.addNode(createDomTree(list.item(n)));
        }

        return newNode;
    }

}
