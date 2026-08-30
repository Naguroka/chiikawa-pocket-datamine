package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzaj extends com.google.android.gms.internal.drive.zzav {
    zzaj(com.google.android.gms.internal.drive.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgy(this));
    }
}
