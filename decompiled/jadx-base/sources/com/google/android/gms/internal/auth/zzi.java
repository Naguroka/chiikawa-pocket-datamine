package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzi extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.common.api.Result, com.google.android.gms.internal.auth.zzr> {
    private final /* synthetic */ boolean zzae;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(com.google.android.gms.internal.auth.zzh zzhVar, com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        super((com.google.android.gms.common.api.Api<?>) api, googleApiClient);
        this.zzae = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzp(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.auth.account.zzc) ((com.google.android.gms.internal.auth.zzr) anyClient).getService()).zzb(this.zzae);
        setResult(new com.google.android.gms.internal.auth.zzp(com.google.android.gms.common.api.Status.RESULT_SUCCESS));
    }
}
