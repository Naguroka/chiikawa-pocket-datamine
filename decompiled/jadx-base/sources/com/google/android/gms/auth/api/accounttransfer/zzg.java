package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzg extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> {
    private final /* synthetic */ com.google.android.gms.internal.auth.zzv zzar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzg(com.google.android.gms.auth.api.accounttransfer.AccountTransferClient accountTransferClient, com.google.android.gms.internal.auth.zzv zzvVar) {
        super(null);
        this.zzar = zzvVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb
    protected final void zza(com.google.android.gms.internal.auth.zzz zzzVar) throws android.os.RemoteException {
        zzzVar.zza(new com.google.android.gms.auth.api.accounttransfer.zzh(this, this), this.zzar);
    }
}
