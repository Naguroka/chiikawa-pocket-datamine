package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public final class SchemaManager_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> {
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<java.lang.String> dbNameProvider;
    private final javax.inject.Provider<java.lang.Integer> schemaVersionProvider;

    public SchemaManager_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<java.lang.String> provider2, javax.inject.Provider<java.lang.Integer> provider3) {
        this.contextProvider = provider;
        this.dbNameProvider = provider2;
        this.schemaVersionProvider = provider3;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<java.lang.String> provider2, javax.inject.Provider<java.lang.Integer> provider3) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory(provider, provider2, provider3);
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager newInstance(android.content.Context context, java.lang.String str, int i) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager(context, str, i);
    }
}
