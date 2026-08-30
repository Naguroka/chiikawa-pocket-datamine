package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaak implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
    private final java.lang.ref.WeakReference zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final boolean zac;

    public zaak(com.google.android.gms.common.api.internal.zaau zaauVar, com.google.android.gms.common.api.Api api, boolean z) {
        this.zaa = new java.lang.ref.WeakReference(zaauVar);
        this.zab = api;
        this.zac = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.api.internal.zaau zaauVar = (com.google.android.gms.common.api.internal.zaau) this.zaa.get();
        if (zaauVar == null) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(android.os.Looper.myLooper() == zaauVar.zaa.zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaauVar.zab.lock();
        try {
            if (zaauVar.zaG(0)) {
                if (!connectionResult.isSuccess()) {
                    zaauVar.zaE(connectionResult, this.zab, this.zac);
                }
                if (zaauVar.zaH()) {
                    zaauVar.zaF();
                }
            }
        } finally {
            zaauVar.zab.unlock();
        }
    }
}
