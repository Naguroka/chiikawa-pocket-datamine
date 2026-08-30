package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzbg extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.drive.zzaw, android.content.IntentSender> {
    private final /* synthetic */ com.google.android.gms.drive.CreateFileActivityOptions zzer;

    zzbg(com.google.android.gms.internal.drive.zzbb zzbbVar, com.google.android.gms.drive.CreateFileActivityOptions createFileActivityOptions) {
        this.zzer = createFileActivityOptions;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<android.content.IntentSender> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) anyClient;
        com.google.android.gms.internal.drive.zzeo zzeoVar = (com.google.android.gms.internal.drive.zzeo) zzawVar.getService();
        this.zzer.zzde.zza(zzawVar.getContext());
        taskCompletionSource.setResult(zzeoVar.zza(new com.google.android.gms.internal.drive.zzu(this.zzer.zzde, this.zzer.zzdk.intValue(), this.zzer.zzba, this.zzer.zzbd, java.lang.Integer.valueOf(this.zzer.zzdl))));
    }
}
