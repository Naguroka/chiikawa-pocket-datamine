package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzm extends com.google.android.gms.internal.auth.zzn {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzl zzag;

    zzm(com.google.android.gms.internal.auth.zzl zzlVar) {
        this.zzag = zzlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzn, com.google.android.gms.auth.account.zza
    public final void zza(boolean z) {
        this.zzag.setResult(new com.google.android.gms.internal.auth.zzq(z ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.internal.auth.zzh.zzad));
    }
}
