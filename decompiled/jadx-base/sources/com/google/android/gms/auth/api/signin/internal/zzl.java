package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzl extends com.google.android.gms.auth.api.signin.internal.zzc {
    private final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzk zzbl;

    zzl(com.google.android.gms.auth.api.signin.internal.zzk zzkVar) {
        this.zzbl = zzkVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zze(com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        this.zzbl.setResult(status);
    }
}
