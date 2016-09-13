// ============================================================================
//  File          : ModernAdapterClient
//  Created       : 14.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package ua.com.serzh.mikalai.adapter;

import ua.com.serzh.mikalai.adapter.canonical.CharCounterTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class ModernAdapterClient {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        AtomicInteger counter = new AtomicInteger();
        Stream.of("af", "bdf", "c")
                .map(s -> new CharCounterTask(s, counter))
                .forEach(executor::execute);

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Total count: " + counter.get());
    }
}
