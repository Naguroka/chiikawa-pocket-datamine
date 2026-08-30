package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zacq zaa;

    zacn(com.google.android.gms.common.api.internal.zacq zacqVar) {
        this.zaa = zacqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zah.zae(new com.google.android.gms.common.ConnectionResult(4));
    }
}
