package com.guru13.model;

import javafx.scene.control.TreeItem;

/**
 * @author Aliaksei Huryanchyk
 */
public class EmailTreeItem<String> extends TreeItem<String> {

    private String name;

    public EmailTreeItem(String name) {
        super(name);
        this.name = name;
    }
}
