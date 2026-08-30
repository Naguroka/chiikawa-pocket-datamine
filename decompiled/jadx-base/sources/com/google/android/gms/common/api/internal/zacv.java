package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacv implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.Result zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zacx zab;

    zacv(com.google.android.gms.common.api.internal.zacx zacxVar, com.google.android.gms.common.api.Result result) {
        this.zaa = result;
        this.zab = zacxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.GoogleApiClient googleApiClient;
        try {
            try {
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(true);
                com.google.android.gms.common.api.PendingResult pendingResultOnSuccess = ((com.google.android.gms.common.api.ResultTransform) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zab.zaa)).onSuccess(this.zaa);
                com.google.android.gms.common.api.internal.zacx zacxVar = this.zab;
                zacxVar.zah.sendMessage(zacxVar.zah.obtainMessage(0, pendingResultOnSuccess));
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(false);
                com.google.android.gms.common.api.internal.zacx zacxVar2 = this.zab;
                com.google.android.gms.common.api.internal.zacx.zan(this.zaa);
                googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) this.zab.zag.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.common.api.internal.zacx zacxVar3 = this.zab;
                zacxVar3.zah.sendMessage(zacxVar3.zah.obtainMessage(1, e));
                com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(false);
                com.google.android.gms.common.api.internal.zacx zacxVar4 = this.zab;
                com.google.android.gms.common.api.internal.zacx.zan(this.zaa);
                googleApiClient = (com.google.android.gms.common.api.GoogleApiClient) this.zab.zag.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.zap(this.zab);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.common.api.internal.BasePendingResult.zaa.set(false);
            com.google.android.gms.common.api.internal.zacx zacxVar5 = this.zab;
            com.google.android.gms.common.api.internal.zacx.zan(this.zaa);
            com.google.android.gms.common.api.GoogleApiClient googleApiClient2 = (com.google.android.gms.common.api.GoogleApiClient) this.zab.zag.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zap(this.zab);
            }
            throw th;
        }
    }
}
