package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbk extends com.google.android.gms.internal.drive.zzav {
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbi zzev;
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzew;
    private final /* synthetic */ com.google.android.gms.drive.zzn zzex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(com.google.android.gms.internal.drive.zzbi zzbiVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.zzn zznVar) {
        super(googleApiClient);
        this.zzev = zzbiVar;
        this.zzew = metadataChangeSet;
        this.zzex = zznVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        this.zzew.zzq().zza(zzawVar.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzm(this.zzev.zzes.getDriveId(), this.zzew.zzq(), this.zzev.zzes.getRequestId(), this.zzev.zzes.zzb(), this.zzex), new com.google.android.gms.internal.drive.zzgy(this));
    }
}
