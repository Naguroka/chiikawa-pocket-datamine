package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public final class EventStoreModule_DbNameFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.String> {
    @Override // javax.inject.Provider
    public java.lang.String get() {
        return dbName();
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory create() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.InstanceHolder.INSTANCE;
    }

    public static java.lang.String dbName() {
        return (java.lang.String) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.dbName());
    }

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory INSTANCE = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory();

        private InstanceHolder() {
        }
    }
}
