package com.google.android.datatransport.runtime.scheduling;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultScheduler implements com.google.android.datatransport.runtime.scheduling.Scheduler {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(com.google.android.datatransport.runtime.TransportRuntime.class.getName());
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    @javax.inject.Inject
    public DefaultScheduler(java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard) {
        this.executor = executor;
        this.backendRegistry = backendRegistry;
        this.workScheduler = workScheduler;
        this.eventStore = eventStore;
        this.guard = synchronizationGuard;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(final com.google.android.datatransport.runtime.TransportContext transportContext, final com.google.android.datatransport.runtime.EventInternal eventInternal, final com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback) {
        this.executor.execute(new java.lang.Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m745x41d0caed(transportContext, transportScheduleCallback, eventInternal);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$schedule$1$com-google-android-datatransport-runtime-scheduling-DefaultScheduler, reason: not valid java name */
    /* synthetic */ void m745x41d0caed(final com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        try {
            com.google.android.datatransport.runtime.backends.TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
            if (transportBackend == null) {
                java.lang.String str = java.lang.String.format("Transport backend '%s' is not registered", transportContext.getBackendName());
                LOGGER.warning(str);
                transportScheduleCallback.onSchedule(new java.lang.IllegalArgumentException(str));
            } else {
                final com.google.android.datatransport.runtime.EventInternal eventInternalDecorate = transportBackend.decorate(eventInternal);
                this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$ExternalSyntheticLambda0
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final java.lang.Object execute() {
                        return this.f$0.m744x8f06a4e(transportContext, eventInternalDecorate);
                    }
                });
                transportScheduleCallback.onSchedule(null);
            }
        } catch (java.lang.Exception e) {
            LOGGER.warning("Error scheduling event " + e.getMessage());
            transportScheduleCallback.onSchedule(e);
        }
    }

    /* JADX INFO: renamed from: lambda$schedule$0$com-google-android-datatransport-runtime-scheduling-DefaultScheduler, reason: not valid java name */
    /* synthetic */ java.lang.Object m744x8f06a4e(com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        this.eventStore.persist(transportContext, eventInternal);
        this.workScheduler.schedule(transportContext, 1);
        return null;
    }
}
