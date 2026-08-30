package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzd extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzaf zzao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzd(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzaf zzafVar) {
        super(null);
        this.zzao = zzafVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(com.google.android.gms.internal.auth.zzz zzzVar) throws android.os.RemoteException {
        zzzVar.zza(this.zzax, this.zzao);
    }
}
