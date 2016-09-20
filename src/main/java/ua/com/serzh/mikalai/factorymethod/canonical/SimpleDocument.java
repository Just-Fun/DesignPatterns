// ============================================================================
//  File          : JsonDocument
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.factorymethod.canonical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class SimpleDocument implements Document {
    private final String name;
    private final Map<String, String> fields = new LinkedHashMap<>();

    public SimpleDocument(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addField(String name, String value) {
        fields.put(name, value);
    }

    @Override
    public String toString() {
        return name + ":\n" + fields.entrySet().stream()
                .map(e -> e.getKey() + " - " + e.getValue())
                .collect(Collectors.joining("\n", "", ""));
    }
}