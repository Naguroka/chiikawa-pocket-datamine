package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: loaded from: classes4.dex */
public final class EventStoreModule_PackageNameFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<java.lang.String> {
    private final javax.inject.Provider<android.content.Context> contextProvider;

    public EventStoreModule_PackageNameFactory(javax.inject.Provider<android.content.Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public java.lang.String get() {
        return packageName(this.contextProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory(provider);
    }

    public static java.lang.String packageName(android.content.Context context) {
        return (java.lang.String) com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNullFromProvides(com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.packageName(context));
    }
}
