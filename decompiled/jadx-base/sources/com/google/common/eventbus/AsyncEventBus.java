package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public class AsyncEventBus extends com.google.common.eventbus.EventBus {
    public AsyncEventBus(java.lang.String identifier, java.util.concurrent.Executor executor) {
        super(identifier, executor, com.google.common.eventbus.Dispatcher.legacyAsync(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }

    public AsyncEventBus(java.util.concurrent.Executor executor, com.google.common.eventbus.SubscriberExceptionHandler subscriberExceptionHandler) {
        super("default", executor, com.google.common.eventbus.Dispatcher.legacyAsync(), subscriberExceptionHandler);
    }

    public AsyncEventBus(java.util.concurrent.Executor executor) {
        super("default", executor, com.google.common.eventbus.Dispatcher.legacyAsync(), com.google.common.eventbus.EventBus.LoggingHandler.INSTANCE);
    }
}
