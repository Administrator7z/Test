package com.xxx.pojo;

public class Accounts {
    private Integer aId;
    private String aName;
    private String aContent;

    public Accounts() {
    }

    public Accounts(String aName, String aContent) {
        this.aName = aName;
        this.aContent = aContent;
    }

    public Accounts(Integer aId, String aName, String aContent) {
        this.aId = aId;
        this.aName = aName;
        this.aContent = aContent;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aContent='" + aContent + '\'' +
                '}';
    }
}
