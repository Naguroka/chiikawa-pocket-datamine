package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzai extends com.google.android.gms.internal.drive.zzap {
    private final /* synthetic */ java.lang.String zzdw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzai(com.google.android.gms.internal.drive.zzaf zzafVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        super(googleApiClient);
        this.zzdw = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzek(com.google.android.gms.drive.DriveId.zza(this.zzdw), false), new com.google.android.gms.internal.drive.zzan(this));
    }
}
