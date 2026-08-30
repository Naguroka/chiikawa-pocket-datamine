package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabo zaa;

    zabk(com.google.android.gms.common.api.internal.zabo zaboVar) {
        this.zaa = zaboVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zaH();
    }
}
