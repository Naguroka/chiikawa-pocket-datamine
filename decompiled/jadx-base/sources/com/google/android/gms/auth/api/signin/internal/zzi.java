package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzi extends com.google.android.gms.auth.api.signin.internal.zzo<com.google.android.gms.auth.api.signin.GoogleSignInResult> {
    final /* synthetic */ android.content.Context val$context;
    final /* synthetic */ com.google.android.gms.auth.api.signin.GoogleSignInOptions zzbj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        super(googleApiClient);
        this.val$context = context;
        this.zzbj = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.auth.api.signin.internal.zzu) ((com.google.android.gms.auth.api.signin.internal.zzg) anyClient).getService()).zzc(new com.google.android.gms.auth.api.signin.internal.zzj(this), this.zzbj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(null, status);
    }
}
