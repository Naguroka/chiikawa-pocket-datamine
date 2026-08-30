package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaar implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaau zaa;

    /* synthetic */ zaar(com.google.android.gms.common.api.internal.zaau zaauVar, com.google.android.gms.common.api.internal.zaat zaatVar) {
        this.zaa = zaauVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        ((com.google.android.gms.signin.zae) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.zak)).zad(new com.google.android.gms.common.api.internal.zaaq(this.zaa));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.zab.lock();
        try {
            if (this.zaa.zaI(connectionResult)) {
                this.zaa.zaA();
                this.zaa.zaF();
            } else {
                this.zaa.zaD(connectionResult);
            }
        } finally {
            this.zaa.zab.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
