package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public final class EventStoreModule_SchemaVersionFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.Integer> {
    @Override // javax.inject.Provider
    public java.lang.Integer get() {
        return java.lang.Integer.valueOf(schemaVersion());
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory create() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.InstanceHolder.INSTANCE;
    }

    public static int schemaVersion() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.schemaVersion();
    }

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory INSTANCE = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory();

        private InstanceHolder() {
        }
    }
}
