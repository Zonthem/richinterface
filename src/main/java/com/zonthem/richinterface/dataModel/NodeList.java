package com.zonthem.richinterface.dataModel;

import java.util.ArrayList;
import java.util.List;

public class NodeList {

    private List<NodeNode> liste;

    public NodeList() {
        liste = new ArrayList<>();
    }

    public List<NodeNode> getListe() {
        return liste;
    }

    public void addNode(NodeNode node) {
        liste.add(node);
    }
}
