package com.thoughtworks.impl;

import com.thoughtworks.KeyContant;
import com.thoughtworks.Schema;

import java.util.regex.Pattern;

public class SchemaP implements Schema {
    private String key;
    private String value;
    @Override
    public boolean checkValueType() {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(this.value).matches() && Integer.valueOf(this.value) <= Integer.MAX_VALUE;
    }

    @Override
    public void initValue() {
        this.key= KeyContant.SCHEMA_P;
        this.value = "8080";
    }

    @Override
    public String getDefaultValue() {
        return "8080";
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getKey() {
        return key;
    }
}
