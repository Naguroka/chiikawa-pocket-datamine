package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdd extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.Metadata> {
    private final /* synthetic */ com.google.android.gms.drive.MetadataChangeSet zzfd;
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzdd(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.MetadataChangeSet metadataChangeSet, com.google.android.gms.drive.DriveResource driveResource) {
        this.zzfd = metadataChangeSet;
        this.zzfq = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.Metadata> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        this.zzfd.zzq().zza(zzawVar.getContext());
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzhf(this.zzfq.getDriveId(), this.zzfd.zzq()), new com.google.android.gms.internal.drive.zzhp(taskCompletionSource));
    }
}
