package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaaz implements com.google.android.gms.common.api.ResultCallback {
    final /* synthetic */ com.google.android.gms.common.api.internal.StatusPendingResult zaa;
    final /* synthetic */ boolean zab;
    final /* synthetic */ com.google.android.gms.common.api.GoogleApiClient zac;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabc zad;

    zaaz(com.google.android.gms.common.api.internal.zabc zabcVar, com.google.android.gms.common.api.internal.StatusPendingResult statusPendingResult, boolean z, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        this.zaa = statusPendingResult;
        this.zab = z;
        this.zac = googleApiClient;
        this.zad = zabcVar;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(com.google.android.gms.common.api.Result result) {
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) result;
        com.google.android.gms.auth.api.signin.internal.Storage.getInstance(this.zad.zan).zac();
        if (status.isSuccess() && this.zad.isConnected()) {
            com.google.android.gms.common.api.internal.zabc zabcVar = this.zad;
            zabcVar.disconnect();
            zabcVar.connect();
        }
        this.zaa.setResult(status);
        if (this.zab) {
            this.zac.disconnect();
        }
    }
}
