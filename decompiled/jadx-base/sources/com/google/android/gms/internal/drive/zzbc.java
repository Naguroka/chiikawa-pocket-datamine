package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbc extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, com.google.android.gms.drive.DriveId> {
    private final /* synthetic */ java.lang.String zzdw;

    zzbc(com.google.android.gms.internal.drive.zzbb zzbbVar, java.lang.String str) {
        this.zzdw = str;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<com.google.android.gms.drive.DriveId> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzek(com.google.android.gms.drive.DriveId.zza(this.zzdw), false), new com.google.android.gms.internal.drive.zzhl(taskCompletionSource));
    }
}
