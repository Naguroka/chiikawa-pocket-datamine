package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: loaded from: classes4.dex */
public final class SchedulingModule_WorkSchedulerFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> configProvider;
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider4) {
        this.contextProvider = provider;
        this.eventStoreProvider = provider2;
        this.configProvider = provider3;
        this.clockProvider = provider4;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider4) {
        return new com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory(provider, provider2, provider3, provider4);
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig, com.google.android.datatransport.runtime.time.Clock clock) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.scheduling.SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock));
    }
}
