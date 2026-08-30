package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.Module
public abstract class EventStoreModule {
    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Named("SQLITE_DB_NAME")
    static java.lang.String dbName() {
        return "com.google.android.datatransport.events";
    }

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore clientHealthMetricsStore(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore);

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore);

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore);

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT;
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Named("SCHEMA_VERSION")
    static int schemaVersion() {
        return com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.SCHEMA_VERSION;
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Singleton
    @javax.inject.Named("PACKAGE_NAME")
    static java.lang.String packageName(android.content.Context context) {
        return context.getPackageName();
    }
}
