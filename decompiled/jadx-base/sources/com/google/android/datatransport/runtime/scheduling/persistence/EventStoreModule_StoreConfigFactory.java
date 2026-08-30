package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public final class EventStoreModule_StoreConfigFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> {
    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig get() {
        return storeConfig();
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory create() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.InstanceHolder.INSTANCE;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
        return (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.storeConfig());
    }

    private static final class InstanceHolder {
        private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory INSTANCE = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory();

        private InstanceHolder() {
        }
    }
}
