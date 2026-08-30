package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public class WorkInitializer {
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler scheduler;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore store;

    @javax.inject.Inject
    WorkInitializer(java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.store = eventStore;
        this.scheduler = workScheduler;
        this.guard = synchronizationGuard;
    }

    public void ensureContextsScheduled() {
        this.executor.execute(new java.lang.Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m757xb85b87dc();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$ensureContextsScheduled$1$com-google-android-datatransport-runtime-scheduling-jobscheduling-WorkInitializer, reason: not valid java name */
    /* synthetic */ void m757xb85b87dc() {
        this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final java.lang.Object execute() {
                return this.f$0.m756x10dfae1b();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$ensureContextsScheduled$0$com-google-android-datatransport-runtime-scheduling-jobscheduling-WorkInitializer, reason: not valid java name */
    /* synthetic */ java.lang.Object m756x10dfae1b() {
        java.util.Iterator<com.google.android.datatransport.runtime.TransportContext> it = this.store.loadActiveContexts().iterator();
        while (it.hasNext()) {
            this.scheduler.schedule(it.next(), 1);
        }
        return null;
    }
}
