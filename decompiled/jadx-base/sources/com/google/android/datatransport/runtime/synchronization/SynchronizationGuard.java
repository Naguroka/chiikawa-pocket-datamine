package com.google.android.datatransport.runtime.synchronization;

/* JADX INFO: loaded from: classes4.dex */
public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        T execute();
    }

    <T> T runCriticalSection(com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection<T> criticalSection);
}
