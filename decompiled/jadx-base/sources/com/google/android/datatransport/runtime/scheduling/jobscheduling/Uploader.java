package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX INFO: loaded from: classes4.dex */
public class Uploader {
    private static final java.lang.String CLIENT_HEALTH_METRICS_LOG_SOURCE = "GDT_CLIENT_METRICS";
    private static final java.lang.String LOG_TAG = "Uploader";
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore clientHealthMetricsStore;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.time.Clock uptimeClock;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    @javax.inject.Inject
    public Uploader(android.content.Context context, com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry, com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler, java.util.concurrent.Executor executor, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore clientHealthMetricsStore) {
        this.context = context;
        this.backendRegistry = backendRegistry;
        this.eventStore = eventStore;
        this.workScheduler = workScheduler;
        this.executor = executor;
        this.guard = synchronizationGuard;
        this.clock = clock;
        this.uptimeClock = clock2;
        this.clientHealthMetricsStore = clientHealthMetricsStore;
    }

    boolean isNetworkAvailable() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void upload(final com.google.android.datatransport.runtime.TransportContext transportContext, final int i, final java.lang.Runnable runnable) {
        this.executor.execute(new java.lang.Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m755x80c37673(transportContext, i, runnable);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$upload$1$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ void m755x80c37673(final com.google.android.datatransport.runtime.TransportContext transportContext, final int i, java.lang.Runnable runnable) {
        try {
            try {
                com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard = this.guard;
                final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore = this.eventStore;
                java.util.Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda3
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final java.lang.Object execute() {
                        return java.lang.Integer.valueOf(eventStore.cleanUp());
                    }
                });
                if (!isNetworkAvailable()) {
                    this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda4
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final java.lang.Object execute() {
                            return this.f$0.m754x3eac4914(transportContext, i);
                        }
                    });
                } else {
                    logAndUpdateState(transportContext, i);
                }
            } catch (com.google.android.datatransport.runtime.synchronization.SynchronizationException unused) {
                this.workScheduler.schedule(transportContext, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: lambda$upload$0$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Object m754x3eac4914(com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        this.workScheduler.schedule(transportContext, i + 1);
        return null;
    }

    public com.google.android.datatransport.runtime.backends.BackendResponse logAndUpdateState(final com.google.android.datatransport.runtime.TransportContext transportContext, int i) {
        com.google.android.datatransport.runtime.backends.BackendResponse backendResponseSend;
        com.google.android.datatransport.runtime.backends.TransportBackend transportBackend = this.backendRegistry.get(transportContext.getBackendName());
        long jMax = 0;
        com.google.android.datatransport.runtime.backends.BackendResponse backendResponseOk = com.google.android.datatransport.runtime.backends.BackendResponse.ok(0L);
        while (true) {
            final long j = jMax;
            while (true) {
                if (((java.lang.Boolean) this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda5
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final java.lang.Object execute() {
                        return this.f$0.m747x65f78bd8(transportContext);
                    }
                })).booleanValue()) {
                    final java.lang.Iterable iterable = (java.lang.Iterable) this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda6
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final java.lang.Object execute() {
                            return this.f$0.m748xa80eb937(transportContext);
                        }
                    });
                    if (!iterable.iterator().hasNext()) {
                        return backendResponseOk;
                    }
                    if (transportBackend == null) {
                        com.google.android.datatransport.runtime.logging.Logging.d(LOG_TAG, "Unknown backend for %s, deleting event batch for it...", transportContext);
                        backendResponseSend = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError();
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) it.next()).getEvent());
                        }
                        if (transportContext.shouldUploadClientHealthMetrics()) {
                            arrayList.add(createMetricsEvent(transportBackend));
                        }
                        backendResponseSend = transportBackend.send(com.google.android.datatransport.runtime.backends.BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
                    }
                    backendResponseOk = backendResponseSend;
                    if (backendResponseOk.getStatus() == com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR) {
                        this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda7
                            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                            public final java.lang.Object execute() {
                                return this.f$0.m749xea25e696(iterable, transportContext, j);
                            }
                        });
                        this.workScheduler.schedule(transportContext, i + 1, true);
                        return backendResponseOk;
                    }
                    this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda8
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final java.lang.Object execute() {
                            return this.f$0.m750x2c3d13f5(iterable);
                        }
                    });
                    if (backendResponseOk.getStatus() == com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK) {
                        break;
                    }
                    if (backendResponseOk.getStatus() == com.google.android.datatransport.runtime.backends.BackendResponse.Status.INVALID_PAYLOAD) {
                        final java.util.HashMap map = new java.util.HashMap();
                        java.util.Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            java.lang.String transportName = ((com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) it2.next()).getEvent().getTransportName();
                            if (!map.containsKey(transportName)) {
                                map.put(transportName, 1);
                            } else {
                                map.put(transportName, java.lang.Integer.valueOf(((java.lang.Integer) map.get(transportName)).intValue() + 1));
                            }
                        }
                        this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda10
                            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                            public final java.lang.Object execute() {
                                return this.f$0.m752xb06b6eb3(map);
                            }
                        });
                    }
                } else {
                    this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda1
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final java.lang.Object execute() {
                            return this.f$0.m753xf2829c12(transportContext, j);
                        }
                    });
                    return backendResponseOk;
                }
            }
            jMax = java.lang.Math.max(j, backendResponseOk.getNextRequestWaitMillis());
            if (transportContext.shouldUploadClientHealthMetrics()) {
                this.guard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda9
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final java.lang.Object execute() {
                        return this.f$0.m751x6e544154();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$2$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Boolean m747x65f78bd8(com.google.android.datatransport.runtime.TransportContext transportContext) {
        return java.lang.Boolean.valueOf(this.eventStore.hasPendingEventsFor(transportContext));
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$3$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Iterable m748xa80eb937(com.google.android.datatransport.runtime.TransportContext transportContext) {
        return this.eventStore.loadBatch(transportContext);
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$4$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Object m749xea25e696(java.lang.Iterable iterable, com.google.android.datatransport.runtime.TransportContext transportContext, long j) {
        this.eventStore.recordFailure(iterable);
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j);
        return null;
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$5$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Object m750x2c3d13f5(java.lang.Iterable iterable) {
        this.eventStore.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$6$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Object m751x6e544154() {
        this.clientHealthMetricsStore.resetClientMetrics();
        return null;
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$7$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Object m752xb06b6eb3(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.clientHealthMetricsStore.recordLogEventDropped(((java.lang.Integer) entry.getValue()).intValue(), com.google.android.datatransport.runtime.firebase.transport.LogEventDropped.Reason.INVALID_PAYLOD, (java.lang.String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: renamed from: lambda$logAndUpdateState$8$com-google-android-datatransport-runtime-scheduling-jobscheduling-Uploader, reason: not valid java name */
    /* synthetic */ java.lang.Object m753xf2829c12(com.google.android.datatransport.runtime.TransportContext transportContext, long j) {
        this.eventStore.recordNextCallTime(transportContext, this.clock.getTime() + j);
        return null;
    }

    public com.google.android.datatransport.runtime.EventInternal createMetricsEvent(com.google.android.datatransport.runtime.backends.TransportBackend transportBackend) {
        com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard = this.guard;
        final com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore clientHealthMetricsStore = this.clientHealthMetricsStore;
        java.util.Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(com.google.android.datatransport.runtime.EventInternal.builder().setEventMillis(this.clock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(CLIENT_HEALTH_METRICS_LOG_SOURCE).setEncodedPayload(new com.google.android.datatransport.runtime.EncodedPayload(com.google.android.datatransport.Encoding.of("proto"), ((com.google.android.datatransport.runtime.firebase.transport.ClientMetrics) synchronizationGuard.runCriticalSection(new com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final java.lang.Object execute() {
                return clientHealthMetricsStore.loadClientMetrics();
            }
        })).toByteArray())).build());
    }
}
