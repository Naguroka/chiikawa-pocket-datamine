package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.Module
public abstract class SchedulingConfigModule {
    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(com.google.android.datatransport.runtime.time.Clock clock) {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.getDefault(clock);
    }
}
