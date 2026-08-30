package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
@javax.inject.Singleton
public class TransportRuntime implements com.google.android.datatransport.runtime.TransportInternal {
    private static volatile com.google.android.datatransport.runtime.TransportRuntimeComponent instance;
    private final com.google.android.datatransport.runtime.time.Clock eventClock;
    private final com.google.android.datatransport.runtime.scheduling.Scheduler scheduler;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader;
    private final com.google.android.datatransport.runtime.time.Clock uptimeClock;

    @javax.inject.Inject
    TransportRuntime(com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, com.google.android.datatransport.runtime.scheduling.Scheduler scheduler, com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        this.eventClock = clock;
        this.uptimeClock = clock2;
        this.scheduler = scheduler;
        this.uploader = uploader;
        workInitializer.ensureContextsScheduled();
    }

    public static void initialize(android.content.Context context) {
        if (instance == null) {
            synchronized (com.google.android.datatransport.runtime.TransportRuntime.class) {
                if (instance == null) {
                    instance = com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.builder().setApplicationContext(context).build();
                }
            }
        }
    }

    public static com.google.android.datatransport.runtime.TransportRuntime getInstance() {
        com.google.android.datatransport.runtime.TransportRuntimeComponent transportRuntimeComponent = instance;
        if (transportRuntimeComponent == null) {
            throw new java.lang.IllegalStateException("Not initialized!");
        }
        return transportRuntimeComponent.getTransportRuntime();
    }

    static void withInstance(com.google.android.datatransport.runtime.TransportRuntimeComponent transportRuntimeComponent, java.util.concurrent.Callable<java.lang.Void> callable) throws java.lang.Throwable {
        com.google.android.datatransport.runtime.TransportRuntimeComponent transportRuntimeComponent2;
        synchronized (com.google.android.datatransport.runtime.TransportRuntime.class) {
            transportRuntimeComponent2 = instance;
            instance = transportRuntimeComponent;
        }
        try {
            callable.call();
            synchronized (com.google.android.datatransport.runtime.TransportRuntime.class) {
                instance = transportRuntimeComponent2;
            }
        } catch (java.lang.Throwable th) {
            synchronized (com.google.android.datatransport.runtime.TransportRuntime.class) {
                instance = transportRuntimeComponent2;
                throw th;
            }
        }
    }

    @java.lang.Deprecated
    public com.google.android.datatransport.TransportFactory newFactory(java.lang.String str) {
        return new com.google.android.datatransport.runtime.TransportFactoryImpl(getSupportedEncodings(null), com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(str).build(), this);
    }

    public com.google.android.datatransport.TransportFactory newFactory(com.google.android.datatransport.runtime.Destination destination) {
        return new com.google.android.datatransport.runtime.TransportFactoryImpl(getSupportedEncodings(destination), com.google.android.datatransport.runtime.TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }

    private static java.util.Set<com.google.android.datatransport.Encoding> getSupportedEncodings(com.google.android.datatransport.runtime.Destination destination) {
        if (destination instanceof com.google.android.datatransport.runtime.EncodedDestination) {
            return java.util.Collections.unmodifiableSet(((com.google.android.datatransport.runtime.EncodedDestination) destination).getSupportedEncodings());
        }
        return java.util.Collections.singleton(com.google.android.datatransport.Encoding.of("proto"));
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader getUploader() {
        return this.uploader;
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    public void send(com.google.android.datatransport.runtime.SendRequest sendRequest, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback) {
        this.scheduler.schedule(sendRequest.getTransportContext().withPriority(sendRequest.getEvent().getPriority()), convert(sendRequest), transportScheduleCallback);
    }

    private com.google.android.datatransport.runtime.EventInternal convert(com.google.android.datatransport.runtime.SendRequest sendRequest) {
        com.google.android.datatransport.runtime.EventInternal.Builder code = com.google.android.datatransport.runtime.EventInternal.builder().setEventMillis(this.eventClock.getTime()).setUptimeMillis(this.uptimeClock.getTime()).setTransportName(sendRequest.getTransportName()).setEncodedPayload(new com.google.android.datatransport.runtime.EncodedPayload(sendRequest.getEncoding(), sendRequest.getPayload())).setCode(sendRequest.getEvent().getCode());
        if (sendRequest.getEvent().getProductData() != null && sendRequest.getEvent().getProductData().getProductId() != null) {
            code.setProductId(sendRequest.getEvent().getProductData().getProductId());
        }
        if (sendRequest.getEvent().getEventContext() != null) {
            com.google.android.datatransport.EventContext eventContext = sendRequest.getEvent().getEventContext();
            if (eventContext.getPseudonymousId() != null) {
                code.setPseudonymousId(eventContext.getPseudonymousId());
            }
            if (eventContext.getExperimentIdsClear() != null) {
                code.setExperimentIdsClear(eventContext.getExperimentIdsClear());
            }
            if (eventContext.getExperimentIdsEncrypted() != null) {
                code.setExperimentIdsEncrypted(eventContext.getExperimentIdsEncrypted());
            }
        }
        return code.build();
    }
}
