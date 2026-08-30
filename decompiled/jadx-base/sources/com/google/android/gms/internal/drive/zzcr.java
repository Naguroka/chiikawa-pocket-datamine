package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzcr extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzcr(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.DriveResource driveResource) {
        this.zzfq = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        if (!zzawVar.zzec) {
            throw new java.lang.IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        }
        ((com.google.android.gms.internal.drive.zzeo) zzawVar.getService()).zza(new com.google.android.gms.internal.drive.zzj(1, this.zzfq.getDriveId()), (com.google.android.gms.internal.drive.zzes) null, (java.lang.String) null, new com.google.android.gms.internal.drive.zzhr(taskCompletionSource));
    }
}
