package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbj extends com.google.android.gms.internal.drive.zzam {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(com.google.android.gms.internal.drive.zzbi zzbiVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzev = zzbiVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgj(this.zzev.getDriveId(), 536870912, this.zzev.zzes.getRequestId()), new com.google.android.gms.internal.drive.zzgl(this, null));
    }
}
