package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdr extends com.google.android.gms.internal.drive.zzar {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdr(com.google.android.gms.internal.drive.zzdp zzdpVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzgq = zzdpVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzex(this.zzgq.zzk), new com.google.android.gms.internal.drive.zzdx(this));
    }
}
