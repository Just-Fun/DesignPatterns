// ============================================================================
//  File          : TemplateMethodClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.factorymethod.canonical;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        Document document = new JsonDocumentFactory().create("USER");
//        Document document = new JsonDocument("USER");
        document.addField("name", "Mikalai");
        document.addField("surname", "Alimenkou");
        System.out.println(document);

        Document simpleDocument = new SimpleDocumentFactory().create("USER2");
        simpleDocument.addField("name", "Mikalai");
        simpleDocument.addField("surname", "Alimenkou");
        System.out.println(simpleDocument);

    }
}
