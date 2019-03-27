package com.zonthem.richinterface.dataModel;

public class NodeAttribute {

    private String name;

    private String textContent;

    public NodeAttribute(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
