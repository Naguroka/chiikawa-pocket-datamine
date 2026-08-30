package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzat extends com.google.android.gms.internal.auth.zzaj {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzas zzcf;

    zzat(com.google.android.gms.internal.auth.zzas zzasVar) {
        this.zzcf = zzasVar;
    }

    @Override // com.google.android.gms.internal.auth.zzaj, com.google.android.gms.internal.auth.zzal
    public final void zza(com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse) {
        this.zzcf.setResult(new com.google.android.gms.internal.auth.zzaw(proxyResponse));
    }
}
