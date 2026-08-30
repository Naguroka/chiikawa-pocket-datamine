package com.google.common.eventbus;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
public interface SubscriberExceptionHandler {
    void handleException(java.lang.Throwable exception, com.google.common.eventbus.SubscriberExceptionContext context);
}
