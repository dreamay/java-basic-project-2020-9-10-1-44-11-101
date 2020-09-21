package com.thoughtworks;

public interface Schema {
    public boolean checkValueType();
    public void initValue();
    public String getDefaultValue();
    public String getKey();
}