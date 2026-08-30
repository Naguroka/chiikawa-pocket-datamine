package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
public interface TransportBackend {
    com.google.android.datatransport.runtime.EventInternal decorate(com.google.android.datatransport.runtime.EventInternal eventInternal);

    com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest backendRequest);
}
