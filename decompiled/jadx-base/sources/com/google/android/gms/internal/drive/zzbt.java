package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbt extends com.google.android.gms.internal.drive.zzby {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ int zzfe;
    private final /* synthetic */ int zzff;
    private final /* synthetic */ com.google.android.gms.drive.ExecutionOptions zzfg;
    private final /* synthetic */ com.google.android.gms.internal.drive.zzbs zzfh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbt(com.google.android.gms.internal.drive.zzbs zzbsVar, com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, int i, int i2, com.google.android.gms.drive.ExecutionOptions executionOptions) {
        super(googleApiClient);
        this.zzfh = zzbsVar;
        this.zzfd = metadataChangeSet;
        this.zzfe = i;
        this.zzff = i2;
        this.zzfg = executionOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        this.zzfd.zzq().zza(zzawVar.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzw(this.zzfh.getDriveId(), this.zzfd.zzq(), this.zzfe, this.zzff, this.zzfg), new com.google.android.gms.internal.drive.zzbv(this));
    }
}
