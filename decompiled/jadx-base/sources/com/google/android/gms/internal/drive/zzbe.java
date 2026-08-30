package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbe extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, java.lang.Void> {
    private final /* synthetic */ com.google.android.gms.drive.TransferPreferences zzep;

    zzbe(com.google.android.gms.internal.drive.zzbb zzbbVar, com.google.android.gms.drive.TransferPreferences transferPreferences) {
        this.zzep = transferPreferences;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        ((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgu(new com.google.android.gms.internal.drive.zzei(this.zzep)), new com.google.android.gms.internal.drive.zzhr(taskCompletionSource));
    }
}
