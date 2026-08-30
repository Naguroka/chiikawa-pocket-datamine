package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbf extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, android.content.IntentSender> {
    private final /* synthetic */ com.google.android.gms.drive.OpenFileActivityOptions zzeq;

    zzbf(com.google.android.gms.internal.drive.zzbb zzbbVar, com.google.android.gms.drive.OpenFileActivityOptions openFileActivityOptions) {
        this.zzeq = openFileActivityOptions;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<android.content.IntentSender> taskCompletionSource) throws android.os.RemoteException {
        taskCompletionSource.setResult(((com.google.android.gms.internal.drive.zzeo) ((com.google.android.gms.internal.drive.zzaw) anyClient).getService()).zza(new com.google.android.gms.internal.drive.zzgm(this.zzeq.zzba, this.zzeq.zzbb, this.zzeq.zzbd, this.zzeq.zzbe)));
    }
}
