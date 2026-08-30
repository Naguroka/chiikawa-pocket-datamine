package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzaq extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult, com.google.android.gms.internal.auth.zzak> {
    public zzaq(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.auth.api.AuthProxy.API, googleApiClient);
    }

    protected abstract void zza(android.content.Context context, com.google.android.gms.internal.auth.zzan zzanVar) throws android.os.RemoteException;

    protected static com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult zzc(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.auth.zzax(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.auth.zzak zzakVar = (com.google.android.gms.internal.auth.zzak) anyClient;
        zza(zzakVar.getContext(), (com.google.android.gms.internal.auth.zzan) zzakVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return zzc(status);
    }
}
