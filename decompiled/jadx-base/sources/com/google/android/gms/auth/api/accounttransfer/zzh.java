package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
final class zzh extends com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zza<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> {
    private final /* synthetic */ com.google.android.gms.auth.api.accounttransfer.zzg zzas;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(com.google.android.gms.auth.api.accounttransfer.zzg zzgVar, com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb zzbVar) {
        super(zzbVar);
        this.zzas = zzgVar;
    }

    @Override // com.google.android.gms.internal.auth.zzs, com.google.android.gms.internal.auth.zzx
    public final void zza(com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) {
        this.zzas.setResult(deviceMetaData);
    }
}
