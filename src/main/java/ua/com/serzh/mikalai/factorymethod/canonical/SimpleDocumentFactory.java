// ============================================================================
//  File          : JsonDocumentFactory
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
public class SimpleDocumentFactory implements DocumentFactory {
    @Override
    public Document create(String name) {
        return new SimpleDocument(name);
    }
}
