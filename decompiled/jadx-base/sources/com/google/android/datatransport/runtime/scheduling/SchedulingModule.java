package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.Module
public abstract class SchedulingModule {
    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.Scheduler scheduler(com.google.android.datatransport.runtime.scheduling.DefaultScheduler defaultScheduler);

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context context, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig, com.google.android.datatransport.runtime.time.Clock clock) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler(context, eventStore, schedulerConfig);
    }
}
