package com.dahuaboke.nodou.model;

public class RequestModel {

    private String username;
    private String password;
    private String nameNode;
    private String nodeMsg;
    private String type;

    public RequestModel() {
    }

    public RequestModel(String username, String password, String nameNode, String nodeMsg, String type) {
        this.username = username;
        this.password = password;
        this.nameNode = nameNode;
        this.nodeMsg = nodeMsg;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameNode() {
        return nameNode;
    }

    public void setNameNode(String nameNode) {
        this.nameNode = nameNode;
    }

    public String getNodeMsg() {
        return nodeMsg;
    }

    public void setNodeMsg(String nodeMsg) {
        this.nodeMsg = nodeMsg;
    }
}
