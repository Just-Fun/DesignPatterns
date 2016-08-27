// ============================================================================
//  File          : PermissionChecker
//  Created       : 13.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.proxy;

import ua.com.serzh.mikalai.proxy.canonical.Order;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class PermissionChecker {
    private final ThreadLocal<Long> currentUser = new ThreadLocal<>();

    public void setCurrentUser(long userId) {
        currentUser.set(userId);
    }

    public void checkPermission(Order order) {
        if (order.getUserId() != currentUser.get()) {
            throw new IllegalStateException("Order for another user can't be processed: " + order);
        }
    }
}
