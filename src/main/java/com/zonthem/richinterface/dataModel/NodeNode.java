package com.zonthem.richinterface.dataModel;

import java.util.ArrayList;
import java.util.List;

public class NodeNode {

    private String name;

    private List<NodeNode> childNodes;

    private NodeList childNodeList;

    private List<NodeAttribute> attributs;

    private String textContent;

    public NodeNode(String _name) {
        name = _name;
        childNodes = new ArrayList<>();
        attributs = new ArrayList<>();
    }

    public NodeNode(String _name, String _text) {
        textContent = _text;
        name = _name;
        childNodes = new ArrayList<>();
        attributs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<NodeNode> getChildNodes() {
        return childNodes;
    }

    public NodeList getChildNodeList() {
        return childNodeList;
    }

    public List<NodeAttribute> getAttributs() {
        return attributs;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNode(NodeNode node) {
        this.childNodes.add(node);
    }

    public void addAttributs(NodeAttribute attr) {
        this.attributs.add(attr);
    }

    public void setChildNodeList(NodeList childNodeList) {
        this.childNodeList = childNodeList;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
