// ============================================================================
//  File          : ModernFactoryMethodClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.factorymethod;

import ua.com.serzh.mikalai.factorymethod.canonical.Document;
import ua.com.serzh.mikalai.factorymethod.canonical.DocumentFactory;
import ua.com.serzh.mikalai.factorymethod.canonical.JsonDocument;

import java.util.function.Function;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernFactoryMethodClient {
    public static void main(String[] args) {
        DocumentFactory factory = JsonDocument::new;
        printUserDetails(factory.create("USER"));

        Function<String, Document> plainFactory = JsonDocument::new;
        printUserDetails(plainFactory.apply("USER"));
    }

    private static void printUserDetails(Document document) {
        document.addField("name", "Mikalai");
        document.addField("surname", "Alimenkou");
        System.out.println(document);
    }
}
