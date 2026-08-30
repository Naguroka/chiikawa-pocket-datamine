package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzk extends com.google.android.gms.internal.auth.zzs {
    private final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc zzay;

    zzk(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc zzcVar) {
        this.zzay = zzcVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zzd() {
        this.zzay.setResult(null);
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void onFailure(com.google.android.gms.common.api.Status status) {
        this.zzay.zza(status);
    }
}
