package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zah implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.common.api.internal.ConnectionCallbacks zaa;

    zah(com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks) {
        this.zaa = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zaa.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zaa.onConnectionSuspended(i);
    }
}
