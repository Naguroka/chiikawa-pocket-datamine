package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zaas implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaau zab;

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zab.lock();
        try {
            try {
                if (!java.lang.Thread.interrupted()) {
                    zaa();
                }
            } catch (java.lang.RuntimeException e) {
                this.zab.zaa.zam(e);
            }
        } finally {
            this.zab.zab.unlock();
        }
    }

    protected abstract void zaa();
}
