package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zav implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaz zaa;

    zav(com.google.android.gms.common.api.internal.zaz zazVar) {
        this.zaa = zazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zaa.zam.lock();
        try {
            com.google.android.gms.common.api.internal.zaz.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }
}
