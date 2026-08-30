package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
final class zzl extends com.google.android.gms.internal.p000authapi.zzp<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.auth.api.credentials.Credential zzao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzl(com.google.android.gms.internal.p000authapi.zzi zziVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.Credential credential) {
        super(googleApiClient);
        this.zzao = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzp
    protected final void zzc(android.content.Context context, com.google.android.gms.internal.p000authapi.zzw zzwVar) throws android.os.RemoteException {
        zzwVar.zzc(new com.google.android.gms.internal.p000authapi.zzo(this), new com.google.android.gms.internal.p000authapi.zzy(this.zzao));
    }
}
