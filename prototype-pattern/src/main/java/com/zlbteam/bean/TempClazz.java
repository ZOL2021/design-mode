package com.zlbteam.bean;

/**
 * @author zhoulibin
 */
public abstract class TempClazz implements Cloneable{

    private String id;

    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected TempClazz() {}

    /**
     * 展示
     */
    abstract void show();
}
