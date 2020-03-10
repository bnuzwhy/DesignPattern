package com.why.prototype.clone;

import java.io.Serializable;

public class DeepProtoType implements Serializable , Cloneable {

    private static final long serialVersionUID = 1L;

    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType(){
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = super.clone();
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }
}
