package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaco implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.signin.internal.zak zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zacq zab;

    zaco(com.google.android.gms.common.api.internal.zacq zacqVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.zaa = zakVar;
        this.zab = zacqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zacq.zad(this.zab, this.zaa);
    }
}
