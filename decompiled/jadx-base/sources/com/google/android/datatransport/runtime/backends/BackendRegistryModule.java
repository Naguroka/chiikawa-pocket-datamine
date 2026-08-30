package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.datatransport.runtime.dagger.Module
public abstract class BackendRegistryModule {
    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry metadataBackendRegistry);
}
