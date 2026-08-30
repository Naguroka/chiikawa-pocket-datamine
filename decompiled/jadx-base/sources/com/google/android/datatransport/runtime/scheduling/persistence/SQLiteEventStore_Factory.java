package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public final class SQLiteEventStore_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> configProvider;
    private final javax.inject.Provider<java.lang.String> packageNameProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> schemaManagerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> wallClockProvider;

    public SQLiteEventStore_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> provider4, javax.inject.Provider<java.lang.String> provider5) {
        this.wallClockProvider = provider;
        this.clockProvider = provider2;
        this.configProvider = provider3;
        this.schemaManagerProvider = provider4;
        this.packageNameProvider = provider5;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> provider4, javax.inject.Provider<java.lang.String> provider5) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore newInstance(com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, java.lang.Object obj, java.lang.Object obj2, javax.inject.Provider<java.lang.String> provider) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore(clock, clock2, (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) obj, (com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager) obj2, provider);
    }
}
