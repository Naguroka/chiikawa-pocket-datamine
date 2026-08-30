package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabn zaa;

    zabm(com.google.android.gms.common.api.internal.zabn zabnVar) {
        this.zaa = zabnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zabo zaboVar = this.zaa.zaa;
        zaboVar.zac.disconnect(java.lang.String.valueOf(zaboVar.zac.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
