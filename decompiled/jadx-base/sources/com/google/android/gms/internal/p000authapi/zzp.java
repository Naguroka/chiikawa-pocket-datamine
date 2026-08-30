package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzp<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.p000authapi.zzr> {
    zzp(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.Auth.CREDENTIALS_API, googleApiClient);
    }

    protected abstract void zzc(android.content.Context context, com.google.android.gms.internal.p000authapi.zzw zzwVar) throws android.os.RemoteException;

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.p000authapi.zzr zzrVar = (com.google.android.gms.internal.p000authapi.zzr) anyClient;
        zzc(zzrVar.getContext(), (com.google.android.gms.internal.p000authapi.zzw) zzrVar.getService());
    }
}
