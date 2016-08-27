// ============================================================================
//  File          : ModernTimeServer
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.observer;

import ua.com.serzh.mikalai.observer.canonical.Event;
import ua.com.serzh.mikalai.observer.canonical.EventListener;
import ua.com.serzh.mikalai.observer.canonical.Observer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernTimeServer implements Observer {
    private static final String TIME_FORMAT = "HH:mm:ss";

    private final List<EventListener> listeners = new ArrayList<>();

    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public void reportTime() {
        Event event = new Event(new SimpleDateFormat(TIME_FORMAT).format(new Date()));
        listeners.forEach(listener -> listener.onEvent(event));
    }
}
