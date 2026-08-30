package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public interface EventStore extends java.io.Closeable {
    int cleanUp();

    long getNextCallTime(com.google.android.datatransport.runtime.TransportContext transportContext);

    boolean hasPendingEventsFor(com.google.android.datatransport.runtime.TransportContext transportContext);

    java.lang.Iterable<com.google.android.datatransport.runtime.TransportContext> loadActiveContexts();

    java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> loadBatch(com.google.android.datatransport.runtime.TransportContext transportContext);

    com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent persist(com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal);

    void recordFailure(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable);

    void recordNextCallTime(com.google.android.datatransport.runtime.TransportContext transportContext, long j);

    void recordSuccess(java.lang.Iterable<com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent> iterable);
}
