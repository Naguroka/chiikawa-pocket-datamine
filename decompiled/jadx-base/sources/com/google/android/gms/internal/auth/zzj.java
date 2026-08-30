package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzj extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult, com.google.android.gms.internal.auth.zzr> {
    private final /* synthetic */ java.lang.String zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(com.google.android.gms.internal.auth.zzh zzhVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zzq = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.auth.account.zzc) ((com.google.android.gms.internal.auth.zzr) anyClient).getService()).zza(new com.google.android.gms.internal.auth.zzk(this), this.zzq);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzo(status, null);
    }
}
