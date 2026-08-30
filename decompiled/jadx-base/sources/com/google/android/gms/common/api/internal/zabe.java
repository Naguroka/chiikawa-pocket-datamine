package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zabe {
    private final com.google.android.gms.common.api.internal.zabd zaa;

    protected zabe(com.google.android.gms.common.api.internal.zabd zabdVar) {
        this.zaa = zabdVar;
    }

    protected abstract void zaa();

    public final void zab(com.google.android.gms.common.api.internal.zabg zabgVar) {
        zabgVar.zai.lock();
        try {
            if (zabgVar.zan == this.zaa) {
                zaa();
            }
        } finally {
            zabgVar.zai.unlock();
        }
    }
}
