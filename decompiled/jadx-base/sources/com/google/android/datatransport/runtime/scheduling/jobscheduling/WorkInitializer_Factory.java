package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public final class WorkInitializer_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> {
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> schedulerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> storeProvider;

    public WorkInitializer_Factory(javax.inject.Provider<java.util.concurrent.Executor> provider, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> provider4) {
        this.executorProvider = provider;
        this.storeProvider = provider2;
        this.schedulerProvider = provider3;
        this.guardProvider = provider4;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory create(javax.inject.Provider<java.util.concurrent.Executor> provider, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> provider4) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer newInstance(java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }
}
