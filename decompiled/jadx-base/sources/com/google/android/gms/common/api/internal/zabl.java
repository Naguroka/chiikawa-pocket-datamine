package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabl implements java.lang.Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabo zab;

    zabl(com.google.android.gms.common.api.internal.zabo zaboVar, int i) {
        this.zaa = i;
        this.zab = zaboVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
