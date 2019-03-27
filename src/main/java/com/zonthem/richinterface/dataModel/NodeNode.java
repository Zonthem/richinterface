package com.zonthem.richinterface.dataModel;

import java.util.ArrayList;
import java.util.List;

public class NodeNode {

    private String name;

    private List<NodeNode> childNodes;

    private NodeList childNodeList;

    private String textContent;

    public NodeNode(String _name) {
        name = _name;
        childNodes = new ArrayList<>();
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

    public String getTextContent() {
        return textContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNode(NodeNode node) {
        this.childNodes.add(node);
    }

    public void setChildNodeList(NodeList childNodeList) {
        this.childNodeList = childNodeList;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
