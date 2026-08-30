package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzn extends com.google.android.gms.auth.api.signin.internal.zzc {
    private final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzm zzbm;

    zzn(com.google.android.gms.auth.api.signin.internal.zzm zzmVar) {
        this.zzbm = zzmVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zzf(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzbm.setResult(status);
    }
}
