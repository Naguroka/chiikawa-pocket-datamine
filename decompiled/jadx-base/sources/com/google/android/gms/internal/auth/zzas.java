package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzas extends com.google.android.gms.internal.auth.zzap {
    private final /* synthetic */ com.google.android.gms.auth.api.proxy.ProxyRequest zzce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzas(com.google.android.gms.internal.auth.zzar zzarVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) {
        super(googleApiClient);
        this.zzce = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.zzap
    protected final void zza(android.content.Context context, com.google.android.gms.internal.auth.zzan zzanVar) throws android.os.RemoteException {
        zzanVar.zza(new com.google.android.gms.internal.auth.zzat(this), this.zzce);
    }
}
