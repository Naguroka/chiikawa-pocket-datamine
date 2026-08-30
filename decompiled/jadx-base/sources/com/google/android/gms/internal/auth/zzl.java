package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.common.api.Result, com.google.android.gms.internal.auth.zzr> {
    private final /* synthetic */ android.accounts.Account zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzl(com.google.android.gms.internal.auth.zzh zzhVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.accounts.Account account) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zzo = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzq(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.auth.account.zzc) ((com.google.android.gms.internal.auth.zzr) anyClient).getService()).zza(new com.google.android.gms.internal.auth.zzm(this), this.zzo);
    }
}
