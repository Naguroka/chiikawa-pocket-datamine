package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes4.dex */
public class CctBackendFactory implements com.google.android.datatransport.runtime.backends.BackendFactory {
    @Override // com.google.android.datatransport.runtime.backends.BackendFactory
    public com.google.android.datatransport.runtime.backends.TransportBackend create(com.google.android.datatransport.runtime.backends.CreationContext creationContext) {
        return new com.google.android.datatransport.cct.CctTransportBackend(creationContext.getApplicationContext(), creationContext.getWallClock(), creationContext.getMonotonicClock());
    }
}
