package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zat implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public final com.google.android.gms.common.api.Api zaa;
    private final boolean zab;
    private com.google.android.gms.common.api.internal.zau zac;

    public zat(com.google.android.gms.common.api.Api api, boolean z) {
        this.zaa = api;
        this.zab = z;
    }

    private final com.google.android.gms.common.api.internal.zau zab() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        zab().onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        zab().zaa(connectionResult, this.zaa, this.zab);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zab().onConnectionSuspended(i);
    }

    public final void zaa(com.google.android.gms.common.api.internal.zau zauVar) {
        this.zac = zauVar;
    }
}
