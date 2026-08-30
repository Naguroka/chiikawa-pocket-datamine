package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdq extends com.google.android.gms.internal.drive.zzea {
    private final /* synthetic */ boolean zzga = false;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdq(com.google.android.gms.internal.drive.zzdp zzdpVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, boolean z) {
        super(zzdpVar, googleApiClient, null);
        this.zzgq = zzdpVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzek(this.zzgq.zzk, this.zzga), new com.google.android.gms.internal.drive.zzdy(this));
    }
}
