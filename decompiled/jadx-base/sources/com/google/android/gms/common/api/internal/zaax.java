package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaax implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zab;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabc zac;

    zaax(com.google.android.gms.common.api.internal.zabc zabcVar, java.util.concurrent.atomic.AtomicReference atomicReference, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult) {
        this.zaa = atomicReference;
        this.zab = statusPendingResult;
        this.zac = zabcVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zac.zam((com.google.android.gms.common.api.GoogleApiClient) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.GoogleApiClient) this.zaa.get()), this.zab, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
