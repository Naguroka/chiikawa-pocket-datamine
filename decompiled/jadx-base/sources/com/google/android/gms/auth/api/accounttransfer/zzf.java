package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzf extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zza<byte[]> {
    private final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zze zzaq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(com.google.android.gms.auth.api.accounttransfer.zze zzeVar, com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb zzbVar) {
        super(zzbVar);
        this.zzaq = zzeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(byte[] bArr) {
        this.zzaq.setResult(bArr);
    }
}
