package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public final class TransportRuntime_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.TransportRuntime> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> eventClockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> initializerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> schedulerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> uploaderProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> uptimeClockProvider;

    public TransportRuntime_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> provider4, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> provider5) {
        this.eventClockProvider = provider;
        this.uptimeClockProvider = provider2;
        this.schedulerProvider = provider3;
        this.uploaderProvider = provider4;
        this.initializerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }

    public static com.google.android.datatransport.runtime.TransportRuntime_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> provider4, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> provider5) {
        return new com.google.android.datatransport.runtime.TransportRuntime_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.google.android.datatransport.runtime.TransportRuntime newInstance(com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, com.google.android.datatransport.runtime.scheduling.Scheduler scheduler, com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader uploader, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer workInitializer) {
        return new com.google.android.datatransport.runtime.TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }
}
