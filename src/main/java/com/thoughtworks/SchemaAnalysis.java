package com.thoughtworks;

public class SchemaAnalysis {
    public String[] formatShemaInput(String inputSchema) {
        String[] formatSchema = {};
        if (null == inputSchema || "" == inputSchema) {
            return formatSchema;
        }
        else {
            formatSchema = inputSchema.split("-");
        }
        return formatSchema;
    }
}
