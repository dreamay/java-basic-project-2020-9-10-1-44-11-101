package com.thoughtworks.impl;

import com.thoughtworks.KeyContant;
import com.thoughtworks.Schema;

public class SchemaD implements Schema {
    private String key;
    private String value;
    @Override
    public boolean checkValueType() {
        return true;
    }

    @Override
    public void initValue() {
        this.key= KeyContant.SCHEMA_D;
        this.value="";
    }

    @Override
    public String getDefaultValue() {
        return "";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }
}