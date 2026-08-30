package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zaba extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabc zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaba(com.google.android.gms.common.api.internal.zabc zabcVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            com.google.android.gms.common.api.internal.zabc.zaj(this.zaa);
            return;
        }
        if (i == 2) {
            com.google.android.gms.common.api.internal.zabc.zai(this.zaa);
            return;
        }
        android.util.Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
    }
}
