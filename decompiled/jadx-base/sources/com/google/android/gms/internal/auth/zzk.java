package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzk extends com.google.android.gms.internal.auth.zzn {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzj zzaf;

    zzk(com.google.android.gms.internal.auth.zzj zzjVar) {
        this.zzaf = zzjVar;
    }

    @Override // com.google.android.gms.internal.auth.zzn, com.google.android.gms.auth.account.zza
    public final void zzc(android.accounts.Account account) {
        this.zzaf.setResult(new com.google.android.gms.internal.auth.zzo(account != null ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.internal.auth.zzh.zzad, account));
    }
}
