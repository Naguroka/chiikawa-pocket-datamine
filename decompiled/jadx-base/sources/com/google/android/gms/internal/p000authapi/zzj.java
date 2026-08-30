package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
final class zzj extends com.google.android.gms.internal.p000authapi.zzp<com.google.android.gms.auth.api.credentials.CredentialRequestResult> {
    private final /* synthetic */ com.google.android.gms.auth.api.credentials.CredentialRequest zzam;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(com.google.android.gms.internal.p000authapi.zzi zziVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) {
        super(googleApiClient);
        this.zzam = credentialRequest;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzp
    protected final void zzc(android.content.Context context, com.google.android.gms.internal.p000authapi.zzw zzwVar) throws android.os.RemoteException {
        zzwVar.zzc(new com.google.android.gms.internal.p000authapi.zzk(this), this.zzam);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.internal.p000authapi.zzh.zzd(status);
    }
}
