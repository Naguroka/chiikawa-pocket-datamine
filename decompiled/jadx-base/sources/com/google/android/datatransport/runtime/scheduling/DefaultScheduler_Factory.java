package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultScheduler_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> backendRegistryProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(javax.inject.Provider<java.util.concurrent.Executor> provider, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider4, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> provider5) {
        this.executorProvider = provider;
        this.backendRegistryProvider = provider2;
        this.workSchedulerProvider = provider3;
        this.eventStoreProvider = provider4;
        this.guardProvider = provider5;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory create(javax.inject.Provider<java.util.concurrent.Executor> provider, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider4, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> provider5) {
        return new com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.google.android.datatransport.runtime.scheduling.DefaultScheduler newInstance(java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard) {
        return new com.google.android.datatransport.runtime.scheduling.DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }
}
