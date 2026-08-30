package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaay implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;

    zaay(com.google.android.gms.common.api.internal.zabc zabcVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult) {
        this.zaa = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa.setResult(new com.google.android.gms.common.api.Status(8));
    }
}
