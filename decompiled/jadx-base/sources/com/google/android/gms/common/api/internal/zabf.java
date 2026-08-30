package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabf extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabg zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabf(com.google.android.gms.common.api.internal.zabg zabgVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabgVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            ((com.google.android.gms.common.api.internal.zabe) message.obj).zab(this.zaa);
        } else {
            if (i == 2) {
                throw ((java.lang.RuntimeException) message.obj);
            }
            android.util.Log.w("GACStateManager", "Unknown message id: " + message.what);
        }
    }
}
