// ============================================================================
//  File          : ModernClient
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.command;

import ua.com.serzh.mikalai.command.canonical.Document;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernCommandClient {
    public static void main(String[] args) {
        Document editor = new Document();
        ModernMacro macro = new ModernMacro();

        macro.record(editor::bold)
                .record(editor::italic)
                .record(editor::underline)
                .run();
    }
}
