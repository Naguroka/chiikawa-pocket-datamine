package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdf extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;
    private final /* synthetic */ java.util.List zzgb;

    zzdf(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.DriveResource driveResource, java.util.List list) {
        this.zzfq = driveResource;
        this.zzgb = list;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgw(this.zzfq.getDriveId(), this.zzgb), new com.google.android.gms.internal.drive.zzhr(taskCompletionSource));
    }
}
