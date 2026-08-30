package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzcs extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.DriveResource zzfq;

    zzcs(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.DriveResource driveResource) {
        this.zzfq = driveResource;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgs(this.zzfq.getDriveId(), 1), (com.google.android.gms.internal.drive.zzes) null, (java.lang.String) null, new com.google.android.gms.internal.drive.zzhr(taskCompletionSource));
    }
}
