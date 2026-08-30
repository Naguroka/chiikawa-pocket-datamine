package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
final class DaggerTransportRuntimeComponent {
    private DaggerTransportRuntimeComponent() {
    }

    public static com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder builder() {
        return new com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.Builder();
    }

    private static final class Builder implements com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder {
        private android.content.Context setApplicationContext;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.Builder setApplicationContext(android.content.Context context) {
            this.setApplicationContext = (android.content.Context) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public com.google.android.datatransport.runtime.TransportRuntimeComponent build() {
            com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkBuilderRequirement(this.setApplicationContext, android.content.Context.class);
            return new com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.TransportRuntimeComponentImpl(this.setApplicationContext);
        }
    }

    private static final class TransportRuntimeComponentImpl extends com.google.android.datatransport.runtime.TransportRuntimeComponent {
        private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> configProvider;
        private javax.inject.Provider creationContextFactoryProvider;
        private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> defaultSchedulerProvider;
        private javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
        private javax.inject.Provider metadataBackendRegistryProvider;
        private javax.inject.Provider<java.lang.String> packageNameProvider;
        private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> sQLiteEventStoreProvider;
        private javax.inject.Provider schemaManagerProvider;
        private javax.inject.Provider<android.content.Context> setApplicationContextProvider;
        private final com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.TransportRuntimeComponentImpl transportRuntimeComponentImpl;
        private javax.inject.Provider<com.google.android.datatransport.runtime.TransportRuntime> transportRuntimeProvider;
        private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> uploaderProvider;
        private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> workInitializerProvider;
        private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

        private TransportRuntimeComponentImpl(android.content.Context context) {
            this.transportRuntimeComponentImpl = this;
            initialize(context);
        }

        private void initialize(android.content.Context context) {
            this.executorProvider = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.create());
            com.google.android.datatransport.runtime.dagger.internal.Factory factoryCreate = com.google.android.datatransport.runtime.dagger.internal.InstanceFactory.create(context);
            this.setApplicationContextProvider = factoryCreate;
            com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory creationContextFactory_FactoryCreate = com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory.create(factoryCreate, com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create());
            this.creationContextFactoryProvider = creationContextFactory_FactoryCreate;
            this.metadataBackendRegistryProvider = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, creationContextFactory_FactoryCreate));
            this.schemaManagerProvider = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory.create(this.setApplicationContextProvider, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.create(), com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.create());
            this.packageNameProvider = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory.create(this.setApplicationContextProvider));
            this.sQLiteEventStoreProvider = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory.create(com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create(), com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.create(), this.schemaManagerProvider, this.packageNameProvider));
            com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactoryCreate = com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory.create(com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create());
            this.configProvider = schedulingConfigModule_ConfigFactoryCreate;
            com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory.create(this.setApplicationContextProvider, this.sQLiteEventStoreProvider, schedulingConfigModule_ConfigFactoryCreate, com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create());
            this.workSchedulerProvider = schedulingModule_WorkSchedulerFactoryCreate;
            javax.inject.Provider<java.util.concurrent.Executor> provider = this.executorProvider;
            javax.inject.Provider provider2 = this.metadataBackendRegistryProvider;
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> provider3 = this.sQLiteEventStoreProvider;
            this.defaultSchedulerProvider = com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory.create(provider, provider2, schedulingModule_WorkSchedulerFactoryCreate, provider3, provider3);
            javax.inject.Provider<android.content.Context> provider4 = this.setApplicationContextProvider;
            javax.inject.Provider provider5 = this.metadataBackendRegistryProvider;
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> provider6 = this.sQLiteEventStoreProvider;
            this.uploaderProvider = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory.create(provider4, provider5, provider6, this.workSchedulerProvider, this.executorProvider, provider6, com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create(), this.sQLiteEventStoreProvider);
            javax.inject.Provider<java.util.concurrent.Executor> provider7 = this.executorProvider;
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> provider8 = this.sQLiteEventStoreProvider;
            this.workInitializerProvider = com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory.create(provider7, provider8, this.workSchedulerProvider, provider8);
            this.transportRuntimeProvider = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.TransportRuntime_Factory.create(com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create(), this.defaultSchedulerProvider, this.uploaderProvider, this.workInitializerProvider));
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime() {
            return this.transportRuntimeProvider.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore() {
            return this.sQLiteEventStoreProvider.get();
        }
    }
}
