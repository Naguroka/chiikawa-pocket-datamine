package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzj extends com.google.android.gms.auth.api.signin.internal.zzc {
    private final /* synthetic */ com.google.android.gms.auth.api.signin.internal.zzi zzbk;

    zzj(com.google.android.gms.auth.api.signin.internal.zzi zziVar) {
        this.zzbk = zziVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzs
    public final void zzc(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) throws android.os.RemoteException {
        if (googleSignInAccount != null) {
            com.google.android.gms.auth.api.signin.internal.zzp.zzd(this.zzbk.val$context).zzc(this.zzbk.zzbj, googleSignInAccount);
        }
        this.zzbk.setResult(new com.google.android.gms.auth.api.signin.GoogleSignInResult(googleSignInAccount, status));
    }
}
