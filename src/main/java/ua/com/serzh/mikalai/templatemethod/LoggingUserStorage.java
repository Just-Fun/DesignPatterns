// ============================================================================
//  File          : LoggingUserStorage
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.templatemethod;

import ua.com.serzh.mikalai.templatemethod.canonical.User;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class LoggingUserStorage {
    public long store(User user) {
        System.out.println("User is stored: " + user);
        return System.currentTimeMillis();
    }
}
