package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzj extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzab zzau;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzab zzabVar) {
        super(null);
        this.zzau = zzabVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(com.google.android.gms.internal.auth.zzz zzzVar) throws android.os.RemoteException {
        zzzVar.zza(this.zzax, this.zzau);
    }
}
