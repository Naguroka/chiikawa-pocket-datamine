package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zze extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb<byte[]> {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzad zzap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zze(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzad zzadVar) {
        super(null);
        this.zzap = zzadVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(com.google.android.gms.internal.auth.zzz zzzVar) throws android.os.RemoteException {
        zzzVar.zza(new com.google.android.gms.auth.api.accounttransfer.zzf(this, this), this.zzap);
    }
}
