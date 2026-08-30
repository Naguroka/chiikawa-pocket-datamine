package com.google.android.gms.internal.p001authapiphone;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzm extends com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.internal.p001authapiphone.zzi, java.lang.Void> {
    private com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> zzf;

    private zzm() {
    }

    /* synthetic */ zzm(com.google.android.gms.internal.p001authapiphone.zzk zzkVar) {
        this();
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected /* synthetic */ void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException {
        this.zzf = taskCompletionSource;
        zza((com.google.android.gms.internal.p001authapiphone.zze) ((com.google.android.gms.internal.p001authapiphone.zzi) anyClient).getService());
    }

    protected abstract void zza(com.google.android.gms.internal.p001authapiphone.zze zzeVar) throws android.os.RemoteException;

    protected final void zzb(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, this.zzf);
    }
}
