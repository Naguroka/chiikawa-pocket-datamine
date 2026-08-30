package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzcd extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzei zzfl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcd(com.google.android.gms.internal.drive.zzcb zzcbVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.internal.drive.zzei zzeiVar) {
        super(googleApiClient);
        this.zzfl = zzeiVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgu(this.zzfl), new com.google.android.gms.internal.drive.zzgy(this));
    }
}
