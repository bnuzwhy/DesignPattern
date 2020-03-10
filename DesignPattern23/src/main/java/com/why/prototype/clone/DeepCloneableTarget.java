package com.why.prototype.clone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable , Cloneable {

    private static final long serialVersionUID = 1L;

    public String name;
    public String target;

    public DeepCloneableTarget(String name, String target) {
        this.name = name;
        this.target = target;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
