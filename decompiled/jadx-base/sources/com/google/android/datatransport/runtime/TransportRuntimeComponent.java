package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
@javax.inject.Singleton
@com.google.android.datatransport.runtime.dagger.Component(modules = {com.google.android.datatransport.runtime.backends.BackendRegistryModule.class, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.class, com.google.android.datatransport.runtime.ExecutionModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.class, com.google.android.datatransport.runtime.time.TimeModule.class})
abstract class TransportRuntimeComponent implements java.io.Closeable {

    @com.google.android.datatransport.runtime.dagger.Component.Builder
    interface Builder {
        com.google.android.datatransport.runtime.TransportRuntimeComponent build();

        @com.google.android.datatransport.runtime.dagger.BindsInstance
        com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder setApplicationContext(android.content.Context context);
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore();

    abstract com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime();

    TransportRuntimeComponent() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        getEventStore().close();
    }
}
