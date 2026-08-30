package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzau extends com.google.android.gms.internal.auth.zzaq {
    zzau(com.google.android.gms.internal.auth.zzar zzarVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.internal.auth.zzaq
    protected final void zza(android.content.Context context, com.google.android.gms.internal.auth.zzan zzanVar) throws android.os.RemoteException {
        zzanVar.zza(new com.google.android.gms.internal.auth.zzav(this));
    }
}
