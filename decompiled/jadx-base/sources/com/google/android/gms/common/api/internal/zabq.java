package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.ConnectionResult zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabr zab;

    zabq(com.google.android.gms.common.api.internal.zabr zabrVar, com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zaa = connectionResult;
        this.zab = zabrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zabr zabrVar = this.zab;
        com.google.android.gms.common.api.internal.zabo zaboVar = (com.google.android.gms.common.api.internal.zabo) zabrVar.zaa.zao.get(zabrVar.zac);
        if (zaboVar == null) {
            return;
        }
        if (!this.zaa.isSuccess()) {
            zaboVar.zar(this.zaa, null);
            return;
        }
        this.zab.zaf = true;
        if (this.zab.zab.requiresSignIn()) {
            this.zab.zah();
            return;
        }
        try {
            com.google.android.gms.common.api.internal.zabr zabrVar2 = this.zab;
            zabrVar2.zab.getRemoteService(null, zabrVar2.zab.getScopesForConnectionlessNonSignIn());
        } catch (java.lang.SecurityException e) {
            android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.zab.zab.disconnect("Failed to get service from broker.");
            zaboVar.zar(new com.google.android.gms.common.ConnectionResult(10), null);
        }
    }
}
