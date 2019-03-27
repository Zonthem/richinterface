package com.zonthem.richinterface.dataModel;

public abstract class AbstractFile {

    private NodeNode rootNode;

    public NodeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(NodeNode rootNode) {
        this.rootNode = rootNode;
    }
}
