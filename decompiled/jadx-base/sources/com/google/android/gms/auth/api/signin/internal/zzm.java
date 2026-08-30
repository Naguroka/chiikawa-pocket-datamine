package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzm extends com.google.android.gms.auth.api.signin.internal.zzo<com.google.android.gms.common.api.Status> {
    zzm(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.auth.api.signin.internal.zzg zzgVar = (com.google.android.gms.auth.api.signin.internal.zzg) anyClient;
        ((com.google.android.gms.auth.api.signin.internal.zzu) zzgVar.getService()).zze(new com.google.android.gms.auth.api.signin.internal.zzn(this), zzgVar.zzg());
    }
}
